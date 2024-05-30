package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.SwagLabsPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SwagLabsDefinitions {

    WebDriver webDriver;
    SwagLabsPage swagLabsPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        swagLabsPage = new SwagLabsPage(webDriver);
    }

    @Given("I am on the saucelabs website")
    public void iAmOnTheSaucelabsWebsite() {
        swagLabsPage.launchPage();
    }

    @When("I login to the website using username as {string} and password as {string}")
    public void iLoginToTheWebsiteUsingUsernameAsAndPasswordAs(String arg0, String arg1) {
        swagLabsPage.loginToWebsite(arg0, arg1);
    }

    @Then("I filter the products on the basis of price ${int} and add to cart")
    public void iFilterTheProductsOnTheBasisOfPrice$AndAddToCart(int arg0) {
        swagLabsPage.addFilteredItemsToCart(arg0);
    }

    @And("I switch to a new fourth tab")
    public void iSwitchToANewFourthTab() {
        swagLabsPage.switchToNewTab();
    }
}
