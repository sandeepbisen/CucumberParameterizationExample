package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.TestBaseSetup;

public class CustomerRegistrationPageObj extends TestBaseSetup{
	
	public CustomerRegistrationPageObj(WebDriver driver) {
		//this.driver = driver;
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="cname")
	public WebElement customerName;
	
	@FindBy(id="age")
	public WebElement customerAge;
	
	@FindBy(id="address")
	public WebElement customerAddress;
	
	@FindBy(id="phonenumber")
	public WebElement customerPhNo;
	
	@FindBy(id="email")
	public WebElement customerEmail;
	
	@FindBy(id="submit")
	public WebElement btnSubmit;
	
	@FindBy(id="reset")
	public WebElement btnReset;
	
	
}
