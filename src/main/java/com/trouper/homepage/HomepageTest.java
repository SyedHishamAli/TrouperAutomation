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
    @Test(description = "To validate the search bar", priority = 2, groups = {"Smoke", "Regression"})
    void searchBar() throws InterruptedException {
        hp.verifySearchBar();
    }
    @Test(description = "To validate A-spot banner", priority = 3, groups={"Regression"})
    void aspotBanner() throws InterruptedException {
        hp.verifyAspotbanner();
    }
    @Test(description = "To validate Top Categories on Homepage", priority = 4, groups = {"Smoke", "Regression"})
    void topCategories() throws InterruptedException {
        hp.verifyTopcategories();
    }

    @AfterMethod
    void tearDown(){
        hp.closeBrowser();
    }
}
