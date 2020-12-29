package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.DriverSetup;

public class LoginPage extends DriverSetup {

	String message;
	boolean acceptNextAlert;
	
	public LoginPage(WebDriver driver)
	{
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	public WebElement txtUsername;
	
	@FindBy(name="password")
	public WebElement txtPassword;
	
	@FindBy(name="login")
	public WebElement btnLogin;
	
	public void setUserName(String strUserName)
    {
		txtUsername.sendKeys(strUserName);
    }
    
    public void setPassword(String strPassword)
    {
    	txtPassword.sendKeys(strPassword);
    }
 
    public void clickLogin()
    {
    	btnLogin.click();
    }
    
    public boolean verifySignIn(String strUserName,String strPassword)
    {
    	acceptNextAlert = true;
    	setUserName(strUserName);
    	setPassword(strPassword);
    	clickLogin();
    	return acceptNextAlert;
    }
}
