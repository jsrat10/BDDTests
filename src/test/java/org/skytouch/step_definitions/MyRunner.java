package org.skytouch.step_definitions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {}
)

//@CucumberOptions(features="src/test/resources/*",glue="com.skytouch")
public class MyRunner extends AbstractTestNGCucumberTests {

}

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.TestNGCucumberRunner;
//import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
//@CucumberOptions (
//            features = "classpath:MyFirstTest.feature",
//            glue = "classpath:org.skytouch",
//           // name = {"com"},
//            plugin = "html:target/selenium-reports"

//)
