package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.DriverSetup;

public class MyProfilePage extends DriverSetup{

	String rtnName,rtnUsername,rtnEmail,rtnRole,rtnAddress,rtnCity,rtnState;
	boolean myProfile;
	public MyProfilePage(WebDriver driver)
	{
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="profile")
	public WebElement linkProfile;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td[2]")
	public WebElement txtName;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]")
	public WebElement txtUserName;
	
	@FindBy(xpath="/html/body/table/tbody/tr[3]/td[2]")
	public WebElement txtEmail;
	
	@FindBy(xpath="/html/body/table/tbody/tr[4]/td[2]")
	public WebElement txtRole;
	
	@FindBy(xpath="/html/body/table/tbody/tr[5]/td[2]")
	public WebElement txtAddress;
	
	@FindBy(xpath="/html/body/table/tbody/tr[7]/td[2]")
	public WebElement txtState;
	
	@FindBy(xpath="/html/body/table/tbody/tr[6]/td[2]")
	public WebElement txtCity;
	
	public String getName()	
	{
		//This method used to get the name text using driver and return.
		txtName.getText();
		return rtnName;
	}
	
	public String getUsername()	
	{
		//This method used to get the user name text using driver and return.
		txtUserName.getText();
		return rtnUsername;
	}
	public String getEmail()
	{
		//This method used to get the email id using driver and return.
		txtEmail.getText();
		return rtnEmail;
	}
	public String getRole()	
	{
		//This method used to get the role using driver and return.
		txtRole.getText();
		return rtnRole;
	}
	public String getAddress()	
	{
		//This method used to get the address using driver and return.
		txtAddress.getText();
		return rtnAddress;
	}
	public String getCity()	
	{
		//This method used to get the city using driver and return.
		txtCity.getText();
		return rtnCity;
	}
	public String getState()
	{
		//This method used to get the state using driver and return.
		txtState.getText();
		return rtnState;
	}

	public boolean verifyMyProfile()
	{
		myProfile = true;
		//This method calls all the above methods and returns true.
		getName();
		getUsername();
		getEmail();
		getRole();
		getAddress();
		getCity();
		getState();
		return myProfile;
	}
	
	public void selectProfile()
	{
		linkProfile.click();
	}

}
