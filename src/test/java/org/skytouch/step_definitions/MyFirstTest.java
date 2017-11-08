package org.skytouch.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;
import modules.HomePageAction;
import org.testng.Assert;
/**
 * Created by pythonworld on 11/7/17.
 */
public class MyFirstTest {
    public WebDriver driver;
    public MyFirstTest()
    {
        driver = Hooks.driver;

      /*  datamap = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> sampleData = new HashMap<String,String>();
        sampleData.put("username","abc@xyz.com");
        sampleData.put("password","Test@123");
        System.out.println("Current data" +sampleData);
        datamap.add(sampleData);*/
    }
    @Given("^I am on the google\\.com home page$")
    public void i_am_on_the_google_com_home_page() throws Throwable {
        driver.navigate().to("http://google.com");
        //System.out.println("go to the page");
    }

    @When ("^I search for java$")
    public void i_searchfor_java() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        HomePageAction.Execute(driver);
    }

    @Then("^I verify that search contains java")
    public void i_verify_that_search_contains_java() throws Throwable {
        Assert.assertTrue((driver.getTitle()).equalsIgnoreCase("java - Google Search"), "Page title doesn't match");
    }


}
