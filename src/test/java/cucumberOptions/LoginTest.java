package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/login.feature"}, // specify where the feature files are kept
        glue = {"stepDefinition"}, // specify where the steps definition files are kept
        plugin = {"pretty", "html:src/test/java/reports/HTMLReports/Report1.html",
                "json:src/test/java/reports/JSONReports/Report2.json",
                "junit:src/test/java/reports/JUnitReports/Reports3.xml"}, // specify what kind of report we want to generate
        dryRun = false
        //strict = false,
        //monochrome = false
        //tags = "@EasyLogin"
        //name = {"Search"}
)
public class LoginTest {
}