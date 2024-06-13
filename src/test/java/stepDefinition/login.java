/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: login.java
    Author: Devon McBain-Charles
    Description: BDD Framework - Process of logging into the application via the website
     using the Step definition login file. The Cucumber data table is used as a list of inputs.

*/

package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPageObject;
import pageObjects.OrangehrmHomePage;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.fail;

public class login {
    WebDriver driver;

    //Constructor of the class login - initialise this driver
    public login(commonSteps getNewDriver){
        driver = getNewDriver.getDriver();
    }

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        driver.navigate().to(LoginPageObject.loginPageUrl());
        String loginPageTitle = driver.getTitle();
        System.out.println("Title of the page: " + loginPageTitle);
    }

    @When("User tries to login into application")
    public void user_login_into_application(DataTable dataTable) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<Map<String,String>> rows = dataTable.asMaps(String.class, String.class);
        for(Map<String,String> columns:rows) {

            LoginPageObject.getUsername(columns.get("username"));
            LoginPageObject.getPassword(columns.get("password"));
            LoginPageObject.setButtonLogin();

            String url = driver.getCurrentUrl();

           if(url.equals(LoginPageObject.homepage())){
               OrangehrmHomePage.dropdown();
               OrangehrmHomePage.logout();
            }
        }
    }

    @And("Logs in {string} and {string}")
    public void logs_in_and(String string, String string2) {
        LoginPageObject.getUsername(string);
        LoginPageObject.getPassword(string2);
        LoginPageObject.setButtonLogin();
    }

    @Then("The homepage is displayed")
    public void the_homepage_is_displayed() {
        String url = driver.getCurrentUrl();
        if(url.equals(LoginPageObject.homepage())){
            OrangehrmHomePage.dropdown();
            OrangehrmHomePage.logout();
            System.out.println("The user has successfully logged into and out of the application" +
                    "successfully");
        }else{
            fail("The user has not logged into the system");
        }
    }


    @Given("The user accesses the portal using the url")
    public void the_user_accesses_the_portal_using_the_url() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("The login page is available to the user");
        String loginPage = driver.getCurrentUrl();
        String loginPageTitle =  driver.getTitle();
        System.out.println("Title of the page: " + loginPageTitle + '\n' + loginPage);
    }
    @When("The Username and Password are captured")
    public void the_username_and_password_are_captured() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
    }
    @Then("The user selects the login button")
    public void the_user_selects_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
        System.out.println("User logs in with username and password");
    }
    @And("The homepage is displayed2")
    public void the_hompage_is_displayed2() {
        String homepage = driver.getCurrentUrl();
        String exphomepage = ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        if (!homepage.equals(exphomepage)){
            fail("Page is not returned");
        }
     }
    @And("The user closes the webpage")
    public void the_user_closes_the_webpage() {
        System.out.println("All test have passed");
//        driver.quit();
    }


}
