package com.example.pages;

import com.example.constants.ElementLocatorConstants;
import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{

    @FindBy(id = ElementLocatorConstants.SOURCE_ROME_ID)
    private WebElement sourceRome;

    @FindBy(id = ElementLocatorConstants.TARGET_ITALY_ID)
    private WebElement targetItaly;

    public DragAndDropPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get(ConfigReader.DRAG_AND_DROP_PAGE_URL);
    }

    public void dragAndDrop()
    {
        Actions actions = new Actions(webDriver);
        actions.dragAndDrop(sourceRome, targetItaly).perform();
    }

    public ImageDragDropPage switchToNewTab()
    {
        webDriver.switchTo().newWindow(WindowType.TAB);
        return new ImageDragDropPage(webDriver);
    }
}
