package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(cucumber.api.junit.Cucumber.class)

@RunWith(Cucumber.class)
//@CucumberOptions(features = "featureFiles", glue = "stepdefinition" )
@CucumberOptions(features = { "src/test/resources/featureFiles/Discount.feature","src/test/resources/featureFiles/No-discount.feature"}, glue = "stepdefinition")
public class TestRunnerCucumber {

}

//public class CustomerTest extends AbstractTestNGCucumberTests {
//
//}