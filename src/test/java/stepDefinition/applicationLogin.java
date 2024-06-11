/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: ApplicationLoginTest.java
    Author: Devon McBain-Charles
    Description: BDD Framework - Process of logging into the application via the website
     using the Scenario Outline in the Step definitions login file. The Scenario Outline is
      used as data driven testing platform, when the Data may affect the flow of control of the
      application under test (AUT).

*/
package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.Assert.fail;

public class applicationLogin {

    WebDriver driver;

    //Constructor of the class login - initialise this driver
    public applicationLogin(commonSteps getNewDriver) {
        driver = getNewDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("Access the portal to achieve {string} using the {string}")
    public void the_user_accesses_the_portal_using_the(String Test,String URL) {
        System.out.println(Test);
        driver.navigate().to(URL);
        System.out.println("The login page is available to the user");
        String loginPage = driver.getCurrentUrl();
        String loginPageTitle =  driver.getTitle();
        System.out.println("Title of the page: " + loginPageTitle + '\n' + loginPage);

    }

    @When("The {string} and {string} are captured")
    public void the_and_are_captured(String string, String string2) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Username captured: " + string);
        System.out.println("Password captured: " + string2);
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.clear();
        username.sendKeys(string);
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys(string2);

    }

    @Then("Select the login button")
    public void select_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
        System.out.println("User logs in with username and password");

    }

    @And("Verify credentials {string} and {string}")
    public void verify_credentials(String username, String password){
        if (username.isEmpty() && password.isEmpty())
        {
            WebElement usernameRequired = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));
            WebElement passwordRequired = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span"));
            String nameRequired = usernameRequired.getText();
            String passRequired = passwordRequired.getText();
            if(nameRequired.equals("Required") && passRequired.equals("Required")) {
                System.out.println("Username: " + nameRequired);
                System.out.println("Password: " + passRequired);
                //System.out.println(test + " " + "PASSED");
            }
            else {
                fail("The username error message and password error message are not displayed");
            }
        }
        else if (username.isEmpty()){
            WebElement usernameRequired = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));
            String nameRequired = usernameRequired.getText();
            if(nameRequired.equals("Required")) {
                System.out.println("Username: " + nameRequired);
                //System.out.println(test + " " + "PASSED");
            }
            else {
                fail("The username error message is not displayed");
            }
        }
        else if (password.isEmpty()){
            WebElement passwordRequired = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span"));
            String passRequired = passwordRequired.getText();
            if(passRequired.equals("Required")) {
                System.out.println("Password: " + passRequired);
                //System.out.println(test + " " + "PASSED");
            }
            else {
                    fail("The password error message is not displayed");
                }
        }
        else if (!username.equals("Admin") || !password.equals("admin123")) {
            WebElement invalid = driver.findElement(By.xpath("//div[contains(@class, 'oxd-alert-content')]"));
            String invalidCred = invalid.getText();
            if(invalidCred.equals("Invalid credentials")){
                System.out.println(invalidCred);
                //System.out.println(test + " " + "PASSED");
            }else {
                fail("An unexpected error message is returned");
            }
        }
    }

    @And("Display the homepage")
    public void display_the_homepage() {

        String url = driver.getCurrentUrl();
        System.out.println(url);
    }


}
