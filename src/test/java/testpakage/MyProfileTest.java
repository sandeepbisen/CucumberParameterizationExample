package testpakage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import pageobjectfiles.HomePage;
import pageobjectfiles.LoginPage;
import pageobjectfiles.MyProfilePage;
import basesetup.DriverSetup;

public class MyProfileTest extends DriverSetup{

	//http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/
	String strUserName = "Admin";
	String strPassword = "admin123";
 
	 @Parameters({ "browserType", "appURL" })
	 @BeforeClass
 	 public void setUp(String browserType, String appURL) throws IOException {
		  driver = setDriverTestNG(browserType,appURL);
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 }
   
    @Test
    public void testMyProfile()	
    {
    	//This method used to verify the login, checks the user name is correct and verifys the profile
    	HomePage myHomePage = new HomePage(driver);
    	LoginPage myLoginPage = new LoginPage(driver);
    	MyProfilePage myProfilePage = new MyProfilePage(driver);
    	
    	myLoginPage.verifySignIn(strUserName, strPassword);
    	String actualMsg = myHomePage.getWelcomeMessage();
    	String expectedMsg = "Welcome Robert!!!";
    	assertEquals(actualMsg, expectedMsg);
    	myProfilePage.selectProfile();
    	myProfilePage.verifyMyProfile();
    	System.out.println("verify the Home page successfully");
    	driver.quit();
    }
   
}
