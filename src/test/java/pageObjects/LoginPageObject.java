package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {


    @FindBy(name = "password")
    static WebElement inputPassword;

    @FindBy(xpath = "//input[@name='username']")
    static WebElement inputUsername;

    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    public static WebElement buttonLogin;

    @FindBy(css = "div[class='oxd-alert-content oxd-alert-content--error']")
    public WebElement invalidCredentials;

    @FindBy(css = "p[class$='orangehrm-login-forgot-header']")
    public WebElement forgotYourPassword;
    
    public LoginPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static String loginPageUrl(){
        return ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public static void getUsername(String x){
        inputUsername.clear();
        inputUsername.sendKeys(x);

     }

    public static void getPassword(String x) {
        inputPassword.clear();
        inputPassword.sendKeys(x);

    }

    public static void setButtonLogin(){
        buttonLogin.click();
    }

    public String getErrorMsg(){
        return invalidCredentials.getText();
    }

    public static String homepage(){
        return ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

}