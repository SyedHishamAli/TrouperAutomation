package PlaywrightAutomation.PlaywirghtDemo;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitForSelectorState;

import java.nio.file.Paths;

public class PlaywrightDemoTest {

    public static void main(String[] args) {
            Playwright playwright=Playwright.create(); {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://demoqa.com/automation-practice-form");
            //CSS Selector: by ID followed by #
            page.fill("#firstName", "Syed");
            //CSS Selector: by ID followed by #
                    page.fill("#lastName", "Ali");
            page.fill("#userEmail", "wilford@yopmail.com");
            //Test selector
            page.click("label:has-text('Female')");
            //CSS Selector by ID
            page.fill("#userNumber", "7773075457");
            //Using Selector by Playwright
//            page.click("#dateOfBirthInput");
            //Directly using select
//            page.locator(".react-datepicker__month-select").selectOption("June");
//            page.locator(".react-datepicker__year-select").selectOption("2025");
//            page.locator("label:has-text('12')").selectOption("12");
//            page.click("div.subjects-auto-complete__placeholder css-1wa3eu0-placeholder");
//            page.fill("div.subjects-auto-complete__placeholder css-1wa3eu0-placeholder", "Data Engineering");
            page.click("text=Sports");
            page.locator("#uploadPicture").setInputFiles(Paths.get("C:\\Users\\rahul.sharma\\Pictures\\Screenshots\\Screenshot 2025-05-12 160210.png"));
            page.fill("#currentAddress", "N11 ParkAvenue, Tampa, FL");
            page.click("#state");
            page.locator("#state").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
            page.click("div. css-1hwfws3");
            page.click("#city");
            page.locator("#city").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
            page.click("div. css-1hwfws3");
            page.locator("button#submit").click();

                    browser.close();
            }
    }
}
