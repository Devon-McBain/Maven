package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
public class LoginPageObject {
    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    public WebElement buttonLogin;

    @FindBy(css = "div[class='oxd-alert-content oxd-alert-content--error']")
    public WebElement InvalidCredentials;

    @FindBy(css = "p[class$='orangehrm-login-forgot-header']")
    public WebElement ForgotYourPassword;
    
    public LoginPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}