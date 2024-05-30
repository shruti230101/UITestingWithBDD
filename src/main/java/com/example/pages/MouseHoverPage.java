package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseHoverPage extends BasePage{

    @FindBy(xpath = "//a[text()='Desktops']")
    private WebElement desktopsOption;

    @FindBy(xpath = "//a[text()='Mac (1)']")
    private WebElement macOption;
    public MouseHoverPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://demo.opencart.com/");
    }

    public void performMouseHoverActions()
    {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(desktopsOption).moveToElement(macOption).click().perform();
    }

    public DragAndDropPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new DragAndDropPage(webDriver);
    }
}
