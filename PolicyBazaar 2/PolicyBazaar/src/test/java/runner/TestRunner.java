package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {
    		"src/test/resources/features/TravelInsurance.feature",
    		"src/test/resources/features/CarInsurance.feature",
    		"src/test/resources/features/HealthInsurance.feature",
    },
    glue = "stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/htmlReport.html",
        "json:target/cucumber-reports/report.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"     
    },
    monochrome = true,
    dryRun = false
)
public class TestRunner{
}
