package com.example.exceptions;

public class BrowserNotFoundException extends Exception{

    public BrowserNotFoundException(String browser)
    {
        super("Not a " + browser + ". Enter some valid browser(Chrome, Edge).");
    }
}
