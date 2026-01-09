package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/assignment.feature",

        },
        glue = {"StepDefinitions", "hooks"},
        tags = "@Assignment20",
        plugin = {"pretty", "html:target/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)



public class US_20_assignmentRunner extends AbstractTestNGCucumberTests {
}
