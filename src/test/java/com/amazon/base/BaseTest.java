package com.amazon.base;

import com.amazon.pages._1_BasePage;
import com.amazon.pages._2_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected _1_BasePage BasePage;
    protected _2_HomePage HomePage;
    private String url = "https://www.amazon.eg/?language=en_AE";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        BasePage = new _1_BasePage();
        BasePage.setDriver(driver);
        HomePage = new _2_HomePage();
    }

    @AfterClass
    public void tearDown() {
        try {
            // Wait for a few seconds before closing
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Then quit the browser
        if (driver != null) {
            driver.quit();
        }

    }
}