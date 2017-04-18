package calculator

import compiler.FeatureResultCompiler
import cucumber.api.DataTable
import org.neo4j.driver.internal.value._
import org.neo4j.driver.v1.{Session, Value}

import scala.collection.mutable.ListBuffer
import collection.JavaConverters._

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object QueryCalculator {


  def calculateSideEffects(session: Session, query: String): DatabaseResult = {
    lazy val queryResultsBuffer = ListBuffer[String]()
    lazy val sideEffectsMap = scala.collection.mutable.Map[String, (String, Int)]()
    sideEffectsMap += "nodes" -> ("MATCH (n) RETURN count(n) AS count", 0)
    sideEffectsMap += "relationships" -> ("MATCH ()-[r]-() RETURN count(DISTINCT r) AS count", 0)
    sideEffectsMap += "labels" -> ("MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count", 0)
    sideEffectsMap += "properties" -> ("MATCH (n) RETURN size(keys(n)) AS count", 0)

    sideEffectsMap.foreach(x => {
      val it = session.run(x._2._1)
      if (it.hasNext) sideEffectsMap(x._1) = (x._2._1, session.run(x._2._1).next().get("count").asInt())
      else sideEffectsMap(x._1) = (x._2._1, 0)
    }
    )

    session.beginTransaction()
    val sessionResult = session.run(query)

    sideEffectsMap.foreach(x => {
      val it = session.run(x._2._1)
      if (it.hasNext) {
        val diff = it.next().get("count").asInt() - x._2._2
        diff compare 0 match {
          case 1 => sideEffectsMap(x._1) = ("+" + x._1, diff)
          case -1 => sideEffectsMap(x._1) = ("-" + x._1, -diff)
          case 0 => sideEffectsMap -= x._1
        }
      } else {
        if (x._2._2 == 0)
          sideEffectsMap -= x._1
        else
          sideEffectsMap(x._1) = ("-" + x._1, x._2._2)
      }
    }
    )

    val unProcessedQueryResultsBuffer = sessionResult.list().asScala
    if (unProcessedQueryResultsBuffer.nonEmpty) {
      unProcessedQueryResultsBuffer.head.keys().asScala.foreach(x => queryResultsBuffer += x)
    }

    unProcessedQueryResultsBuffer.foreach(_.values().asScala.foreach(value => resultElementToStringBuffer(value, queryResultsBuffer)))

    DatabaseResult(queryResultsBuffer, sideEffectsMap.map(x => x._2._1 -> x._2._2))

  }

  def checkResultEqualiy(result: DatabaseResult, expectedDataTable: DataTable): Boolean = {
    val expectedResult = ListBuffer[String]()

    expectedDataTable.getGherkinRows.asScala.zipWithIndex foreach { case (el, i) =>
      if (i == 0) {
        expectedResult ++= el.getCells.asScala
      } else {
        el.getCells.asScala.foreach(x => resultElementToStringBuffer(FeatureResultCompiler.parseAndCompile(x), expectedResult))
      }
    }
    println("EXPECTED RESULT: ")
    expectedResult.foreach(println)
    println("QUERY RESULT: ")
    result.queryResult.foreach(println)
    //TODO megnezni, hogy miert igy kapom vissza a String-et : 'STRING'
    expectedResult.map(_.replace("'", "")).intersect(result.queryResult).size == expectedResult.size
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

  def resultElementToStringBuffer(resultElement: Value, resultStringBuffer: ListBuffer[String]): Unit = {
    resultElement match {
      case relationShipValue: RelationshipValue =>
        resultStringBuffer += relationShipValue.asRelationship().`type`()
      //TODO relationship propertyk listázása resultStringBuffer += relationShipValue.asRelationship().asMap.asScala.toList(x => x._1 + " : " + x._2)

      case booleanValue: BooleanValue =>
        resultStringBuffer += booleanValue.toString

      case _: NullValue =>
        resultStringBuffer += "null"

      case null =>
        resultStringBuffer += "null"

      case mapValue: MapValue =>
        resultStringBuffer += mapValue.asMap.toString

      case integerValue: IntegerValue =>
        resultStringBuffer += integerValue.toString

      case stringValue: StringValue =>
        resultStringBuffer += stringValue.asString

      case floatValue: FloatValue =>
        resultStringBuffer += floatValue.toString

      case nodeValue: NodeValue =>
        resultStringBuffer ++= nodeValue.asEntity().labels().asScala
        resultStringBuffer ++= nodeValue.asEntity().asMap.asScala.toList.map(x => x._1 + " : " + x._2)

      case listValue: ListValue =>
        listValue.values().asScala.foreach(x => resultElementToStringBuffer(x, resultStringBuffer))

    }
  }

}
