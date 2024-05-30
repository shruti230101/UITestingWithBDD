package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.HerokuPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HerokuStepDefinitions {

    WebDriver webDriver;
    HerokuPage herokuPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        herokuPage = new HerokuPage(webDriver);
    }

    @Given("I am on the heroku website")
    public void iAmOnTheHerokuWebsite() {
        herokuPage.launchPage();
    }

    @Then("I validate the dynamic content")
    public void iValidateTheDynamicContent() {
        String beforeText = herokuPage.fetchText();
        herokuPage.refreshPage();
        String afterText = herokuPage.fetchText();
        Assert.assertNotEquals(beforeText, afterText);
    }

    @And("switch to new second tab")
    public void switchToNewSecondTab() {
        herokuPage.switchToNewTab();
    }
}
