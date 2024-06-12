package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseRightClickPage extends BasePage{

    @FindBy(xpath = ElementLocatorConstants.RIGHT_CLICK_BUTTON_XPATH)
    private WebElement rightClickButton;

    public MouseRightClickPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.MOUSE_RIGHT_CLICK_PAGE_URL);
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
