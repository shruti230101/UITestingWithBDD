package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.AlertsPage;
import com.example.utils.ScreenshotUtil;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class AlertsStepDefinitions {

    WebDriver webDriver;
    AlertsPage alertsPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        alertsPage = new AlertsPage(webDriver);
    }

    @Given("I am on the heroku alerts website")
    public void iAmOnTheHerokuAlertsWebsite() {
        alertsPage.launchPage();
    }

    @Then("I click on simple alert button to accept alert")
    public void iClickOnSimpleAlertButtonToAcceptAlert() {
        alertsPage.handleJSAlert();
    }

    @And("I click on next alert button to dismiss alert")
    public void iClickOnNextAlertButtonToDismissAlert() {
        Assert.assertEquals(alertsPage.handleJSConfirmAlert(), "You clicked: Cancel");
    }

    @And("I click on prompt alert button to pass some message")
    public void iClickOnPromptAlertButtonToPassSomeMessage() {
        alertsPage.handleJSPromptAlert();
    }

    @And("I switch to a new fifth tab")
    public void iSwitchToANewFifthTab() {
        alertsPage.switchToNewTab();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] screenshot = ScreenshotUtil.captureScreenshot(webDriver);
            ScreenshotUtil.saveScreenshotToFile(screenshot, "screenshots" + scenario.getName() + ".png");
            scenario.attach(screenshot, "image/png", "FailedStepScreenshot");
        }
    }
}
