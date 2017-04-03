package calculator

import cucumber.api.DataTable
import neo4j.driver.reactive.impl.Neo4jReactiveSession
import neo4j.driver.reactive.interfaces.ReactiveSession
import neo4j.driver.testkit.EmbeddedTestkitSession
import org.neo4j.cypher.SyntaxException
import org.neo4j.driver.v1.Session

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object QueryCalculator {

  def calculateSideEffects(session: Session, query: String): DatabaseResult = {
    var sideEffectsMap = scala.collection.mutable.Map[String, Int]()
    val startNodes = session.run("MATCH (n) RETURN count(n) AS count").next().get("count").asInt
    val startRelationships = session.run("MATCH ()-[r]-() RETURN count(DISTINCT r) AS count").next().get("count").asInt
    val startLabels = session.run("MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count").next().get("count").asInt
    val startProperties = session.run("MATCH (n) RETURN count(properties(n)) AS count").next().get("count").asInt
    session.beginTransaction()
    val sessionResult = session.run(query)
    val diffNodes = session.run("MATCH (n) RETURN count(n) AS count").next().get("count").asInt - startNodes
    val diffRelationships = session.run("MATCH ()-[r]-() RETURN count(DISTINCT r) AS count").next().get("count").asInt - startRelationships
    val diffLabels = session.run("MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count").next().get("count").asInt - startLabels
    val diffProperties = session.run("MATCH (n) RETURN count(properties(n)) AS count").next().get("count").asInt - startProperties

    if(diffNodes != 0){
      if(diffNodes>0){
        sideEffectsMap+=Tuple2("+nodes", diffNodes)
      }else{
        sideEffectsMap+=Tuple2("-nodes", diffNodes)
      }
    }

    if(diffRelationships != 0){
      if(diffRelationships>0){
        sideEffectsMap+=Tuple2("+relationships",diffRelationships)
      }else{
        sideEffectsMap+=Tuple2("-relationships", diffRelationships)
      }
    }

    if(diffLabels != 0){
      if(diffLabels>0){
        sideEffectsMap+=Tuple2("+labels", diffLabels)
      }else{
        sideEffectsMap+=Tuple2("-labels", diffLabels)
      }
    }

    if(diffProperties != 0){
      if(diffProperties>0){
        sideEffectsMap+=Tuple2("+properties", diffProperties)
      }else{
        sideEffectsMap+=Tuple2("-properties", diffProperties)
      }
    }

    var unProcessedQueryResultsBuffer = asScalaBuffer(sessionResult.list())
    var queryResultsBuffer = ListBuffer[ListBuffer[String]]()

    if (unProcessedQueryResultsBuffer.nonEmpty) {
      var tmp = ListBuffer[String]()
      tmp ++= unProcessedQueryResultsBuffer.head.keys()
      queryResultsBuffer += tmp
    }
    for (i <- unProcessedQueryResultsBuffer.indices) {
      var tmp = ListBuffer[String]()
      var valueBuffer = ListBuffer[String]()
      for (value <- unProcessedQueryResultsBuffer(i).values()) {
        valueBuffer += value.toString
      }
      tmp ++= valueBuffer
      queryResultsBuffer += tmp
    }
    DatabaseResult(queryResultsBuffer, sideEffectsMap)

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

    for (i <- result.queryResult.indices) {
      result.queryResult(i) = result.queryResult(i).map(_.toUpperCase)
    }

    for (i <- expectedResult.indices) {
      expectedResult(i) = expectedResult(i).map(_.toUpperCase)
    }
    var isSame = false
    for (i <- expectedResult.indices) {
      isSame = false
      for (j <- result.queryResult.indices) {
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
