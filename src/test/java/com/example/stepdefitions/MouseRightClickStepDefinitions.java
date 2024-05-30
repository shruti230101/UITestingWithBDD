package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.MouseRightClickPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MouseRightClickStepDefinitions {
    WebDriver webDriver;

    MouseRightClickPage mouseRightClickPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        mouseRightClickPage = new MouseRightClickPage(webDriver);
    }

    @Given("I am on the github website")
    public void iAmOnTheGithubWebsite() {
        mouseRightClickPage.launchPage();
    }

    @Then("I perform right click action on a button")
    public void iPerformRightClickActionOnAButton() {
        mouseRightClickPage.performRightClick();
    }

    @And("I switch to a new seventh tab")
    public void iSwitchToANewSeventhTab() {
        mouseRightClickPage.switchToNewTab();
    }
}
