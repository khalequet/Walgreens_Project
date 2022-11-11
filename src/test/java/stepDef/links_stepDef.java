package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import pageObject.links_page;
import pageObject.register_page;

public class links_stepDef extends Config {

    register_page ft = new register_page(driver);
    links_page reLP = new links_page(driver);

    @Given("i am at walgreens homepage")
    public void iAmAtWalgreensHomepage() {
        ft.verifyHomePageTitle();
    }

    @And("verify all links from footer")
    public void verifyAllLinksFromFooter() {
//    reLP.verifybabyandkidlink();
    reLP.verifylinks();

    }
}
