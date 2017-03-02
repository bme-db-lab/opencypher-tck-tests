package calculator

import cucumber.api.DataTable
import neo4j.driver.reactive.Neo4jReactiveSession
import collection.JavaConversions._

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
    session.run(query)
    for (query <- queryList) {
      var diff = calculateDifference(session, query)
      if (diff != null) {
        sideEffects += diff
      }
    }
    return DatabaseResult(null, sideEffects)

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

  def checkSideEffectsEquality(result: DatabaseResult, expectedResult: DataTable): Boolean = {
    var expectedResultMap = collection.mutable.Map[String, Int]()
    for(i <- 0 until expectedResult.raw().size()){
      expectedResultMap += (expectedResult.raw.get(i).get(0) -> expectedResult.raw().get(i).get(1).toInt)
    }
    return result.sideEffect.containsAll(expectedResultMap)
  }

}
