package steps

import calculator.{DatabaseResult, QueryCalculator}
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import neo4j.driver.reactive.Neo4jReactiveDriver

/**
  * Created by Andras Zsamboki on 2017.02.23..
  */
class CreateStepDefinitions extends ScalaDsl with EN {
  var driver: Neo4jReactiveDriver = _
  var result: DatabaseResult = _
  Given("""^any graph$""") { () =>
    driver = new Neo4jReactiveDriver
  }

  Given("""^an empty graph$""") { () =>
    driver = new Neo4jReactiveDriver
  }
  Given("""^having executed:$""") { (query: String) =>
    driver.session.run(query)
  }
  When("""^executing query:$""") { (query: String) =>
    result = QueryCalculator.calculateSideEffects(driver.session, query)
  }
  Then("""^the result should be empty$""") { () =>
    //assert(result.queryResult.isEmpty)
  }
  Then("""^the side effects should be:$""") { (dataTable: DataTable) =>
    assert(QueryCalculator.checkSideEffectsEquality(result, Option(dataTable)))
  }

  Then("""^the result should be:$""") { (dataTable: DataTable) =>
    assert(QueryCalculator.checkResultEqualiy(result, dataTable))
  }
  Then("""^no side effects$""") { () =>
     assert(QueryCalculator.checkSideEffectsEquality(result, None))
  }
  Then("""^the result should be, in order:$"""){ (dataTable:DataTable) =>
    assert(QueryCalculator.checkResultEqualiy(result, dataTable))
  }
}
