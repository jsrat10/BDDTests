package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.HomePage;

public class HomePageAction {
    public static void Execute(WebDriver driver) throws Exception{
        HomePage.search_txt.sendKeys("java");
        Log.info("Entered search text in the text box" );

        HomePage.search_btn.click();
        Log.info("Click action is performed on Search button");

        Reporter.log("Search Action is successfully perfomred");
    }
}
