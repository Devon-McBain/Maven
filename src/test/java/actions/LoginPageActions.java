package actions;


import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageObject;
import stepDefinition.CommonSteps;


public class LoginPageActions {

    WebDriver driver;

    LoginPageObject loginPageObject;

    public LoginPageActions(CommonSteps getNewDriver){
        driver = getNewDriver.getDriver();
        loginPageObject = new LoginPageObject(driver);
    }

    public void setUsername(String x){
        loginPageObject.inputUsername.clear();
        loginPageObject.inputUsername.sendKeys(x);
        loginPageObject.username = x;
    }
    public String getUsername(){
        return loginPageObject.username;
    }

    public void setPassword(String y){
        loginPageObject.inputPassword.clear();
        loginPageObject.inputPassword.sendKeys(y);
        loginPageObject.password = y;
    }
    public String getPassword() {
        return loginPageObject.password;
    }

    public void selectButtonLogin(){
        loginPageObject.buttonLogin.click();
    }

    public String getErrorMsg(){
        return loginPageObject.invalidCredentials.getText();
    }

    public String usernameRequired(){
        return loginPageObject.usernameRequired.getText();
    }

    public String passwordRequired(){
        return loginPageObject.passwordRequired.getText();
    }
}
