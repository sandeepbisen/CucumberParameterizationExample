package basesetup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class TestBaseSetup{
	
	protected WebDriver driver;
	public String appURL;
	public String browserType;
	
	public void setDriver() throws IOException
	{
		ConfigReader configReader = new ConfigReader();
		appURL = ConfigReader.getURL();
		browserType = ConfigReader.getBrowserType();
		 
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		case "IE":
			driver = initInternetExplorerDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}
	
	public WebDriver setDriverTestNG(String browserType, String appURL) throws IOException
	{
	 
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		case "IE":
			driver = initInternetExplorerDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
		
		return driver;
		
	}

	public WebDriver initChromeDriver(String appURL) {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		//driver.get(appURL);
		return driver;
	}

	public WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}

	public WebDriver initInternetExplorerDriver(String appURL) {
		//it is used to define IE capability 
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		
		System.out.println("Launching IE browser..");
		System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);
		driver.get(appURL);
		return driver;
	}
	
	public static void waitForPageToLoad() {

	//	new WebDriverWait(driver, 240).until());
	}
	
  @AfterClass
	public void tearDown() {
		driver.quit();
	}

}
