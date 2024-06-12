package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ImageDragDropPage extends BasePage{

    @FindBy(xpath = ElementLocatorConstants.FRAME_WINDOW_XPATH)
    private WebElement frameWindow;

    @FindBy(xpath = ElementLocatorConstants.FIRST_IMAGE_XPATH)
    private WebElement firstImage;

    @FindBy(xpath = ElementLocatorConstants.SECOND_IMAGE_XPATH)
    private WebElement secondImage;

    @FindBy(id = ElementLocatorConstants.TARGET_TRASH_ID)
    private WebElement targetTrash;

    public ImageDragDropPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.IMAGE_DRAG_DROP_PAGE_URL);
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
