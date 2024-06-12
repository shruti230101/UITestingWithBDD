package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class HerokuPage extends BasePage{

    @FindBy(xpath = ElementLocatorConstants.BEFORE_TEXT_XPATH)
    private WebElement beforeText;
    public HerokuPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.HEROKU_PAGE_URL);
    }

    public String fetchText()
    {
        return beforeText.getText();
    }

    public void refreshPage()
    {
        webDriver.navigate().refresh();
    }

    public WebShopPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new WebShopPage(webDriver);
    }

}
