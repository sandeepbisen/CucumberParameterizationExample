package pageobjectfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basesetup.DriverSetup;

public class CommodityForm extends DriverSetup{

	String count,total;

	public CommodityForm(WebDriver driver)
	{
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	public WebElement txtName;
	
	@FindBy(id="weight")
	public WebElement textweight;
	
	@FindBy(id="length")
	public WebElement txtLength;
	
	@FindBy(id="width")
	public WebElement txtWidth;
	
	@FindBy(id="height")
	public WebElement txtHeight ;
	
	@FindBy(id="count")
	public WebElement numberofcommodity;
	
	@FindBy(id="total")
	public WebElement totalWeight;
	
	@FindBy(id="add")
	public WebElement btnAdd;
	
	public void enterDetailsIntoCommodityForm(String name,String weight,String length,String width, String height)
	{
		txtName.sendKeys(name);
		textweight.sendKeys(weight);
		txtLength.sendKeys(length);
		txtWidth.sendKeys(width);
		txtHeight.sendKeys(height);
	}
	
	public void submitForm()
	{
		btnAdd.click();
	}
	
	public String getCommodityCount()
	{
		count = numberofcommodity.getAttribute("value");
		return count;
	}
	
	public String getTotalWeight()
	{
		total = totalWeight.getAttribute("value");
		return total;
	}

}
