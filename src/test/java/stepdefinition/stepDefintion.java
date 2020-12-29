package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectfiles.ShippingCostCalculationPageObj;
import static org.testng.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class stepDefintion{
	
	ShippingCostCalculationPageObj shippingCostCalculation;
	String text = "";
	public WebDriver driver;

	
	@Given("^I am able to load the user details page by given URL$")
	public void loadUrl() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://apps.qa2qe.cognizant.e-box.co.in/Handling_Reg_Expression");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^Enter the below Name in text box and enter the search$")
	public void testUserDetails(DataTable userName) throws Throwable {
        
		List<List<String>> data = userName.raw();
		//Write the code to handle Data Table
		
		driver.findElement(By.id("userId")).sendKeys(data.get(1).get(0)); 
		driver.findElement(By.id("track")).click();
  
	}

	@Then("^I should able to see the expected details$")
	public void validateResult() throws Throwable {
		
		text = driver.findElement(By.id("result")).getText();
		System.out.println("result:"+text);
		assertTrue(text.contains("Shamili"));
	}
	
	
   }


	

	

	

		


