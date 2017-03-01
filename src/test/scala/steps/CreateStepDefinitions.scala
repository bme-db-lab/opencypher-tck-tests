package steps

import cucumber.api.{DataTable, PendingException}
import cucumber.api.scala.{EN, ScalaDsl}
import neo4j.driver.reactive.data.ChangeSet
import neo4j.driver.reactive.{Neo4jReactiveDriver, Neo4jReactiveSession}
import org.neo4j.driver.v1.{Session, Statement, StatementResult, Transaction}
import org.neo4j.graphdb.{GraphDatabaseService, Notification, Result}

/**
  * Created by Andras Zsamboki on 2017.02.23..
  */
class CreateStepDefinitions extends ScalaDsl with EN {
  var driver: Neo4jReactiveDriver = _
  var session: Neo4jReactiveSession = _

  Given("""^any graph$""") { () =>
    driver = new Neo4jReactiveDriver
  }

  When("""^executing query:$""") { (arg0: String) =>
    session = driver.session
    session.registerQuery("countVertices", "MATCH (n) RETURN n")
    session.registerQuery("countEdges", "MATCH ()-[r]-() RETURN r")
    val tx = session.beginTransaction()
    println("summary : " + tx.run(arg0))
    val cs = session.getDeltas("countVertices")
    println(cs.getPositive.size())
    println(cs.getNegative.size)
  }
  Then("""^the result should be empty$""") { () =>
    assert(true)
  }
  Then("""^the side effects should be:$""") { (arg0: DataTable) =>
    assert(true)
  }
}
