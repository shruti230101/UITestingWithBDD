package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.AmazonPage;
import com.example.utils.ScreenshotUtil;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class AmazonStepDefinitions {

    WebDriver webDriver;
    AmazonPage amazonPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        amazonPage = new AmazonPage(webDriver);
    }

    @Given("I am on the amazon website")
    public void i_am_on_the_amazon_website() {
        amazonPage.launchPage();
    }
    @When("I search for {string}")
    public void i_search_for(String string) {
        amazonPage.searchProduct(string);
    }
    @When("I click on the Brands dropdown and on filter checkbox of {string} brand")
    public void i_click_on_the_brands_dropdown_and_on_filter_checkbox_of_brand(String string) {
        amazonPage.filterBrand(string);
    }
    @Then("I verify the {string} text")
    public void i_verify_the_text(String string) {
        Assert.assertEquals(amazonPage.isHeaderDisplayed(), "Results");
    }
    @Then("I switch to a new tab")
    public void i_switch_to_a_new_tab() {
        amazonPage.switchToNewTab();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] screenshot = ScreenshotUtil.captureScreenshot(webDriver);
            ScreenshotUtil.saveScreenshotToFile(screenshot, "screenshots" + scenario.getName() + ".png");
            scenario.attach(screenshot, "image/png", "FailedStepScreenshot");
        }
        amazonPage = null;
    }
}
