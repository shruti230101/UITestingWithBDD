package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.AuthenticatedPopupPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AuthenticationPopupsStepDefinitions {

    WebDriver webDriver;
    AuthenticatedPopupPage authenticatedPopupPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        authenticatedPopupPage = new AuthenticatedPopupPage(webDriver);
    }

    @Given("I launch the authentication website by passing username and password")
    public void iLaunchTheAuthenticationWebsiteByPassingUsernameAndPassword() {
        authenticatedPopupPage.launchPage();
    }

    @And("I verify that the alert is handled and login is successful")
    public void iVerifyThatTheAlertIsHandledAndLoginIsSuccessful() {
        Assert.assertTrue(authenticatedPopupPage.isLogInSuccessful());
    }

    @And("I switch to a new sixth tab")
    public void iSwitchToANewSixthTab() {

    }
}
