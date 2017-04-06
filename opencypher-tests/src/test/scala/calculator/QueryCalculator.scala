package calculator

import cucumber.api.DataTable
import org.neo4j.driver.v1.{Session}

import scala.collection.mutable.ListBuffer
import collection.JavaConverters._

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object QueryCalculator {

  def calculateSideEffects(session: Session, query: String): DatabaseResult = {

    val sideEffectsMap = scala.collection.mutable.Map[String, (String, Int)]()
    sideEffectsMap += "nodes" -> ("MATCH (n) RETURN count(n) AS count", 0)
    sideEffectsMap += "relationships" -> ("MATCH ()-[r]-() RETURN count(DISTINCT r) AS count", 0)
    sideEffectsMap += "labels" -> ("MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count", 0)
    sideEffectsMap += "properties" -> ("MATCH (n) RETURN count(properties(n)) AS count", 0)
    sideEffectsMap.foreach(x =>
      sideEffectsMap(x._1) = (x._2._1, session.run(x._2._1).next().get("count").asInt())
    )

    session.beginTransaction()
    val sessionResult = session.run(query)
    
    sideEffectsMap.foreach(x => {
      val diff = session.run(x._2._1).next().get("count").asInt() - x._2._2

      diff compare 0 match {
        case 1 => sideEffectsMap(x._1) = ("+" + x._1, diff)
        case -1 => sideEffectsMap(x._1) = ("-" + x._1, -diff)
        case 0 => sideEffectsMap -= x._1
      }
    }
    )


    val unProcessedQueryResultsBuffer = sessionResult.list().asScala
    val queryResultsBuffer = ListBuffer[ListBuffer[String]]()

    if (unProcessedQueryResultsBuffer.nonEmpty) {
      queryResultsBuffer :+ unProcessedQueryResultsBuffer.head.keys().asScala
    }

    unProcessedQueryResultsBuffer.foreach(x =>
      queryResultsBuffer :+ x.values().asScala.map(_.toString)
    )

    DatabaseResult(queryResultsBuffer, sideEffectsMap.map(x => x._2._1 -> x._2._2))

  }

  def checkResultEqualiy(result: DatabaseResult, dataTable: DataTable): Boolean = {
    val expectedResult = ListBuffer[ListBuffer[String]]()

    dataTable.getGherkinRows.asScala.foreach(x =>
      expectedResult :+ x.getCells.asScala.map(x => x.replace(''', '"'))
    )
    println("EXPECTED RESULT: ")
    expectedResult.foreach(println)
    println("QUERY RESULT: ")
    result.queryResult.foreach(println)

    result.queryResult.foreach(_.map(_.toUpperCase))
    expectedResult.foreach(_.map(_.toUpperCase))

    expectedResult.foreach(x => {
      var isSame = false
      result.queryResult.foreach(y => {

        if (x.size == x.intersect(y).size) {
          isSame = true
        }
      }
      )
      if (!isSame) return false

    })
    true
  }


  def checkSideEffectsEquality(result: DatabaseResult, expectedResult: Option[DataTable]): Boolean = {
    var expectedResultMap = collection.mutable.Map[String, Int]()
    println("result: ")
    result.sideEffect.foreach(println)
    expectedResult match {
      case Some(x) =>
        x.raw().asScala.foreach(x =>
          expectedResultMap += (x.get(0) -> x.get(1).toInt)
        )
        println("expected result: ")
        expectedResultMap.foreach(println)
        result.sideEffect == expectedResultMap
      case None => result.sideEffect.isEmpty
    }
  }


}
