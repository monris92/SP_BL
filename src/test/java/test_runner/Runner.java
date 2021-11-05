package test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\SP2\\src\\test\\resources\\features\\mytest.feature",
        glue = {"D:\\SP2\\src\\test\\java\\stepDefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        tags = {"@registerPage","@searchKeyword"},
        dryRun = false

)
public class Runner {
}
