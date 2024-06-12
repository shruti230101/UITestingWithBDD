package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{

    @FindBy(xpath = ElementLocatorConstants.JS_ALERT_BUTTON_XPATH)
    private WebElement jsAlertButton;

    @FindBy(xpath = ElementLocatorConstants.JS_CONFIRM_BUTTON_XPATH)
    private WebElement jsConfirmButton;

    @FindBy(xpath = ElementLocatorConstants.JS_PROMPT_BUTTON_XPATH)
    private WebElement jsPromptButton;

    @FindBy(id = ElementLocatorConstants.RESULT_ID)
    private WebElement result;

    public AlertsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.ALERTS_PAGE_URL);
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
