package com.trouper.PageObjects;

import com.microsoft.playwright.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.List;


public class LoginObjects implements Locators{
//    WebDriver driver;
//    Wait<WebDriver> wait;
    Playwright playwright;
    Page page;
    Browser browser;



    public LoginObjects() {
        playwright=Playwright.create();
        browser=playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setArgs(List.of("--start-fullscreen")));
         page=browser.newPage();
         page.navigate("https://uat.trouper.com/");

//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://uat.trouper.com/");
//        driver.manage().window().fullscreen();
//        wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);
    }

    @DataProvider(name = "emailProvider")
    public Object[][] emailProvider(){
        return new Object[][]{
                {"syed@yopmail.com"}
        };
    }

    @DataProvider(name = "passProvider")
    public Object[][] passwordProvider(){
        return new Object[][]{
                {"Welcome@1"},
        };
    }

    public void accountDropdown(){
//        wait.until(driver -> driver.findElement(By.xpath(myaccount)));
//        WebElement accountClick=driver.findElement(By.xpath(myaccount));
//        accountClick.click();
//        wait.until(driver -> driver.findElement(By.xpath(myaccountDropdown)));
//        WebElement myAccountDropdown=driver.findElement(By.xpath(myaccount));
//        myAccountDropdown.isDisplayed();
        page.click(myaccount);
        page.isVisible(myaccountDropdown);
        Locator dropdown=page.locator(myaccountDropdown);
        dropdown.isVisible();
    }

    public void loginCTA() {

//        Thread.sleep(2000);
//        wait.until(driver -> driver.findElement(By.xpath(loginCTA)));
//        WebElement loginButton= driver.findElement(By.xpath(loginCTA));
//        loginButton.click();
//        wait.until(driver -> driver.findElement(By.xpath(loginPopup)));
//        WebElement loginPop= driver.findElement(By.xpath(loginPopup));
//        loginPop.isDisplayed();
        page.click(loginCTA);
        Locator clickLoginPopup=page.locator(loginPopup);
        clickLoginPopup.isVisible();

    }

    public void emailInput(String email){
//        wait.until(driver -> driver.findElement(By.id(emailInput)));
//        WebElement enterEmail= driver.findElement(By.id(emailInput));
//        enterEmail.sendKeys(email);
        page.fill(emailInput, email);

        if (email.contentEquals("syed@yopmail.com")) {
//            wait.until(driver -> driver.findElement(By.xpath(continueCTA)));
//            WebElement continueClick= driver.findElement(By.xpath(continueCTA));
//            continueClick.click();
            page.click(continueCTA);
        }else{
//            wait.until(driver -> driver.findElement(By.xpath(emailError)));
//            WebElement invalidEmail= driver.findElement(By.xpath(emailError));
//            Assert.assertEquals(invalidEmail.getText(), "Please check the email ID entered.");
            page.isVisible(emailError);
        }
    }

    public void passwordInput(String password){
//        wait.until(driver -> driver.findElement(By.xpath(passwordToggle)));
//        WebElement clickToggle=driver.findElement(By.xpath(passwordToggle));
//        clickToggle.click();//        wait.until(driver -> driver.findElement(By.xpath(passInput)));
//        WebElement enterPass=driver.findElement(By.xpath(passInput));
//        enterPass.sendKeys(password);
        page.click(passwordToggle);
        page.fill(passInput, password);

        if (password.contentEquals("Welcome@1")) {
//            WebElement clickSubmit= driver.findElement(By.className(submitCTA));
//            clickSubmit.click();
            page.click(submitCTA);
            page.isVisible(userName);

//            wait.until(driver -> driver.findElement(By.xpath(userName)));
//            WebElement successMessage= driver.findElement(By.xpath(userName));
//            Assert.assertEquals(successMessage.getText(), "Hi, Syed");
//            successMessage.isDisplayed();

        }else{
//            WebElement clickSubmit= driver.findElement(By.xpath(submitCTA));
//            clickSubmit.click();
            page.click(submitCTA);
//            WebElement invalidPass= driver.findElement(By.xpath(passError));
//            Assert.assertEquals(invalidPass.getText(), "Login failed. Please check your credentials.");
            page.isVisible(passError);
        }
    }




    public void closeBrowser(){
//        System.out.println("Closing the browser");
//        driver.quit();
        browser.close();
        playwright.close();
    }

}
