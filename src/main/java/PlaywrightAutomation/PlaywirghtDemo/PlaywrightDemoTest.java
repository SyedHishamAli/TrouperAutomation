package PlaywrightAutomation.PlaywirghtDemo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightDemoTest {

    public static void main(String[] args) {
            Playwright playwright=Playwright.create(); {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://example.com");
            System.out.println(page.title());
            page.click("text=More information...");
            System.out.println(page.url());
            browser.close();
            }
    }
}
