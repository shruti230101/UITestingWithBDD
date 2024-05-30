package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.WebShopPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class WebShopDefinitions {

    WebDriver webDriver;
    WebShopPage swagLabsPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        swagLabsPage = new WebShopPage(webDriver);
    }

    @Given("I am on the webshop website")
    public void iAmOnTheWebshopWebsite() {
        swagLabsPage.launchPage();
    }

    @Then("I extract all the links text")
    public void iExtractAllTheLinksText() {
        swagLabsPage.extractAllLinksText();
    }


    @And("I switch to a new third tab")
    public void iSwitchToANewThirdTab() {
        swagLabsPage.switchToNewTab();
    }
}
