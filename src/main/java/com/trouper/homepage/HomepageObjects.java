package com.trouper.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomepageObjects {

    WebDriver driver;

    void initiateSite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://uat.trouper.com/");
        driver.manage().window().fullscreen();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    void  verifyLogo() throws InterruptedException {
        Thread.sleep(2000);
        WebElement logoClick=driver.findElement(By.xpath("//img[@alt=\"trouper-logo\"]"));
        logoClick.click();
        Assert.assertEquals("Trouper", logoClick.isDisplayed());
        Assert.assertEquals("https://uat.trouper.com/", driver.getCurrentUrl());
    }

    void verifySearchBar(){

    }

    void closeBrowser(){
        System.out.println("Closing the browser");
        driver.quit();
    }


}
