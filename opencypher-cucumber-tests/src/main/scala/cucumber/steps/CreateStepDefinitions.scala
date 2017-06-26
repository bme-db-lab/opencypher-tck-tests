package cucumber.steps

import calculator.{DatabaseResult, ExceptionFinder, QueryCalculator}
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import neo4j.driver.testkit.EmbeddedTestkitDriver
import org.neo4j.cypher.{CypherTypeException, InvalidArgumentException, SyntaxException}


/**
  * Created by Andras Zsamboki on 2017.02.23..
  */
class CreateStepDefinitions extends ScalaDsl with EN {
  var driver: EmbeddedTestkitDriver = _
  var result: DatabaseResult = _
  Given("""^any graph$""") { () =>
    driver = new EmbeddedTestkitDriver
  }

  Given("""^an empty graph$""") { () =>
    driver = new EmbeddedTestkitDriver
  }
  And("""^having executed:$""") { (query: String) =>
    driver.session.run(query)
  }
  When("""^executing query:$""") { (query: String) =>
    result = QueryCalculator.calculateSideEffects(driver.session, query)
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

  Then("""^a SyntaxError should be raised at compile time"""){ () =>
    ExceptionFinder.findException(result.exception.get, classOf[SyntaxException])
  }

  Then("""^a ArgumentError should be raised at runtime:"""){ () =>
    //// Write code here that turns the phrase above into concrete actions
    ExceptionFinder.findException(result.exception.get, classOf[InvalidArgumentException])
  }

  Then("""^a TypeError should be raised at runtime:"""){ () =>
    ExceptionFinder.findException(result.exception.get, classOf[CypherTypeException])
  }
  When("""^executing control query:$"""){ (query:String) =>
    result = QueryCalculator.calculateSideEffects(driver.session, query)
  }
 }
