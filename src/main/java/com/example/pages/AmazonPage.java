package com.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage{

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "p_89-title")
    private WebElement brandsMenu;

    @FindBy(xpath = "//li[@id='p_89/Sony']/span/a/div/label/i")
    private WebElement brandOption;

    @FindBy(xpath = "//div[@class='s-no-outline']/span")
    private WebElement resultsHeader;

    public AmazonPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("http://amazon.in");
    }

    public void searchProduct(String product)
    {
        waitUntilElementFound(searchBox);
        searchBox.sendKeys(product, Keys.RETURN);
    }

    public void filterBrand(String brand)
    {
        waitUntilElementFound(brandsMenu);
        brandsMenu.click();
        waitUntilElementFound(brandOption);
        brandOption.click();
    }

    public String isHeaderDisplayed()
    {
        return resultsHeader.getText();
    }

    public HerokuPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new HerokuPage(webDriver);
    }
}
