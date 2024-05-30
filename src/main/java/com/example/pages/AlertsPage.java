package com.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    private WebElement jsAlertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private WebElement jsConfirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement jsPromptButton;

    @FindBy(id = "result")
    private WebElement result;

    public AlertsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void handleJSAlert()
    {
        this.jsAlertButton.click();
        webDriver.switchTo().alert().accept();
    }

    public String handleJSConfirmAlert()
    {
        this.jsConfirmButton.click();
        webDriver.switchTo().alert().dismiss();
        return this.result.getText();
    }

    public void handleJSPromptAlert()
    {
        this.jsPromptButton.click();
        Alert promptAlert = webDriver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Hello");
        promptAlert.accept();
    }

    public AuthenticatedPopupPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new AuthenticatedPopupPage(webDriver);
    }
}
