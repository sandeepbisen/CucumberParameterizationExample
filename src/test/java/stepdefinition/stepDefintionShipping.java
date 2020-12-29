package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import basesetup.DriverSetup;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectfiles.CustomerRegistrationPageObj;
import pageobjectfiles.ShippingCostCalculationPageObj;

import java.io.*;
import java.util.concurrent.TimeUnit;


public class stepDefintionShipping{
	
	ShippingCostCalculationPageObj shippingCostCalculation;
	String result = "";
	public WebDriver driver;
	
	@Before public void setUp(){ 
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	   } 
	
	@Given("^I am able to load the Cargo Shipping Cost Calculation from the given URL$")
	public void loadUrl() throws Throwable {
		driver.navigate().to("http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^I am able to fill (.*),(.*) and (.*) in Cargo Shipping Cost Calculation form and calculate$")
	public void testCalculateCost(String weight,String trasportMode, String premiumCustomer) throws Throwable {
     
	  System.out.println("Inside the Test for Air");
	  shippingCostCalculation = new ShippingCostCalculationPageObj(driver);
	  shippingCostCalculation.enterWaight(weight);
	  shippingCostCalculation.selectTransportMode(trasportMode);
	  shippingCostCalculation.isPremium(premiumCustomer);
	  shippingCostCalculation.clickCalculate();
		  
	}

	@Then("^I should able to see the (.*) on Screen$")
	public void validateResult(String expectedResult) throws Throwable {
	  result = shippingCostCalculation.getResult();
	  System.out.println("result:"+result);
	  Assert.assertEquals(result, expectedResult);
	}
	    
   }
	

	

	

		


