package com.example.stepdefitions;

import com.example.exceptions.BrowserNotFoundException;
import com.example.pages.DragAndDropPage;
import com.example.utils.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class DragAndDropStepDefinitions {

    WebDriver webDriver;
    DragAndDropPage dragAndDropPage;

    @Before
    public void setUp() throws BrowserNotFoundException {
        webDriver = WebDriverSingleton.getDriver("chrome");
        dragAndDropPage = new DragAndDropPage(webDriver);
    }

    @Given("I am on the goodies website")
    public void iAmOnTheGoodiesWebsite() {
        dragAndDropPage.launchPage();
    }

    @Then("I drag and drop element")
    public void iDragAndDropElement() {
        dragAndDropPage.dragAndDrop();
    }

    @And("I switch to a new ninth tab")
    public void iSwitchToANewNinthTab() {
        dragAndDropPage.switchToNewTab();
    }
}
