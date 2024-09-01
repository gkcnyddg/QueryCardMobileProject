package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "Hooks"},
        tags = "@US07_TC01 , @US_TC02",
        dryRun = true


)
public class Runner {
}
