package calculator

import cucumber.api.DataTable
import neo4j.driver.reactive.Neo4jReactiveSession

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object ResultCalculator {

  def calculateResult(session: Neo4jReactiveSession, query: String): Map[String, Int] = {
    var returnResults = collection.mutable.Map[String, Int]()
    session.registerQuery("nodes", "MATCH (n) RETURN count(n) AS count")
    session.registerQuery("relationships", "MATCH ()-[r]-() RETURN count(DISTINCT r) AS count")
    session.registerQuery("labels", "MATCH (n) UNWIND labels(n) AS label\nMATCH (n) WHERE label IN labels(n) RETURN count(DISTINCT label) AS count")
    session.registerQuery("properties", "MATCH (n) RETURN count(properties(n)) AS count")
    session.run(query)
    var cs = session.getDeltas("nodes");
    if (cs.getPositive.size() > 0) returnResults +=
  }

  def checkEquality(session: Neo4jReactiveSession, data: DataTable): Boolean = {

  }

}
