package com.example.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScreenshotUtil {

    private ScreenshotUtil(){
    }

    public static byte[] captureScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public static void saveScreenshotToFile(byte[] screenshot, String filePath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
            fos.write(screenshot);
        }
    }
}

