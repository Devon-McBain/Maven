package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
public class OrangehrmHomePage {
    @FindBy(xpath = "/html/body/div/div[1]")
    public WebElement divAdminPimLeaveTime;

    @FindBy(xpath = "//a[@href='/web/index.php/auth/logout']")
    public static WebElement Logout;


    @FindBy(xpath = "//ul[.//li[@class='oxd-userdropdown']]")
    public static WebElement Dropdown;


    public OrangehrmHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void logout(){
        Logout.click();

    }

    public static void dropdown(){
        Dropdown.click();

    }
}