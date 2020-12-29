package testpakage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;

import pageobjectfiles.CommodityForm;
import basesetup.DriverSetup;

public class TestCommodityForm extends DriverSetup{
 
	 String numberOfCommodity1,totalWeight1 ,numberOfCommodity2,totalWeight2;
	 String expectedNoOfComm1,expectedTotalWeight1,expectedNoOfComm2,expectedTotalWeight2;
	 
	 @Parameters({ "browserType", "appURL" })
	 @BeforeClass
 	 public void setUp(String browserType, String appURL) throws IOException {
		  driver = setDriverTestNG(browserType,appURL);
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 }
   
    @Test
    public void test_Commodity_Details()	
    {
    	//This method used to verify the login, checks the user name is correct and verifys the profile
    	CommodityForm myCommodityForm = new CommodityForm(driver);
    	//Scenarios 1
    	myCommodityForm.enterDetailsIntoCommodityForm("LG 335 Refrigerator", "100", "450", "520", "1200");
    	myCommodityForm.submitForm();
    	numberOfCommodity1 = myCommodityForm.getCommodityCount();
    	totalWeight1 = myCommodityForm.getTotalWeight();
    	expectedNoOfComm1 ="1";
    	expectedTotalWeight1 = "100";
    	assertEquals(numberOfCommodity1, expectedNoOfComm1, "Got the expected Number Of Commodity");
    	assertEquals(totalWeight1, expectedTotalWeight1, "Got the expected Total Weight");
    	//Scenario 2
    	myCommodityForm.enterDetailsIntoCommodityForm("Leather Sofa Set", "120", "400", "800", "55");
    	myCommodityForm.submitForm();
    	numberOfCommodity2 = myCommodityForm.getCommodityCount();
    	totalWeight2 = myCommodityForm.getTotalWeight();
    	expectedNoOfComm2 ="2";
    	expectedTotalWeight2 = "220";
    	assertEquals(numberOfCommodity2, expectedNoOfComm2, "Got the expected Number Of Commodity");
    	assertEquals(totalWeight2, expectedTotalWeight2, "Got the expected Total Weight");
    	driver.quit();
    }
   
 }
