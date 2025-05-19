package TestLoggedinUserFlow;
import com.trouper.PageObjects.HomepageObjects;
import org.testng.annotations.*;

public class HomepageTest extends HomepageObjects {
//    HomepageObjects hp=new HomepageObjects();

    @Test(description="To validate the Logo click", priority = 1, groups = {"Smoke"})
    void validateLogo() throws InterruptedException {
        verifyLogo();
    }
    @Test(description = "To validate the search bar", priority = 2, groups = {"Smoke", "Regression"})
    void searchBar() throws InterruptedException {
        verifySearchBar();
    }
    @Test(description = "To validate A-spot banner", priority = 3, groups={"Regression"})
    void aspotBanner() throws InterruptedException {
        verifyAspotbanner();
    }
    @Test(description = "To validate Top Categories on Homepage", priority = 4, groups = {"Smoke", "Regression"})
    void topCategories() throws InterruptedException {
        verifyTopcategories();
    }
    @Test(description = "To validate Loyalty Banner is visible as per the design", priority = 5, groups = {"Smoke", "Regression"})
    void loyaltyBanners() throws InterruptedException {
        verifyloyaltyBanners();
    }
//    @Test(description = "To validate recommended products and click on product.", priority = 6, groups = {"Regression"})
//    void recommendedProd() throws InterruptedException {
//        recommendedProducts();
//    }
    @Test(description = "To validate the Moopet banner", priority=6, groups = {"Regression"})
    void insuranceBanner(){
        verifyInsurance();
    }
    @AfterClass
    void tearDown() {
        tearDown();
    }


}
