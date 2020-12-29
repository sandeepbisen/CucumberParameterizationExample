package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

import java.io.*;
import java.util.concurrent.TimeUnit;


public class stepDefintionCustomer extends DriverSetup{
	
	CustomerRegistrationPageObj customerRegistration;
	String test = "";
	WebDriver driver;
	
	@Given("^I am able to access customer registration form$")
	public void setUpForCustomer() throws Throwable 
	{
		driver = setDriver();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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


	@Then("^I should able to see the expected (.*),(.*),(.*),(.*) and (.*) Result$")
	public void validateResult(String customerName, String age, String address, String phoneNumber, String email) throws Throwable , IOException 
	{
       
	    String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		String actName = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText().trim();
		String actAge = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText().trim();
		String actAddress = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText().trim();
		String actPhoneNumber = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText().trim();
		String actEmail = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText().trim();
		
		Assert.assertEquals(header, "Registered Succesfully");
		Assert.assertEquals(actName, customerName+" "+age);
		Assert.assertEquals(actAge, age);
		Assert.assertEquals(actAddress, address);
		Assert.assertEquals(" "+actPhoneNumber, phoneNumber);
		Assert.assertEquals(actEmail, email);
						
	  }
	    
	@Then("^I should be able to see error for invalid emailID$")
	public void validateResultInvalidEmailID() throws Throwable , IOException 
	{
		customerRegistration = new CustomerRegistrationPageObj(driver);
		String errorMsg = customerRegistration.errorMsg.getText();
		Assert.assertEquals(errorMsg, "Enter a valid email id");
	}
	
	@Then("^I should able to see the expected Result for Reset$")
	public void validateResultForReset() throws Throwable , IOException 
	{
		customerRegistration = new CustomerRegistrationPageObj(driver);
		customerRegistration.btnReset.click();
	}
	    
//	@After public void tearDown(){ 
//	      driver.quit(); 
//	   } 
   }
	

	

	

		


