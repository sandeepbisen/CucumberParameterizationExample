package testpakage;

import org.testng.annotations.Test;

import basesetup.TestBaseSetup;
import commonutilities.TakeScreenshot;
import pageobjectfiles.ShippingCostCalculationPageObj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class WebTestCustomer extends TestBaseSetup{
	 
  	  public static String result1 = "";
	  public static String result2 = "";
	  public static String result3 = "";
	  public String expectedText="";
	  public WebDriver driver;
	//  ShippingCostCalculationPageObj shippingCostCalculation;
	  ShippingCostCalculationPageObj shippingCostCalculation;
	  
	  @Parameters({ "browserType", "appURL" })
	  @BeforeTest
	  public void setUp(String browserType, String appURL) throws IOException {
		   setDriverTestNG(browserType,appURL);
		  //driver=getDriver();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  System.out.println("hellow");
		}

	  @Test
	  public void verifyTextForAir() {
		   shippingCostCalculation = new ShippingCostCalculationPageObj(driver);
		  shippingCostCalculation.enterWaight("100");
		  shippingCostCalculation.selectTransportMode("air");
		  result1 = shippingCostCalculation.getResult();
		  expectedText = "Dear Customer,your total shipping cost is $100";
		  System.out.println("result1:"+result1);
		  Assert.assertEquals(result1, expectedText);
	  }
	  
	  @Test
	  public void verifyTextForShip() {
		  shippingCostCalculation = new ShippingCostCalculationPageObj(driver);
		  shippingCostCalculation.enterWaight("100");
		  shippingCostCalculation.selectTransportMode("ship");
		  result2 = shippingCostCalculation.getResult();
		  expectedText = "Dear Customer,your total shipping cost is $100";
		  System.out.println("result2:"+result2);
		  Assert.assertEquals(result2, expectedText);
	  }
	  
	  @Test
	  public void verifyTextForRoad() {
		  shippingCostCalculation = new ShippingCostCalculationPageObj(driver);
		  shippingCostCalculation.enterWaight("100");
		  shippingCostCalculation.selectTransportMode("road");
		  result3 = shippingCostCalculation.getResult();
		  expectedText = "Dear Customer,your total shipping cost is $100";
		  System.out.println("result3:"+result3);
		  Assert.assertEquals(result3, expectedText);
	  }
	  
//	  @AfterMethod
//	  public void screenShotOfPage() throws Exception{
//		  TakeScreenshot.takeSnapShot(driver);
//	  }


}
