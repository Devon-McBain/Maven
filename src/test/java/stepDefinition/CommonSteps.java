/*
    Testing Orange HRM Open Source Frontend user interface
    File Name: CommonSteps.java
    Author: Devon McBain-Charles
    Description: BDD Framework - Hooks for Before(setup), After(teardown) and
    WebDriver constructor.
*/

package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.OrangehrmHomePage;

public class CommonSteps {
    public WebDriver driver;
    //private LoginPageObject loginPage;


    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
        driver = new FirefoxDriver();
       // new LoginPageObject loginPage;
        //LoginPageObject loginPage = new LoginPageObject(driver);
        new OrangehrmHomePage(driver);
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getDriver(){
        return driver;
    }
//TODO: Implement WebDriverWait
//TODO: Instatiate new login page
//TODO: Hooks - Global Tags and Order of execution Tags
//TODO: Alternative reports
//TODO: Dashboard
}
