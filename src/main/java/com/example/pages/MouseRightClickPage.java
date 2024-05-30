package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseRightClickPage extends BasePage{

    @FindBy(xpath = "//span[@class='context-menu-one btn btn-neutral']")
    private WebElement rightClickButton;

    public MouseRightClickPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
    }

    public void performRightClick()
    {
        Actions actions = new Actions(webDriver);
        actions.contextClick(rightClickButton).perform();

        //to perform double click action - actions.doubleClick(randomButton).perform();
    }

    public MouseHoverPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new MouseHoverPage(webDriver);
    }

}
