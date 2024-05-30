package com.example.utils;

import com.example.exceptions.BrowserNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebBrowserFactory {
    private WebBrowserFactory() {
    }

    public static WebDriver initiateWebDriver(String browser) throws BrowserNotFoundException {
        return switch(browser.toLowerCase())
        {
            case "chrome" -> new ChromeDriver();
            case "edge" -> new EdgeDriver();
            default -> throw new BrowserNotFoundException(browser);
        };
    }
}
