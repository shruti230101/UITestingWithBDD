package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void waitUntilElementFound(WebElement webElement)
    {
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
