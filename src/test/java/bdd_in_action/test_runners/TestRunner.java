package bdd_in_action.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","com.epam.reportportal.cucumber.ScenarioReporter"},
        glue = "bdd_in_action/stepdefinition",
        features = "src/test/resources/features",
        tags = "@loginWithMultipleIds"
)
public class TestRunner {
}
