package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(cucumber.api.junit.Cucumber.class)
//@RunWith()
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFiles", glue = "StepDefinition" )

public class CustomerTest {

}

//public class CustomerTest extends AbstractTestNGCucumberTests {
//
//}