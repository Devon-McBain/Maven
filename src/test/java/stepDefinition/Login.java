/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: Login.java
    Author: Devon McBain-Charles
    Description: BDD Framework - Process of logging into the application via the website
     using the Step definition Login file. The Cucumber data table is used as a list of inputs.

*/

package stepDefinition;

import actions.CommonActions;
import actions.LoginPageActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;
import pageObjects.OrangehrmHomePage;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.fail;


public class Login {

    LoginPageActions loginPage;
    CommonActions commonActions;

    public Login(LoginPageActions loginPage, CommonActions commonActions) {
        this.commonActions = commonActions;
        this.loginPage = loginPage;
    }

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        commonActions.goToURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        commonActions.getPageTitle();

    }

    @When("User tries to login into application")
    public void user_login_into_application(DataTable dataTable) {
        commonActions.waitDuration();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<Map<String,String>> rows = dataTable.asMaps(String.class, String.class);
        for(Map<String,String> columns:rows) {

            loginPage.setUsername(columns.get("username"));
            loginPage.setPassword(columns.get("password"));
            loginPage.selectButtonLogin();

            String url = commonActions.getcurrentURL();

           if(url.equals(LoginPageObject.homepage())){
               OrangehrmHomePage.dropdown();
               OrangehrmHomePage.logout();
            }
        }
    }

    @And("Logs in {string} and {string}")
    public void logs_in_and(String string, String string2) {
        loginPage.setUsername(string);
        loginPage.setPassword(string2);
        loginPage.selectButtonLogin();
    }

    @Then("The homepage is displayed")
    public void the_homepage_is_displayed() {
        String url = commonActions.getcurrentURL();
        if(url.equals(LoginPageObject.homepage())){
            OrangehrmHomePage.dropdown();
            OrangehrmHomePage.logout();
            System.out.println("The user has successfully logged into and out of the application");
        }else{
            fail("The user has not logged into the system");
        }
    }


    @Given("The user accesses the portal using the url")
    public void the_user_accesses_the_portal_using_the_url() {
        //commonActions.getPageTitle();
        //act.goToURL(LoginPageObject.loginPageUrl());
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("The Login page is available to the user");
        String loginPage = commonActions.getcurrentURL();
        String loginPageTitle =  commonActions.getPageTitle();
        System.out.println("Title of the page: " + loginPageTitle + '\n' + loginPage);
    }
    @When("The Username and Password are captured")
    public void the_username_and_password_are_captured() {
        commonActions.waitDuration();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//        username.sendKeys("Admin");
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("admin123");
    }
    @Then("The user selects the login button")
    public void the_user_selects_the_login_button() {
//        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//        loginButton.click();
//        System.out.println("User logs in with username and password");
    }
    @And("The homepage is displayed2")
    public void the_hompage_is_displayed2() {
//        String homepage = driver.getCurrentUrl();
//        String exphomepage = ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//        if (!homepage.equals(exphomepage)){
//            fail("Page is not returned");
//        }
     }
    @And("The user closes the webpage")
    public void the_user_closes_the_webpage() {
        System.out.println("All test have passed");
//        driver.quit();
    }


}
