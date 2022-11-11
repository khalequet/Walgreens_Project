package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class register_page extends Config {

    public register_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    // Locators

    @FindBy(how= How.XPATH, using = "//span[@class='inner-focus hide-on-mobile truncate']")
    public WebElement accountLocator;

//    @FindBy (how = How.ID,using = "pf-dropdown-register")
//    public WebElement registerLocator;

    @FindBy (how = How.LINK_TEXT,using = "Register")
   public WebElement registerLocator;

    @FindBy (how = How.XPATH,using = "//input[@name='firstName']")
    public WebElement firstNameLocator;

    @FindBy (how = How.XPATH, using = "//input[@aria-describedby='lastname-error-text']")
    public WebElement lastNameLocator;

    @FindBy(how = How.ID, using = "wag-email")
    public WebElement emailLocator;

    @FindBy(how =How.XPATH, using = "//input[@id ='wag-password']")
    public WebElement passwordLocator;

    @FindBy(how =How.XPATH, using = "//input[@id = 'wag-terms-checkbox']")
    public WebElement agreetotermsLocator;

    @FindBy (how =How.XPATH, using = "//a[@id='wag-rxuser-continue-btm']")
    public WebElement continuebuttonLocator;



    // List of test functions

    public void verifyHomePageTitle(){
        String act = driver.getTitle();
        String exp = "Walgreens: Pharmacy, Health & Wellness, Photo & More for You";
        Assert.assertEquals(exp, act);
        System.out.println("I am in walgreens home page ");
    }


    public void clickAccount (){
        accountLocator.click();
    }
    public void clickRegister (){
        registerLocator.click();
    }
    public void enterfirstName (){
        firstNameLocator.sendKeys( "Jenny");
    }
    public void enterlastName (){
        lastNameLocator.sendKeys( "Ahmed");
    }
    public void enterEmail (){
    emailLocator.sendKeys("jennyahmed12@gmail.com");
    }
    public void enterPassword (){
       passwordLocator.sendKeys("Jenny12!");
    }

    public void clickagreetoterms (){
        agreetotermsLocator.click();
    }

    public void clickoncontinuebutton (){
        continuebuttonLocator.click();
    }

















}
