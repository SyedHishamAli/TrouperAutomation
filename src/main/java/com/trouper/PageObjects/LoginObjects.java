package com.trouper.PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;


public class LoginObjects implements Locators{
    WebDriver driver;
    Wait<WebDriver> wait;


    public LoginObjects() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://uat.trouper.com/");
        driver.manage().window().fullscreen();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }

    public void accountDropdown(){
        wait.until(driver -> driver.findElement(By.xpath(myaccount)));
        WebElement accountClick=driver.findElement(By.xpath(myaccount));
        accountClick.click();

        wait.until(driver -> driver.findElement(By.xpath(myaccountDropdown)));
        WebElement myAccountDropdown=driver.findElement(By.xpath(myaccount));
        myAccountDropdown.isDisplayed();
    }

    public void loginCTA(){
        
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
        driver.quit();
    }

}
