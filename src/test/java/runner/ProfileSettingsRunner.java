package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/profile.feature",
        glue = {"StepDefinitions", "Hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ProfileSettingsRunner extends AbstractTestNGCucumberTests {
}
