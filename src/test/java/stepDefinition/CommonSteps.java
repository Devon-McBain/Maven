package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonSteps {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getDriver(){
        return driver;
    }
}