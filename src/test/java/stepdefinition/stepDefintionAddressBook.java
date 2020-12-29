package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import basesetup.UserDetails;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectfiles.ShippingCostCalculationPageObj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class stepDefintionAddressBook{
	
	ShippingCostCalculationPageObj shippingCostCalculation;
	String text = "";
	String ShipId = "";
	String name = "";
	public WebDriver driver;
	
	
	@Before public void setUp(){ 
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} 
	
	@Given("^I am able to load the Address Book page by given URL$")
	public void loadUrl() throws Throwable {
		driver.navigate().to("http://apps.qa2qe.cognizant.e-box.co.in/AddressBook/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^I am able to fill and Add below details in Address Book$")
	public void testAddressBook(List<UserDetails> userDetails) throws Throwable {
        
		//List<List<String>> data = addressDetails.raw();
		//List<UserDetails> userDetails = new ArrayList<UserDetails>();
		//userDetails = addressDetails.asList(UserDetails.class);
		
		//Map<String, Price> priceList = new HashMap<UserDetails>();
		
		for (UserDetails details :userDetails )
		{
			driver.findElement(By.id("nickname")).sendKeys(details.getNickName());
			driver.findElement(By.id("contact")).sendKeys(details.getContact());
			driver.findElement(By.id("company")).sendKeys(details.getCompany());
			driver.findElement(By.id("city")).sendKeys(details.getCity());
			driver.findElement(By.id("country")).sendKeys(details.getCountry());
			driver.findElement(By.id("type")).sendKeys(details.getType());
			driver.findElement(By.id("add")).click();
		}
  
	}

	@Then("^I should able to see the newly added details in Address Book$")
	public void validateAddResult() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath("//*[@id='result']/table/tbody"));
		List<WebElement> allNames = element.findElements(By.xpath("tr"));
		if(allNames.size()>1)
		{
			Assert.assertTrue(true, "Address Details Are Added");
		}
		
	}
	
	@Then("^I should able to Edit the newly added City with \"([^\"]*)\" in Address Book$")
	public void validateEditResult(String newCity) throws Throwable {
		
		driver.findElement(By.id("radio0")).click();
		driver.findElement(By.id("edit")).click();
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(newCity);;
		driver.findElement(By.id("add")).click();
		
	}
	
	@Then("^I should able to delete the newly added City in Address Book$")
	public void validateDeleteResult() throws Throwable {
		
		driver.findElement(By.id("radio0")).click();
		driver.findElement(By.id("delete")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='result']/table/tbody"));
		List<WebElement> allNames = element.findElements(By.xpath("tr"));
		if(allNames.size()<1)
		{
			Assert.assertTrue(true, "Nwely added Address is Deleted");
		}
		
	}
	    
	@After public void tearDown(){ 
	      driver.close(); 
	 } 
	
	
   }


	

	

	

		


