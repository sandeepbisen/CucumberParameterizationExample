package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectfiles.ShippingCostCalculationPageObj;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class stepDefintionShippingDetails{
	
	ShippingCostCalculationPageObj shippingCostCalculation;
	String text = "";
	String ShipId = "";
	String name = "";
	public WebDriver driver;
	
	
	@Given("^I am able to load the Shipping Details page by given URL$")
	public void setUp() throws Throwable {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://apps.qa2qe.cognizant.e-box.co.in/shippingDetails/ ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^validate the text \"([^\"]*)\" should be present in expected tag$")
	public void validate_the_text_Shipping_Details_should_be_present_in_h_tag(String expectedText) throws Throwable {
		text = driver.findElement(By.xpath("/html/body/div[1]/center/h2")).getText();
		Assert.assertEquals(text, expectedText);
	}

	@Then("^I click (.*) id clicked corresponding (.*) should be displayed$")
	public void i_click_id_clicked_corresponding_shipment_details_should_be_displayed(String shippmentId,String custName) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//*[@id='shippingTable']/table/tbody"));
		List<WebElement> allNames = element.findElements(By.xpath("tr"));
		int i = 0;
	    for (WebElement we: allNames) { 
	    	if(i == 1)
	    	{
		    	ShipId = we.findElement(By.xpath("td[1]/a")).getText();
	 	    	if(ShipId.equalsIgnoreCase(shippmentId))
		    	{
		    		name = we.findElement(By.xpath("td[2]")).getText();
		    		Assert.assertEquals(name, custName);
		    	}
	    	}
	    	i++;
           
	    } 
	}
	    

   }
	

	

	

		


