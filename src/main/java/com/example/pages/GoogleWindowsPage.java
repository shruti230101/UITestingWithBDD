package com.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class GoogleWindowsPage extends BasePage{

    @FindBy(id = "APjFqb")
    private WebElement searchBox;

    @FindBy(linkText = "Selenium")
    private WebElement resultLink;

    public GoogleWindowsPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://www.google.com");
    }

    public void makeSearch(String search)
    {
        this.searchBox.sendKeys(search, Keys.RETURN);
    }

    String parentWindowHandle;
    public void openingSearchResultInNewWindow(){
        //getWindowHandle() - returns the id of the current window
        //getWindowHandles() - returns the id's of all the windows opened

        parentWindowHandle = webDriver.getWindowHandle();
        String linkUrl = resultLink.getAttribute("href");
        webDriver.switchTo().newWindow(WindowType.WINDOW);
        webDriver.get(linkUrl);
    }
    public void switchToParentWindow(){
        webDriver.switchTo().window(parentWindowHandle);
    }

    public void switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
    }
}
