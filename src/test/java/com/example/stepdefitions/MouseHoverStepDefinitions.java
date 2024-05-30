package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.MouseHoverPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MouseHoverStepDefinitions {

    WebDriver webDriver;
    MouseHoverPage mouseHoverPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        mouseHoverPage = new MouseHoverPage(webDriver);
    }

    @Given("I am on opencart website")
    public void iAmOnOpencartWebsite() {
        mouseHoverPage.launchPage();
    }

    @Then("I hover over the elements and perform click operation")
    public void iHoverOverTheElementsAndPerformClickOperation() {
        mouseHoverPage.performMouseHoverActions();
    }

    @And("I switch to a new eighth tab")
    public void iSwitchToANewEighthTab() {
        mouseHoverPage.switchToNewTab();
    }
}
