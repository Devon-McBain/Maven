/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: ApplicationLoginTest.java
    Author: Devon McBain-Charles
    Description: BDD Framework - Process of logging into the application via the website
     using the Step definitions login file.

*/
package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class applicationLogin {

    WebDriver driver;

    //Constructor of the class login - initialise this driver
    public applicationLogin(commonSteps getNewDriver) {
        driver = getNewDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Given("The user accesses the portal using the {string}")
    public void theUserAccessesThePortalUsingTheURL(String string1) {
        driver.navigate().to(string1);
        System.out.println("The login page is available to the user");
        String loginPage = driver.getCurrentUrl();
        String loginPageTitle =  driver.getTitle();
        System.out.println("Title of the page: " + loginPageTitle + '\n' + loginPage);

    }

    @When("The {string} and {string} are captured")
    public void the_and_are_captured(String string, String string2) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys(string);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(string2);


    }

    @Then("Select the login button")
    public void select_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
        System.out.println("User logs in with username and password");
    }

    @Then("Display the homepage")
    public void display_the_homepage() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Then("Close the webpage")
    public void close_the_webpage() {
        System.out.println("PASSED");
    }



}
