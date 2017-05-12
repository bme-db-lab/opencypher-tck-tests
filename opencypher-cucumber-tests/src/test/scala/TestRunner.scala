import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features"),
  glue = Array("classpath:steps"),
  monochrome = true,
  plugin = Array("pretty",
    "html:target/cucumber")
)
class TestRunner {}