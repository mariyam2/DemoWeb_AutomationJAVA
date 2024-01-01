package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"Utilities", "StepDefinitions"},
        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

)

public class  TestRunnerFile {

}
