package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.DriverSetup;

public class HomePage extends DriverSetup {
	
	String message;
	public HomePage(WebDriver driver)
	{
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/h2")
	public WebElement welMessage;
	
	
	public String getWelcomeMessage()
	{
		message = welMessage.getText();
		return message;
	}
	
	
	
}
