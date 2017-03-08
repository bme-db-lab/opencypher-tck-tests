package calculator

import cucumber.api.DataTable
import neo4j.driver.reactive.Neo4jReactiveSession

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object QueryCalculator {

  def calculateSideEffects(session: Neo4jReactiveSession, query: String): DatabaseResult = {
    var sideEffects = scala.collection.mutable.Map[String, Int]()
    val queryList = List("nodes", "relationships", "labels", "properties")
    session.registerQuery("nodes", "MATCH (n) RETURN count(n) AS count")
    session.registerQuery("relationships", "MATCH ()-[r]-() RETURN count(DISTINCT r) AS count")
    session.registerQuery("labels", "MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count")
    session.registerQuery("properties", "MATCH (n) RETURN count(properties(n)) AS count")
    session.beginTransaction()
    val sessionResult = session.run(query)
    var unProcessedQueryResultsBuffer = asScalaBuffer(sessionResult.list())
    var queryResults = ListBuffer[ListBuffer[String]]()
    if (unProcessedQueryResultsBuffer(0).keys() != null) {
      var tmp = ListBuffer[String]()
      tmp ++= unProcessedQueryResultsBuffer(0).keys()
      queryResults += tmp
    }
    for (i <- 0 until unProcessedQueryResultsBuffer.size) {
      var tmp = ListBuffer[String]()
      var valueBuffer = ListBuffer[String]()
      for (value <- unProcessedQueryResultsBuffer(i).values()) {
        valueBuffer += value.toString.toLowerCase
        //TODO lowercase check
      }
      tmp ++= valueBuffer
      queryResults += tmp
    }

    for (query <- queryList) {
      var diff = calculateDifference(session, query)
      if (diff != null) {
        sideEffects += diff
      }
    }
    return DatabaseResult(queryResults, sideEffects)

  }

  def calculateDifference(session: Neo4jReactiveSession, queryName: String): (String, Int) = {
    val cs = session.getDeltas(queryName)
    if (!cs.getPositive.isEmpty) {
      return ("+" + queryName, cs.getPositive.iterator().next().get("count").asInt)
    } else if (!cs.getNegative.isEmpty) {
      return ("-" + queryName, cs.getNegative.iterator().next().get("count").asInt)
    }
    return null
  }

  def checkResultEqualiy(result: DatabaseResult, dataTable: DataTable): Boolean = {
    var expectedResult = ListBuffer[ListBuffer[String]]()
    for (rows <- dataTable.getGherkinRows) {
      var tmp = ListBuffer[String]()
      for (elem <- rows.getCells) {
        tmp += elem.toLowerCase.replace(''', '"')
      }
      expectedResult += tmp
    }
    println("EXPECTED RESULT: ")
    expectedResult.foreach(println)
    println("QUERY RESULT: ")
    result.queryResult.foreach(println)
    var isSame = true;
    for (i <- 0 until expectedResult.length) {
      isSame = expectedResult(i) sameElements result.queryResult(i)
    }
    return isSame
  }


  def checkSideEffectsEquality(result: DatabaseResult, expectedResult: Option[DataTable]): Boolean = {
    var expectedResultMap = collection.mutable.Map[String, Int]()
    expectedResult match {
      case Some(x) =>
        for (i <- 0 until x.raw().size()) {
          expectedResultMap += (x.raw.get(i).get(0) -> x.raw().get(i).get(1).toInt)
        }
        result.sideEffect.containsAll(expectedResultMap)
      case None => result.sideEffect.isEmpty
    }
  }


}
