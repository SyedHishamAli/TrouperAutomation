package PlaywrightAutomation.PlaywirghtDemo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

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
            page.locator("#uploadPicture").setInputFiles(Paths.get("C:\\Users\\rahul.sharma\\Pictures\\Screenshots"));


            browser.close();
            }
    }
}
