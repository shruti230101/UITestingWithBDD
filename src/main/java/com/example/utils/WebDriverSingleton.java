package com.example.utils;

import com.example.exceptions.BrowserNotFoundException;
import org.openqa.selenium.WebDriver;

public class WebDriverSingleton {

    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    private WebDriverSingleton(){

    }

    public static WebDriver getDriver(String browser) throws BrowserNotFoundException {
        WebDriver webDriver = threadLocal.get();
        if(webDriver == null)
        {
            webDriver = WebBrowserFactory.initiateWebDriver(browser);
            threadLocal.set(webDriver);
        }
        return webDriver;
    }

    public static void quitDriver()
    {
        WebDriver webDriver = threadLocal.get();
        if(webDriver != null)
        {
            webDriver.quit();
            threadLocal.remove();
        }
    }
}
