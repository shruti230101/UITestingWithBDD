package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage{

    @FindBy(id = ElementLocatorConstants.SEARCH_BOX_ID)
    private WebElement searchBox;

    @FindBy(id = ElementLocatorConstants.BRANDS_MENU_ID)
    private WebElement brandsMenu;

    @FindBy(xpath = ElementLocatorConstants.BRAND_OPTION_XPATH)
    private WebElement brandOption;

    @FindBy(xpath = ElementLocatorConstants.RESULTS_HEADER_XPATH)
    private WebElement resultsHeader;

    public AmazonPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.AMAZON_PAGE_URL);
    }

    public void searchProduct(String product)
    {
        waitUntilElementFound(searchBox);
        searchBox.sendKeys(product, Keys.RETURN);
    }

    public void filterBrand()
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
