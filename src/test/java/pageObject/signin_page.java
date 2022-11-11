package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signin_page extends Config {

    public signin_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

       // locator

    @FindBy(how =How.ID, using = "pf-dropdown-signin")
    public WebElement togototheSignINpageLocator;

    @FindBy(how= How.XPATH, using = "//input[@name='username']")
    public WebElement SingInEmailLocator;

    @FindBy(how= How.XPATH, using = "//input[@id='user_password']")
    public WebElement SingInPasswordLocator;

    @FindBy(how= How.ID, using = "submit_btn")
    public WebElement SingInLocator;




// Functions
    public void clickonsigninbuttontolSignInWindow(){
        togototheSignINpageLocator.click();
    }
    public void entersigninEmail(){
        SingInEmailLocator.sendKeys("tamhmed12@gmail.com");

    }
    public void entersigninPassword(){
        SingInPasswordLocator.sendKeys("Test1234!");

    }
    public void clickSignInButton(){
        SingInLocator.click();

    }
   }