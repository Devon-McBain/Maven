package actions;

import org.openqa.selenium.WebDriver;
import stepDefinition.CommonSteps;

import java.time.Duration;

public class CommonActions {

    private WebDriver driver;
    //CommonSteps act;

    public CommonActions(CommonSteps getNewDriver){
        this.driver = getNewDriver.getDriver();
    }

    public void goToURL(String url){
        driver.get(url);
    }

    public String getcurrentURL(){
       return driver.getCurrentUrl();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void quitDriver() {
        driver.quit();
    }

    public void waitDuration(){
        int sec = 10;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
        }
}

