package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ImageDragDropPage extends BasePage{

    @FindBy(xpath = "//iframe[@class='demo-frame lazyloaded']")
    private WebElement frameWindow;

    @FindBy(xpath = "//li[1]")
    private WebElement firstImage;

    @FindBy(xpath = "//li[2]")
    private WebElement secondImage;

    @FindBy(id = "trash")
    private WebElement targetTrash;

    public ImageDragDropPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("https://www.globalsqa.com/demo-site/draganddrop/");
    }

    public void dragAndDropImages()
    {
        webDriver.switchTo().frame(frameWindow);
        Actions actions = new Actions(webDriver);

        actions.dragAndDrop(firstImage, targetTrash).perform();
        actions.dragAndDrop(secondImage, targetTrash).perform();
    }

    public GoogleWindowsPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new GoogleWindowsPage(webDriver);
    }
}
