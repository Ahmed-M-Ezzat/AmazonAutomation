package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    protected static WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected static void set(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected static void click(By locator){
        find(locator).click();
    }

}
