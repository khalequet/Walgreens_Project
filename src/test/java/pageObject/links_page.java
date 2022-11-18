package pageObject;

import base.Config;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class links_page extends Config {

    public links_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    // Locators

    @FindBy(how = How.XPATH, using = "//a[@test-event='Baby Kids']")
    public WebElement babyandkidsLocator;


    //Functions

    public void verifybabyandkidlink() {

        babyandkidsLocator.click();

        String exp = "Baby & Kids";
        String act = babyandkidsLocator.getText();
        Assert.assertEquals(act, exp);
        System.out.println(act);
    }

    public void verifylinks() {


        WebElement ulbody = driver.findElement(By.cssSelector("div.footer__bottom-section"));

        int link = ulbody.findElements(By.cssSelector("a")).size();


        System.out.println(link);

        for (int i = 0; i < link; i++) {
            WebElement ulbody2 = driver.findElement(By.cssSelector("div.footer__bottom-section"));
            List<WebElement> links= ulbody2.findElements(By.cssSelector("a"));
            String linkText = links.get(i).getText();

            System.out.println(linkText);
            links.get(i).click();


            String actTitle = driver.getTitle();
            System.out.println(actTitle);
            Assert.assertTrue(actTitle.contains(linkText));
            driver.navigate().back();




        }

    }
}





















