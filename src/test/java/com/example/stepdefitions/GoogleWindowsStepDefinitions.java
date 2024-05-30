package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.GoogleWindowsPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class GoogleWindowsStepDefinitions {

    WebDriver webDriver;
    GoogleWindowsPage googleWindowsPage;


    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        googleWindowsPage = new GoogleWindowsPage(webDriver);
    }

    @Given("I am on the google website")
    public void iAmOnTheGoogleWebsite() {
        googleWindowsPage.launchPage();
    }

    @When("I make search for {string}")
    public void iMakeSearchFor(String search) {
        googleWindowsPage.makeSearch(search);
    }

    @Then("I open the search result in new window")
    public void iOpenTheSearchResultInNewWindow() {
        googleWindowsPage.openingSearchResultInNewWindow();
    }

    @And("switch back to the previous window")
    public void switchBackToThePreviousWindow() {
        googleWindowsPage.switchToParentWindow();
    }

    @And("I switch to a new eleventh tab")
    public void iSwitchToANewEleventhTab() {
        googleWindowsPage.switchToNewTab();
    }
}
