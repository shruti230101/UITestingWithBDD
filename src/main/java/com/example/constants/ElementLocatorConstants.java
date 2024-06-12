package com.example.constants;

public class ElementLocatorConstants {
    private ElementLocatorConstants(){}

    //AlertsPage
    public static final String JS_ALERT_BUTTON_XPATH = "//button[@onclick='jsAlert()']";
    public static final String JS_CONFIRM_BUTTON_XPATH = "//button[@onclick='jsConfirm()']";
    public static final String JS_PROMPT_BUTTON_XPATH = "//button[@onclick='jsPrompt()']";
    public static final String RESULT_ID = "result";

    //AmazonPage
    public static final String SEARCH_BOX_ID = "twotabsearchtextbox";
    public static final String BRANDS_MENU_ID = "p_89-title";
    public static final String BRAND_OPTION_XPATH = "//li[@id='p_89/Sony']/span/a/div/label/i";
    public static final String RESULTS_HEADER_XPATH = "//div[@class='s-no-outline']/span";

    //AuthenticatedPopupPage
    public static final String HEADER_XPATH = "//h3";

    //DragAndDropPage
    public static final String SOURCE_ROME_ID = "box6";
    public static final String TARGET_ITALY_ID = "box106";

    //GoogleWindowsPage
    public static final String GOOGLE_SEARCH_BOX_ID = "APjFqb";
    public static final String RESULT_LINK_TEXT = "Selenium";

    //HerokuPage
    public static final String BEFORE_TEXT_XPATH = "//div[@id='content']/div/div/div/div[3]/div[2]";

    //ImageDragDropPage
    public static final String FRAME_WINDOW_XPATH = "//iframe[@class='demo-frame lazyloaded']";
    public static final String FIRST_IMAGE_XPATH = "//li[1]";
    public static final String SECOND_IMAGE_XPATH = "//li[2]";
    public static final String TARGET_TRASH_ID = "trash";

    //MouseHoverPage
    public static final String DESKTOPS_OPTION_XPATH = "//a[text()='Desktops']";
    public static final String MAC_OPTION_XPATH = "//a[text()='Mac (1)']";

    //MouseRightClickPage
    public static final String RIGHT_CLICK_BUTTON_XPATH = "//span[@class='context-menu-one btn btn-neutral']";

    //SwagLabsPage
    public static final String USER_NAME_FIELD_ID = "user-name";
    public static final String PASSWORD_FIELD_ID = "password";
    public static final String LOGIN_BUTTON_ID = "login-button";
    public static final String PRODUCTS_XPATH = "//div[@class='inventory_item_description']";

    //WebShopPage
    public static final String LINKS_TAG_NAME = "a";
}
