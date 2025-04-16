package com.trouper.homepage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends HomepageObjects{
    HomepageObjects hp=new HomepageObjects();

    @BeforeMethod
    void setup(){
       hp.initiateSite();
    }

    @Test(description="To validate the Logo click", priority = 1, groups = {"Smoke"})
    void validateLogo() throws InterruptedException {
        hp.verifyLogo();
    }
    
    @AfterMethod
    void tearDown(){
        hp.closeBrowser();
    }
}
