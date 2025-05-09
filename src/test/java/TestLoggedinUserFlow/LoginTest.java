package TestLoggedinUserFlow;

import com.trouper.PageObjects.LoginObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginTest extends LoginObjects {


    @Test
    void verifyClickMyaccount(){
        accountDropdown();
    }

    @AfterClass
    void tearDown(){
        closeBrowser();
    }
}
