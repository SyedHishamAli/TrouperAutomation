package com.trouper.PageObjects;

import com.Utilities.Locators;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
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
    Playwright playwright;
    Browser browser;
    Page page;

    public HomepageObjects(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://uat.trouper.com/");
//        driver.manage().window().fullscreen();
//         wait=new WebDriverWait(driver, Duration.ofSeconds(20));
         playwright=Playwright.create();
         browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         page= browser.newPage();
         page.navigate("https://uat.trouper.com/");
    }

    public void  verifyLogo() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(logoElement)));
//        WebElement logoClick=driver.findElement(By.xpath(logoElement));
        page.locator(logoElement).click();
        Assert.assertEquals(page.url(), "https://uat.trouper.com/");
        Assert.assertTrue(page.url().contains("trouper"));
//        logoClick.click();
//        Thread.sleep(5000);
//        Assert.assertEquals("https://uat.trouper.com/", driver.getCurrentUrl());
    }

    public void verifySearchBar() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(searchElement)));
//        Thread.sleep(5000);
//        WebElement searchInput= driver.findElement(By.xpath(searchElement));
//        searchInput.sendKeys("Dog");
//        searchInput.click();

        page.locator(searchElement).fill("Dog");
        page.click(searchElement);
    }
    public void verifyAspotbanner() throws InterruptedException {
//        Thread.sleep(10000);
////        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(aspotBanner1)));
//        WebElement aspotbanner1=driver.findElement(By.xpath(aspotBanner1));
//        aspotbanner1.isDisplayed();
////        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(aspotBanner2)));
//        WebElement aspotbanner2=driver.findElement(By.xpath(aspotBanner2));
//        aspotbanner2.isDisplayed();

        page.isVisible(aspotBanner1);
        page.isVisible(aspotBanner2);
    }

    public void verifyTopcategories() throws InterruptedException {
//        Thread.sleep(10000);
//        WebElement topCatrgoriesSection= driver.findElement(By.xpath(topCategories));
//        topCatrgoriesSection.isDisplayed();

        page.isVisible(topCategories);

//        Thread.sleep(10000);
//        WebElement clickTopCategories= driver.findElement(By.xpath(topCategorydryfood));
//        clickTopCategories.click();

        page.click(topCategorydryfood);



//        Thread.sleep(3000);
        Assert.assertEquals(page.url(), "https://uat.trouper.com/cat/food/freeze-dried-food");

    }
    public void verifyloyaltyBanners() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(loyaltyBanner)));
//        Thread.sleep(4000);
//        WebElement Loyaltyban=driver.findElement(By.xpath(loyaltyBanner));
//        Loyaltyban.isDisplayed();

        page.isVisible(loyaltyBanner);
    }

    public void recommendedProducts() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(recommendedProducts)));
//        WebElement recProducts=driver.findElement(By.xpath(recommendedProducts));
//        recProducts.isDisplayed();
        page.isVisible(recommendedProducts);

//        Thread.sleep(30000);
//        WebElement clickProduct=driver.findElement(By.xpath(productClick));
//        clickProduct.click();
        page.locator(productClick).click();

//        Thread.sleep(30000);
        Assert.assertEquals(page.url(), "https://uat.trouper.com/chip-chops-dog-treats-diced-chicken-70-gms");
    }

    public void verifyInsurance(){
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(insuranceBanner)));
//        WebElement insbanner=driver.findElement(By.xpath(insuranceBanner));
//        insbanner.isDisplayed();
        page.locator(insuranceBanner).isVisible();
    }
    public void verifyNewPetSupplies(){
        page.locator(newPetSupplies).isVisible();
    }
    public void verifybrandBanners(){
        page.locator(brandBanners).isVisible();
    }
    public void varifyServiceCards(){
        page.locator(serviceCards).isVisible();
    }

    public void closeBrowser(){
        System.out.println("Closing the browser");
//        driver.quit();
        page.close();
        browser.close();
    }

}
