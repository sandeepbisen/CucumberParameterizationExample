package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;


public class NodiscountStepDefinition{
	
	String text = "";
	String expectedResult = "";
	public WebDriver driver;

	
	@Given("^I am able to load the Company Offers Discount page for No discount scenario by given URL$")
	public void loadUrl() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^I am able to fill (.*) and (.*) in Discount page for No discount scenario and Submit$")
	public void testDiscount(String weight, String distance) throws Throwable {
    	
		driver.findElement(By.id("weight")).sendKeys(weight); 
		driver.findElement(By.id("distance")).sendKeys(distance); 
		driver.findElement(By.id("submit")).click();
  
	}

	@Then("^I should able to see the expected No discount details$")
	public void validateResult() throws Throwable {
		
		text = driver.findElement(By.id("result")).getText();
		System.out.println("result:"+text);
		expectedResult = "Datax shipping offers no discount";
		Assert.assertEquals(text, expectedResult);
	}
	
   }


	

	

	

		


