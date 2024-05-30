package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{

    @FindBy(id = "box6")
    private WebElement sourceRome;

    @FindBy(id = "box106")
    private WebElement targetItaly;

    public DragAndDropPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void launchPage()
    {
        webDriver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
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
