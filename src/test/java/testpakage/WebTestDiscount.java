package testpakage;

import org.testng.annotations.Test;

import basesetup.DriverSetup;
import commonutilities.TakeScreenshot;
import pageobjectfiles.ShippingCostCalculationPageObj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class WebTestDiscount extends DriverSetup{
	 
  	  public static String result1 = "";
	  public static String result2 = "";
	  public static String result3 = "";
	  String expectedText = "";
	  WebDriver driver;
	  ShippingCostCalculationPageObj shippingCostCalculation;
	  
	  @BeforeClass
	  public void setUp() throws IOException {
		  driver = setDriver();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  System.out.println("Hello");
		}

	  @Test
	  public void verifyText() {
		  System.out.println("Inside the Test for Air");
		  shippingCostCalculation = new ShippingCostCalculationPageObj(driver);
		  shippingCostCalculation.enterWaight("100");
		  shippingCostCalculation.selectTransportMode("air");
		  shippingCostCalculation.clickCalculate();
		  result1 = shippingCostCalculation.getResult();
		  expectedText = "Dear Customer, your total shipping cost is $100";
		  System.out.println("result1:"+result1);
		  Assert.assertEquals(result1, expectedText);

		  shippingCostCalculation.enterWaight("100");
		  shippingCostCalculation.selectTransportMode("ship");
		  shippingCostCalculation.clickCalculate();
		  result2 = shippingCostCalculation.getResult();
		  expectedText = "Dear Customer, your total shipping cost is $70";
		  System.out.println("result2:"+result2);
		  Assert.assertEquals(result2, expectedText);

		  shippingCostCalculation.enterWaight("100");
		  shippingCostCalculation.selectTransportMode("road");
		  shippingCostCalculation.clickCalculate();
		  result3 = shippingCostCalculation.getResult();
		  expectedText = "Dear Customer, your total shipping cost is $50";
		  System.out.println("result3:"+result3);
		  Assert.assertEquals(result3, expectedText);
	  }
	  
	  
	  @AfterClass
		public void tearDown() {
			driver.quit();
	}
}
