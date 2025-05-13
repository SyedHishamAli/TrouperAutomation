package TestLoggedinUserFlow;

import com.trouper.PageObjects.LoginObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginTest extends LoginObjects {


    @Test(description ="To verify the account drop down elements", priority = 1, groups = {"Smoke", "Regression"})
    void verifyClickMyaccount(){ accountDropdown();}

    @Test(description = "To verify the Login Popup", priority=2, groups={"Smoke", "Regression"}, dependsOnMethods = "verifyClickMyaccount")
    void verifyLoginCTA() throws InterruptedException {
        loginCTA();
    }

    @Test(description = "To verify when user enters the valid email", priority = 3, groups={"Smoke","Regression"})
    void verifyEmailInput(){
        emailInput("syed@yopmail.com");
    }
    @Test(description = "To verify password when user enters valid password", priority=4, groups={"Smoke", "Regression"}, dependsOnMethods = "verifyEmailInput")
    void verifyPasswordInput(){ passwordInput("Welcome@1");}

    @AfterClass
    void tearDown(){
        closeBrowser();
    }
}
