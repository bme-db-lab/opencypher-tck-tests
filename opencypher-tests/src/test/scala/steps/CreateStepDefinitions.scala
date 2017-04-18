package steps

import calculator.{DatabaseResult, QueryCalculator, SideEffectsHolder}
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import neo4j.driver.testkit.EmbeddedTestkitDriver

/**
  * Created by Andras Zsamboki on 2017.02.23..
  */
class CreateStepDefinitions extends ScalaDsl with EN {
  var driver: EmbeddedTestkitDriver = _
  var result: DatabaseResult = _
  var sideEffectsHolder : SideEffectsHolder = _
  Given("""^any graph$""") { () =>
    driver = new EmbeddedTestkitDriver
    sideEffectsHolder = new SideEffectsHolder(driver.session)
  }

  Given("""^an empty graph$""") { () =>
    driver = new EmbeddedTestkitDriver
    sideEffectsHolder = new SideEffectsHolder(driver.session)
  }
  And("""^having executed:$""") { (query: String) =>
    driver.session.run(query)
    sideEffectsHolder.init()
  }
  When("""^executing query:$""") { (query: String) =>
    result = QueryCalculator.calculateSideEffects(driver.session, query, sideEffectsHolder)
  }
  Then("""^the result should be empty$""") { () =>
    assert(result.queryResult.isEmpty)
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
  Then("""^the result should be, in order:$""") { (dataTable: DataTable) =>
    assert(QueryCalculator.checkResultEqualiy(result, dataTable))
  }
  Then("""^the result should be \(ignoring element order for lists\):$"""){ (dataTable: DataTable) =>
    assert(QueryCalculator.checkResultEqualiy(result, dataTable))
  }

  When("""^executing control query:$"""){ (query:String) =>
    result = QueryCalculator.calculateSideEffects(driver.session, query, sideEffectsHolder)
  }
 }
