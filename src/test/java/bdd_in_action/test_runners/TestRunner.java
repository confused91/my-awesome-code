package bdd_in_action.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/Cucumber.json","html:target/cucumber-html-report"},
        glue = "bdd_in_action/stepdefinition",
        features = "src/test/resources/features",
        tags = "@loginWithMultipleIds"
)
public class TestRunner {
}
