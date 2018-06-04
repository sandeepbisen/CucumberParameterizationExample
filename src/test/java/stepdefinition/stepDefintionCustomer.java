package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basesetup.TestBaseSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectfiles.CustomerRegistrationPageObj;

import java.io.*;
import java.util.concurrent.TimeUnit;


public class stepDefintionCustomer extends TestBaseSetup{
	
	CustomerRegistrationPageObj customerRegistration;
	String test = "";
	WebDriver driver;
	
	@Given("^I am able to access customer registration form$")
	public void setUpForCustomer() throws Throwable 
	{
	
		setDriver();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   // driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CustomerRegistration/Index");
		System.out.println("hellow");
	    
	}

	@When("^I am able to fill (.*),(.*),(.*),(.*) and (.*) in customer registration form and Submit$")
	public void testCustomerRegistration(String customerName, String age, String address, String phoneNumber, String email) throws Throwable 
	{
	  customerRegistration = new CustomerRegistrationPageObj(driver);
	  customerRegistration.customerName.sendKeys(customerName);
	  customerRegistration.customerAge.sendKeys(age);
	  customerRegistration.customerAddress.sendKeys(address);
	  customerRegistration.customerPhNo.sendKeys(phoneNumber);
	  customerRegistration.customerEmail.sendKeys(email);
	  customerRegistration.btnSubmit.click();  
    }


	@Then("^I should able to see the expected Result$")
	public void validateResult() throws Throwable , IOException 
	{
		File file = new File (System.getProperty("user.dir")+"\\src\\Output.txt");
		FileWriter FW = new FileWriter (file, false);
	    PrintWriter PW = new PrintWriter (FW);		       
	    String S0 = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/h2"))).getAttribute("innerHTML");
		String S1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();
		String S2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		String S3 = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText();
		String S4 = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		String S5 = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
						
		
		PW.print("\nScenario one :" + S0 + "");
		PW.print("\nName :" + S1 +"");
		PW.print("\nAge :" + S2 +"");
		PW.print("\nAddress :" + S3 +"");
		PW.print("\nPhoneNumber :" + S4 +"");
		PW.print("\nEmail :" + S5 +"");
		
		PW.close();
		driver.close();
						
	    }
	    
	@Then("^I should be able to see error for \"([^\"]*)\"$")
	public void i_should_be_able_to_see_error_for(String customerName) throws Throwable , IOException 
		{
		    File file = new File (System.getProperty("user.dir")+"\\src\\Output.txt");
		    FileWriter FW = new FileWriter (file, true);
	        PrintWriter PW = new PrintWriter (FW);
			String S6 = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("heading"))).getText();
			String S7 = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
			
		    PW.print("\n \nScenario Two: "+ S6 + "");
			PW.print("\nError message for second registration :" + S7 +"");
			
			PW.close();
			driver.close();
		}
	    
   }
	

	

	

		


