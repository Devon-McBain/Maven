/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: ApplicationLoginTest.java
    Author: Devon McBain-Charles
    Description: BDD Framework - Process of logging into the application via the website
     using the Scenario Outline in the Step definitions Login file. The Scenario Outline is
      used as data driven testing platform, when the Data may affect the flow of control of the
      application under test (AUT).

*/
package stepDefinition;

import actions.CommonActions;
import actions.LoginPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.fail;

public class ApplicationLogin {

    LoginPageActions loginPage;
    CommonActions commonActions;

    public ApplicationLogin(LoginPageActions loginPage, CommonActions commonActions) {
        this.commonActions = commonActions;
        this.loginPage = loginPage;
    }

    @Given("Access the portal to achieve {string} using the {string}")
    public void the_user_accesses_the_portal_using_the(String Test,String URL) {
        commonActions.display(Test);
        commonActions.goToURL(URL);
        commonActions.getcurrentURL();
        commonActions.getPageTitle();
    }

    @When("The {string} and {string} are captured")
    public void the_and_are_captured(String string, String string2) {
        commonActions.waitDuration();
        loginPage.setUsername(string);
        loginPage.setPassword(string2);
    }

    @Then("Select the login button")
    public void selectTheLoginButton() {
        loginPage.selectButtonLogin();
    }

    @And("Verify credentials {string} and {string}")
    public void verify_credentials(String username, String password){
        if (username.isEmpty() && password.isEmpty())
        {
            loginPage.getUsername();
            loginPage.getPassword();
            if(loginPage.usernameRequired().equals("Required") && loginPage.passwordRequired().equals("Required")) {
                System.out.println("Username: " + loginPage.usernameRequired());
                System.out.println("Password: " + loginPage.passwordRequired());
            }
            else {
                fail("The username error message    and password error message are not displayed");
            }
        }
        else if (username.isEmpty()){

            if(loginPage.usernameRequired().equals("Required")) {
                System.out.println("Username: " + loginPage.usernameRequired());
            }
            else {
                fail("The username error message is not displayed");
            }
        }
        else if (password.isEmpty()){

            if(loginPage.passwordRequired().equals("Required")) {
                System.out.println("Password: " + loginPage.passwordRequired());
            }
            else {
                    fail("The password error message is not displayed");
                }
        }
        else if (!username.equals("Admin") || !password.equals("admin123")) {

            if(loginPage.getErrorMsg().equals("Invalid credentials")){
                System.out.println(loginPage.getErrorMsg());

            }else {
                fail("An unexpected error message is returned");
            }
        }
    }

    @And("Display the homepage")
    public void display_the_homepage() {
        commonActions.getcurrentURL();
        System.out.println(commonActions.getcurrentURL());
        commonActions.quitDriver();
    }
}
