package com.trouper.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomepageObjects implements Locators {

    WebDriver driver;
    WebDriverWait wait;

    void initiateSite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://uat.trouper.com/");
        driver.manage().window().fullscreen();
         wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    void  verifyLogo() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(logoElement)));
        WebElement logoClick=driver.findElement(By.xpath(logoElement));
        logoClick.click();
        Thread.sleep(5000);
//        Assert.assertEquals("Trouper", logoClick.isDisplayed());
        Assert.assertEquals("https://uat.trouper.com/", driver.getCurrentUrl());
    }

    void verifySearchBar() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(searchElement)));
        Thread.sleep(5000);
        WebElement searchInput= driver.findElement(By.xpath(searchElement));
        searchInput.sendKeys("Dog");
        searchInput.click();
//        String curl=driver.getCurrentUrl();
//        Thread.sleep(3000);
//        Assert.assertEquals(curl, driver.getCurrentUrl());
    }


    void closeBrowser(){
        System.out.println("Closing the browser");
        driver.quit();
    }


}
