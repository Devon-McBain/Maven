/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: LoginTest.java
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
        features = {"src/test/resources/features/Login.feature"}, // specify where the feature files are kept
        glue = {"stepDefinition"}, // specify where the steps definition files are kept
        plugin = { "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
                /*"pretty", "html:src/test/java/reports/HTMLReports/Report1.html",
                "json:src/test/java/reports/JSONReports/Report2.json",
                "junit:src/test/java/reports/JUnitReports/Reports3.xml"}, */// specify what kind of report to generate
        dryRun = false,
        //strict = false,
        //monochrome = false
        tags = "@SmokeTest"
        //name = {"Search"}
)
public class LoginTest {
}