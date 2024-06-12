package com.example.utils;

import java.util.ResourceBundle;

public class ConfigReader {
    private ConfigReader(){}

    private static final ResourceBundle bundle;
    public static final String ALERTS_PAGE_URL;
    public static final String AMAZON_PAGE_URL;
    public static final String AUTHENTICATION_POPUP_PAGE_URL;
    public static final String DRAG_AND_DROP_PAGE_URL;
    public static final String GOOGLE_WINDOWS_PAGE_URL;
    public static final String HEROKU_PAGE_URL;
    public static final String IMAGE_DRAG_DROP_PAGE_URL;
    public static final String MOUSE_HOVER_PAGE_URL;
    public static final String MOUSE_RIGHT_CLICK_PAGE_URL;
    public static final String SWAG_LABS_PAGE_URL;
    public static final String WEB_SHOP_PAGE_URL;

    static {
        String environment = System.getProperty("environment");
        bundle = ResourceBundle.getBundle(environment);

        ALERTS_PAGE_URL = bundle.getString("ALERTS_PAGE_URL");
        AMAZON_PAGE_URL = bundle.getString("AMAZON_PAGE_URL");
        AUTHENTICATION_POPUP_PAGE_URL = bundle.getString("AUTHENTICATION_POPUP_PAGE_URL");
        DRAG_AND_DROP_PAGE_URL = bundle.getString("DRAG_AND_DROP_PAGE_URL");
        GOOGLE_WINDOWS_PAGE_URL = bundle.getString("GOOGLE_WINDOWS_PAGE_URL");
        HEROKU_PAGE_URL = bundle.getString("HEROKU_PAGE_URL");
        IMAGE_DRAG_DROP_PAGE_URL = bundle.getString("IMAGE_DRAG_DROP_PAGE_URL");
        MOUSE_HOVER_PAGE_URL = bundle.getString("MOUSE_HOVER_PAGE_URL");
        MOUSE_RIGHT_CLICK_PAGE_URL = bundle.getString("MOUSE_RIGHT_CLICK_PAGE_URL");
        SWAG_LABS_PAGE_URL = bundle.getString("SWAG_LABS_PAGE_URL");
        WEB_SHOP_PAGE_URL = bundle.getString("WEB_SHOP_PAGE_URL");
    }

}
