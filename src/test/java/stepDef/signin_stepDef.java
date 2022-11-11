package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.register_page;
import pageObject.signin_page;

public class signin_stepDef extends Config {

    signin_page SP = new signin_page(driver);
    register_page reuse = new register_page(driver);
    
//    @Given("I am at Login page")
//    public void iAmAtLoginPage() {
//
//        String act = driver.getTitle();
//        String exp = "Sign In or Register to Get Started Using Walgreens.com";
//        Assert.assertEquals(exp, act);
//        System.out.println("I am in walgreens SignIn page ");
//
//    }

    @Given("I am at the walgreens homepage to signIn")
    public void iAmAtTheWalgreensHomepageToSignIn() {
        reuse.verifyHomePageTitle();

    }

    @And("I click on Account to SignIn")
    public void iClickOnAccountToSignIn() {
        reuse.clickAccount();

    }
    @And("I click on Sign In button from the homepage")
    public void iClickOnSignInButtonFromTheHomepage() {
        SP.clickonsigninbuttontolSignInWindow();
    }
    @And("I enter valid Email Address for SignIN")
    public void iEnterValidEmailAddressForSignIN() {
        SP.entersigninEmail();

    }

    @And("I enter valid Password for SignIN")
    public void iEnterValidPasswordForSignIN() {
        SP.entersigninPassword();

    }

   
    @When("I click on SignIn button")
    public void iClickOnSignInButton() {
        SP.clickSignInButton();

    }

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {

    }



}
