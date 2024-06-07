package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

import static org.junit.Assert.fail;

public class login {
    WebDriver driver;

    //Constructor of the class login - initialise this driver
    public login(CommonSteps commonSteps){
        driver = commonSteps.getDriver();
    }

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
//        System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
//        driver = new FirefoxDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("The login page is available to the user");
        String loginPage = driver.getCurrentUrl();
        String loginPageTitle =  driver.getTitle();
        System.out.println("Title of the page: " + loginPageTitle + '\n' + loginPage);
    }
    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
        System.out.println("User logs in with username and password");
    }
    @Then("The homepage is displayed")
    public void the_homepage_is_displayed() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
//        driver.quit();
    }


    @Given("The user accesses the portal using the url")
    public void the_user_accesses_the_portal_using_the_url() {
//        System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
//        driver = new FirefoxDriver();
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
    @Then("The homepage is displayed2")
    public void the_hompage_is_displayed2() {
        String homepage = driver.getCurrentUrl();
        String exphomepage = ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        if (!homepage.equals(exphomepage)){
            fail("Page is not returned");
        }
     }
    @Then("The user closes the webpage")
    public void the_user_closes_the_webpage() {
        System.out.println("All test have passed");
//        driver.quit();
    }

}
