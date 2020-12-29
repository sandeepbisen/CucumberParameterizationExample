package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.DriverSetup;

public class CustomerRegistrationPageObj {
	
	WebDriver driver;
	
	public CustomerRegistrationPageObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="cname")
	public WebElement customerName;
	
	@FindBy(name="age")
	public WebElement customerAge;
	
	@FindBy(name="address")
	public WebElement customerAddress;
	
	@FindBy(name="phonenumber")
	public WebElement customerPhNo;
	
	@FindBy(name="email")
	public WebElement customerEmail;
	
	@FindBy(id="submit")
	public WebElement btnSubmit;
	
	@FindBy(id="reset")
	public WebElement btnReset;
	
	@FindBy(id="//*[@id='message']")
	public WebElement errorMsg;
	
	
}
