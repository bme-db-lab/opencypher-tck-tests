package calculator

import cucumber.api.DataTable
import neo4j.driver.reactive.Neo4jReactiveSession
import org.neo4j.cypher.SyntaxException

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object QueryCalculator {

  def calculateSideEffects(session: Neo4jReactiveSession, query: String): DatabaseResult = {
    var exceptionStackTrace = ""
    var queryResults = ListBuffer[ListBuffer[String]]()
    var sideEffects = scala.collection.mutable.Map[String, Int]()
    val queryList = List("nodes", "relationships", "labels", "properties")
    session.registerQuery("nodes", "MATCH (n) RETURN count(n) AS count")
    session.registerQuery("relationships", "MATCH ()-[r]-() RETURN count(DISTINCT r) AS count")
    session.registerQuery("labels", "MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count")
    session.registerQuery("properties", "MATCH (n) RETURN count(properties(n)) AS count")
    session.beginTransaction()
    try {
      val sessionResult = session.run(query)


      var unProcessedQueryResultsBuffer = asScalaBuffer(sessionResult.list())

      queryResults = ListBuffer[ListBuffer[String]]()

      if (unProcessedQueryResultsBuffer.nonEmpty) {
        var tmp = ListBuffer[String]()
        tmp ++= unProcessedQueryResultsBuffer(0).keys()
        queryResults += tmp
      }
      for (i <- unProcessedQueryResultsBuffer.indices) {
        var tmp = ListBuffer[String]()
        var valueBuffer = ListBuffer[String]()
        for (value <- unProcessedQueryResultsBuffer(i).values()) {
          valueBuffer += value.toString
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
    }
    catch {
      case syntax: SyntaxException => exceptionStackTrace = syntax.getStackTrace.toString;
    }
    return DatabaseResult(queryResults, sideEffects, exceptionStackTrace)

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
        tmp += elem.replace(''', '"')
      }
      expectedResult += tmp
    }
    println("EXPECTED RESULT: ")
    expectedResult.foreach(println)
    println("QUERY RESULT: ")
    result.queryResult.foreach(println)

    for (i <- 0 until result.queryResult.size) {
      result.queryResult(i) = result.queryResult(i).map(_.toUpperCase)
    }

    for (i <- 0 until expectedResult.size) {
      expectedResult(i) = expectedResult(i).map(_.toUpperCase)
    }
    var isSame = false
    for (i <- 0 until expectedResult.size) {
      isSame = false
      for (j <- 0 until result.queryResult.size) {
        if (expectedResult(i).size == expectedResult(i).intersect(result.queryResult(j)).size) {
          isSame = true
        }
      }
      if (!isSame) {
        return false
      }
    }
    true
  }


  def checkSideEffectsEquality(result: DatabaseResult, expectedResult: Option[DataTable]): Boolean = {
    var expectedResultMap = collection.mutable.Map[String, Int]()
    println("result: ")
    result.sideEffect.foreach(println)
    expectedResult match {
      case Some(x) =>
        for (i <- 0 until x.raw().size()) {
          expectedResultMap += (x.raw.get(i).get(0) -> x.raw().get(i).get(1).toInt)
        }
        println("expected result: ")
        expectedResultMap.foreach(println)
        result.sideEffect.containsAll(expectedResultMap)
      case None => result.sideEffect.isEmpty
    }
  }


}
