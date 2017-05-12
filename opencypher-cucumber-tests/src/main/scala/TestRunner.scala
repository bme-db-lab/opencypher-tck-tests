import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/cucumberTest/resources/features"),
  glue = Array("classpath:cucumber.steps"),
  monochrome = true,
  plugin = Array("pretty",
    "html:target/cucumber")
)
class TestRunner {}
