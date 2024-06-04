package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
    WebDriver driver;

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("user is on the landing page bbbbbbbbbbbb");

    }
    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("User logs in with username and password");

    }
    @Then("Homepage is populated")
    public void homepage_is_populated() {
        System.out.println("homepage is populated");
        driver.quit();
    }

}
