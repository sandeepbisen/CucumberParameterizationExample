package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.TestBaseSetup;

public class ShippingCostCalculationPageObj extends TestBaseSetup {


	public ShippingCostCalculationPageObj(WebDriver driver) {
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="weight")
	public WebElement txtWeight;
	
	@FindBy(id="air")
	public WebElement optAir;
	
	@FindBy(id="road")
	public WebElement optRoad;
	
	@FindBy(id="ship")
	public WebElement optShip;
	
	@FindBy(id="calculate")
	public WebElement btnCalculate;
	
	@FindBy(id="result")
	public WebElement msgResult;
	
	@FindBy(id="lst-ib")
	public WebElement boxSearch;
	
	public void enterWaight(String inputValue)
	{
		boxSearch.sendKeys("Heello");
		//txtWeight.sendKeys(inputValue);
	}
	
	public void selectTransportMode(String transportMode)
	{
		
		switch(transportMode.toLowerCase()){		
		  case "air" :
			  optAir.click();
			  break;
		  case "ship" :
			  optShip.click();
			  break;
		  case "road" :
			  optRoad.click();
			  break;
	      default :
	          System.out.println("Invalid Mode");
		}
		
	}
  
	public void clickCalculate(){
		btnCalculate.submit();
	}
	
	public String getResult() {
		String msgOnScreen = "";
		msgOnScreen = msgResult.getText();
		return msgOnScreen;
	}
}
