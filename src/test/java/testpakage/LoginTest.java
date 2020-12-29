package testpakage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;

import pageobjectfiles.LoginPage;
import pageobjectfiles.MyProfilePage;
import basesetup.DriverSetup;

public class LoginTest extends DriverSetup{

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
    public void testLoginPage()	
    {
    	//This method used to verify the login.
		LoginPage myLoginPage = new LoginPage(driver);
    	myLoginPage.verifySignIn(strUserName, strPassword);
    	System.out.println("verify the login page successfully");
    }
    
    	  
	@AfterClass
		public void tearDown() {
			driver.quit();
	}
   
}
