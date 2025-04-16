package com.selenium.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    WebDriver driver;

    @BeforeMethod
    void setup(){
        System.out.println("Initiating the browser");
        driver = new ChromeDriver();
    }

    @Test
    void verifyGoogleTitle(){
        driver.get("https://www.google.com");
        String Title= driver.getTitle();
        System.out.println("Google Title"+Title);
    }

    @AfterMethod
    void tearDown(){
        System.out.println("Closing the browser....");
        driver.quit();
    }
}
