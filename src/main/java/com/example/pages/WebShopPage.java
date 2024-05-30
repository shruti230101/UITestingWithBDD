package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebShopPage extends BasePage{

    @FindBy(tagName = "a")
    private List<WebElement> links;
    public WebShopPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://demowebshop.tricentis.com/");
    }

    public void extractAllLinksText()
    {
        for(WebElement element : links)
        {
            String href = element.getAttribute("href");
            System.out.println(href);
        }
    }

    public SwagLabsPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new SwagLabsPage(webDriver);
    }
}
