package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class HerokuPage extends BasePage{

    @FindBy(xpath = "//div[@id='content']/div/div/div/div[3]/div[2]")
    private WebElement beforeText;
    public HerokuPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://the-internet.herokuapp.com/dynamic_content");
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
