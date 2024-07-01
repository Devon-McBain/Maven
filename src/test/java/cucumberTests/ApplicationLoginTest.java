/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: ApplicationLoginTest.java
    Author: Devon McBain-Charles
    Description: BDD Framework using Cucumber/Junit test runner.
    This allows feature files to be executed using the stepDefinition package as
    the glue
*/

package cucumberTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("src/test/resources/features/LoginScenarioOutline.feature"), // specify where the feature files are kept
        glue = ("stepDefinition"), // specify where the steps definition files are kept
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
                //"pretty", "html:src/test/java/reports/HTMLReports/ScenarioOutlineReport1.html",
                //"pretty","html:target/cucumber-reports/Cucumber","html:test-output","json:target/JSONReports/cucumberReport.json", "html:target/HTMLReports/cucumber-html-report"}
                //"junit:src/test/java/reports/JUnitReports/ScenarioOutlineReports3.xml"}, // specify what kind of report to generate
        //dryRun = false,
        //strict = true,
        //monochrome = false
        //tags = "@Regression or @Tests or @TC_LOGINTESTS"
        //name = {"Search"}
)

public class ApplicationLoginTest {
}
