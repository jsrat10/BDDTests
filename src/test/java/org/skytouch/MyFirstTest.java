package org.skytouch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by pythonworld on 11/7/17.
 */
public class MyFirstTest {
    @Given("^I am on the google\\.com home page$")
    public void i_am_on_the_google_com_home_page() throws Throwable {
        System.out.println("go to the page");
    }

    @Then("^I verify that title contains Google$")
    public void i_verify_that_title_contains_Google() throws Throwable {
        System.out.println("see the title");
    }


}
