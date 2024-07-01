package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

    public WebDriver driver;

    public String username;
    public String password;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    public WebElement buttonLogin;

    @FindBy(css = "div[class='oxd-alert-content oxd-alert-content--error']")
    public WebElement invalidCredentials;

    @FindBy(css = "p[class$='orangehrm-login-forgot-header']")
    public WebElement forgotYourPassword;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    public WebElement usernameRequired;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span")
    public WebElement passwordRequired;


    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String loginPageUrl(){
        return ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }



    public static String homepage(){
        return ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

}