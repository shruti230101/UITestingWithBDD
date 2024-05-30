package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.ImageDragDropPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ImageDragDropStepDefinitions {

    WebDriver webDriver;
    ImageDragDropPage imageDragDropPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        imageDragDropPage = new ImageDragDropPage(webDriver);
    }

    @Given("I am on the globalsqa website")
    public void iAmOnTheGlobalsqaWebsite() {
        imageDragDropPage.launchPage();
    }

    @Then("I switch to frame and drag and drop images")
    public void iSwitchToFrameAndDragAndDropImages() {
        imageDragDropPage.dragAndDropImages();
    }

    @And("I switch to a new tenth tab")
    public void iSwitchToANewTenthTab() {
    }
}
