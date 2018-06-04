package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(cucumber.api.junit.Cucumber.class)

@RunWith(Cucumber.class)
//@CucumberOptions(features = "featureFiles", glue = "stepdefinition" )
@CucumberOptions(features = "src/test/resources/featureFiles", glue = "stepdefinition")
public class TestRunner {

}

//public class CustomerTest extends AbstractTestNGCucumberTests {
//
//}