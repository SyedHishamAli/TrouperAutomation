package com.trouper.homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class HomepageObjects implements Locators {

    WebDriver driver;
    WebDriverWait wait;

    void initiateSite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://uat.trouper.com/");
        driver.manage().window().fullscreen();
         wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    void  verifyLogo() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(logoElement)));
        WebElement logoClick=driver.findElement(By.xpath(logoElement));
        logoClick.click();
        Thread.sleep(5000);
        Assert.assertEquals("https://uat.trouper.com/", driver.getCurrentUrl());
    }

    void verifySearchBar() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(searchElement)));
        Thread.sleep(5000);
        WebElement searchInput= driver.findElement(By.xpath(searchElement));
        searchInput.sendKeys("Dog");
        searchInput.click();
    }

    void verifyAspotbanner() throws InterruptedException {
        Thread.sleep(10000);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(aspotBanner1)));
        WebElement aspotbanner1=driver.findElement(By.xpath(aspotBanner1));
        aspotbanner1.isDisplayed();
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(aspotBanner2)));
        WebElement aspotbanner2=driver.findElement(By.xpath(aspotBanner2));
        aspotbanner2.isDisplayed();
    }

    void verifyTopcategories() throws InterruptedException {
        Thread.sleep(10000);
        WebElement topCatrgoriesSection= driver.findElement(By.xpath(topCategories));
        topCatrgoriesSection.isDisplayed();

        Thread.sleep(10000);
        WebElement clickTopCategories= driver.findElement(By.xpath(topCategorydryfood));
        clickTopCategories.click();

        Thread.sleep(3000);
        Assert.assertEquals("https://uat.trouper.com/cat/food/freeze-dried-food", driver.getCurrentUrl());
    }

    void verify


    void closeBrowser(){
        System.out.println("Closing the browser");
        driver.quit();
    }

}
