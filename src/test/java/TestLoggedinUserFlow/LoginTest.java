package TestLoggedinUserFlow;

import com.beust.jcommander.Parameter;
import com.trouper.PageObjects.LoginObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends LoginObjects {

    @Test(description ="To verify the account drop down elements", priority = 1, groups = {"Smoke", "Regression"})
    void verifyClickMyaccount(){ accountDropdown();}

    @Test(description = "To verify the Login Popup", priority=2, groups={"Smoke", "Regression"}, dependsOnMethods = "verifyClickMyaccount")
    void verifyLoginCTA() throws InterruptedException {
        loginCTA();
    }

//    @Parameters("email")
    @Test(dataProvider = "emailProvider", description = "To verify when user enters the valid email", priority = 3, groups={"Smoke","Regression"})
    void verifyEmailInput(String email){
        emailInput(email);
    }
    //    @Parameters("password")
    @Test(dataProvider = "passProvider", description = "To verify password when user enters valid password", priority=4, groups={"Smoke", "Regression"}, dependsOnMethods = "verifyEmailInput")
    void verifyPasswordInput(String password){ passwordInput(password);}

    @AfterClass
    void tearDown(){
        closeBrowser();
    }
}
