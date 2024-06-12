package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseHoverPage extends BasePage{

    @FindBy(xpath = ElementLocatorConstants.DESKTOPS_OPTION_XPATH)
    private WebElement desktopsOption;

    @FindBy(xpath = ElementLocatorConstants.MAC_OPTION_XPATH)
    private WebElement macOption;
    public MouseHoverPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.MOUSE_HOVER_PAGE_URL);
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
