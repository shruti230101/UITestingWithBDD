package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class AuthenticatedPopupPage extends BasePage{

    @FindBy(xpath = ElementLocatorConstants.HEADER_XPATH)
    private WebElement header;

    public AuthenticatedPopupPage(WebDriver webDriver) {
        super(webDriver);
    }

    //we need to pass the username and password along with the URL
    //Syntax: https://username:password@URL

    public void launchPage()
    {
        webDriver.get(ConfigReader.AUTHENTICATION_POPUP_PAGE_URL);
    }

    public boolean isLogInSuccessful()
    {
        return this.header.isDisplayed();
    }

    public MouseRightClickPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new MouseRightClickPage(webDriver);
    }
}
