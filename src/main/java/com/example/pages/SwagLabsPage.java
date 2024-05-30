package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLabsPage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='inventory_item_description']")
    private List<WebElement> products;

    public SwagLabsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://www.saucedemo.com/");
    }

    public void loginToWebsite(String username, String password)
    {
        this.userNameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();
    }

    public void addFilteredItemsToCart(int price)
    {
        for(WebElement product : products)
        {
            WebElement priceElement = product.findElement(By.xpath(".//div[@class='inventory_item_price']"));
            String priceText = priceElement.getText();
            double itemPrice = Double.parseDouble(priceText.substring(1));
            if(itemPrice > price)
            {
                WebElement addToCartButton = product.findElement(By.xpath(".//button[text()='Add to cart']"));
                addToCartButton.click();
            }
        }
    }

    public void switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
    }
}
