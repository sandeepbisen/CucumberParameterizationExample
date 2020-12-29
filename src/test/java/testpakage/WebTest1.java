package testpakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;
import org.testng.Reporter;

public class WebTest1{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  public Integer passCount=0;
  public Integer totalCount=23;
  static Method method;
  
  @BeforeMethod
  public void driverSetUp()  {
	  DesiredCapabilities caps = new FirefoxOptions()
			     // For example purposes only
			    .setProfile(new FirefoxProfile())
			    .addTo(DesiredCapabilities.firefox());
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    driver = new FirefoxDriver(caps);
    driver.manage().window().maximize();
    baseUrl = "http://apps.qa2qe.cognizant.e-box.co.in/AddressBook/";
   // driver.navigate().to(baseUrl);
    driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
  }

  @Test(priority = 1)
  public void addAddressBook() throws Exception {
	  Reporter.log("Test test case will add the address book details");
	  try{
		   driver.get(baseUrl + "/index.html");
		   try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("nickname")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'nickname' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'nickname' not found.\n");
		    }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("contact")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'contact' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'contact' not found.\n");
		    }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("country")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'country' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'country' not found.\n");
		    }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("city")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Element by id 'city' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'city' not found.\n");
		      }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("type")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'type' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'type' not found.\n");
		    }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("add")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Div by id 'addButton' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Div by id 'addButton' not found.\n");
		    }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("result")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Element by id 'result' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'result' not found.\n");
		      }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("action")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Element by id 'action' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'action' not found.\n");
		      }
		    try {
		    	driver.findElement(By.id("nickname")).clear();
		        driver.findElement(By.id("nickname")).sendKeys("Poj");
		        driver.findElement(By.id("contact")).clear();
		        driver.findElement(By.id("contact")).sendKeys("Pooja");
		        driver.findElement(By.id("company")).clear();
		        driver.findElement(By.id("company")).sendKeys("Wipro");
		        driver.findElement(By.id("city")).clear();
		        driver.findElement(By.id("city")).sendKeys("Chennai");
		        driver.findElement(By.id("country")).clear();
		        driver.findElement(By.id("country")).sendKeys("India");
		        driver.findElement(By.id("type")).clear();
		        driver.findElement(By.id("type")).sendKeys("Sender");
		        driver.findElement(By.id("add")).click();
		        passCount++;
		    } catch (Error e) {
		        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    } catch(Exception e){
		      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    }
	  }
	  catch (IllegalStateException ise) {
	      verificationErrors.append("Testcase Failed - Flow interrupted - (Result Page May not be available or not html page) \n");
	      passCount++;
	  } catch (Exception exception) {
		  System.out.println(exception);
	      verificationErrors.append("Testcase Failed \n"+exception);
	  }
	  System.out.println("The Address book details are added");
  }
  
  @Test(priority = 2)
  public void updateAddressBook() throws Exception {
	  Reporter.log("Test test case will update the address book details");
	  try{
		    driver.get(baseUrl + "/index.html");
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("nickname")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'nickname' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'nickname' not found.\n");
		    }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("contact")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'contact' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'contact' not found.\n");
		    }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("country")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'country' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'country' not found.\n");
		    }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("city")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Element by id 'city' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'city' not found.\n");
		      }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("type")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Element by id 'type' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Element by id 'type' not found.\n");
		    }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("add")));
		      passCount++;
		    } catch (Error e) {
		      verificationErrors.append("Div by id 'addButton' not found.\n");
		    } catch (Exception e) {
		    	verificationErrors.append("Div by id 'addButton' not found.\n");
		    }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("result")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Element by id 'result' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'result' not found.\n");
		      }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("action")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Element by id 'action' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'action' not found.\n");
		      }
		    try {
		    	driver.findElement(By.id("nickname")).clear();
		        driver.findElement(By.id("nickname")).sendKeys("Poj");
		        driver.findElement(By.id("contact")).clear();
		        driver.findElement(By.id("contact")).sendKeys("Pooja");
		        driver.findElement(By.id("company")).clear();
		        driver.findElement(By.id("company")).sendKeys("Wipro");
		        driver.findElement(By.id("city")).clear();
		        driver.findElement(By.id("city")).sendKeys("Chennai");
		        driver.findElement(By.id("country")).clear();
		        driver.findElement(By.id("country")).sendKeys("India");
		        driver.findElement(By.id("type")).clear();
		        driver.findElement(By.id("type")).sendKeys("Sender");
		        driver.findElement(By.id("add")).click();
		        passCount++;
		    } catch (Error e) {
		        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    } catch(Exception e){
		      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    }

		    try {
		      AssertJUnit.assertEquals("Nickname", driver.findElement(By.cssSelector("th")).getText());
		      passCount++;
		    } catch (Error e) {
		        verificationErrors.append("Element by id 'th' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'th' not found.\n");
		      }
		    
		    try {
		      AssertJUnit.assertEquals("City", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr/th[4]")).getText());
		      passCount++;
		    } catch (Error e) {
		        verificationErrors.append("Element by id 'th' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'th' not found.\n");
		      }
		    
		    try {
		        AssertJUnit.assertTrue(isElementPresent(By.id("radio0")));
		        passCount++;
		      } catch (Error e) {
		        verificationErrors.append("Radio button by id 'radio0' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Radio button by id 'radio0' not found.\n");
		      }
		    
		    try {
		      AssertJUnit.assertEquals("Pooja", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[2]")).getText());
		      passCount++;
		    }catch (Error e) {
		        verificationErrors.append("Element by id 'td' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'td' not found.\n");
		      }
		   
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("edit")));
		      passCount++;
		    }  catch (Error e) {
		        verificationErrors.append("Button by id 'edit' not found.\n");
		     } catch (Exception e) {
		      	verificationErrors.append("Bbutton by id 'edit' not found.\n");
		      }
		    
		    try {
		      AssertJUnit.assertTrue(isElementPresent(By.id("delete")));
		      passCount++;
		    }  catch (Error e) {
		        verificationErrors.append("Button by id 'delete' not found.\n");
		     } catch (Exception e) {
		      	verificationErrors.append("Bbutton by id 'delete' not found.\n");
		      }
		    
		    
		    try {
		    driver.findElement(By.id("nickname")).clear();
		    driver.findElement(By.id("nickname")).sendKeys("Rum");
		    driver.findElement(By.id("contact")).clear();
		    driver.findElement(By.id("contact")).sendKeys("Ramya");
		    driver.findElement(By.id("company")).clear();
		    driver.findElement(By.id("company")).sendKeys("Zoho");
		    driver.findElement(By.id("city")).clear();
		    driver.findElement(By.id("city")).sendKeys("Banglore");
		    driver.findElement(By.id("country")).clear();
		    driver.findElement(By.id("country")).sendKeys("India");
		    driver.findElement(By.id("type")).clear();
		    driver.findElement(By.id("type")).sendKeys("Receiver");
		    driver.findElement(By.id("add")).click();
		    driver.findElement(By.id("nickname")).clear();
		    driver.findElement(By.id("nickname")).sendKeys("laa");
		    driver.findElement(By.id("contact")).clear();
		    driver.findElement(By.id("contact")).sendKeys("Lavanya");
		    driver.findElement(By.id("company")).clear();
		    driver.findElement(By.id("company")).sendKeys("Skava");
		    driver.findElement(By.id("city")).clear();
		    driver.findElement(By.id("city")).sendKeys("Coimbatore");
		    driver.findElement(By.id("country")).clear();
		    driver.findElement(By.id("country")).sendKeys("India");
		    driver.findElement(By.id("type")).clear();
		    driver.findElement(By.id("type")).sendKeys("Sender");
		    driver.findElement(By.id("add")).click();
		    passCount++;
		    }  catch (Error e) {
		        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    } catch(Exception e){
		      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    }
		   
		    try {
		      AssertJUnit.assertEquals("Lavanya", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[6]/td[2]")).getText());
		      passCount++;
		    } catch (Error e) {
		        verificationErrors.append("Element by id 'td' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'td' not found.\n");
		      }
		   
		    try {
		      AssertJUnit.assertEquals("India", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[4]/td[5]")).getText());
		      passCount++;
		    } catch (Error e) {
		        verificationErrors.append("Element by id 'td' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'td' not found.\n");
		      }
		   
		    try{
		    driver.findElement(By.id("radio1")).click();
		    driver.findElement(By.id("edit")).click();
		    driver.findElement(By.id("company")).clear();
		    driver.findElement(By.id("company")).sendKeys("Vuram");
		    driver.findElement(By.id("add")).click();
		    passCount++;
		    }  catch (Error e) {
		        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    } catch(Exception e){
		      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
		    }

		try {
		    	String x = driver.findElement(By.id("result")).getText();
		        if(x.contains("Vuram"));
		        {  
		        	passCount++;
		        }
		    } catch (Error e) {
		        verificationErrors.append("Element by id 'td' not found.\n");
		      } catch (Exception e) {
		      	verificationErrors.append("Element by id 'td' not found.\n");
		      }
		  
	  }
	  catch (IllegalStateException ise) {
	      verificationErrors.append("Testcase Failed - Flow interrupted - (Result Page May not be available or not html page) \n");
	      passCount++;
	  } catch (Exception exception) {
		  System.out.println(exception);
	      verificationErrors.append("Testcase Failed \n"+exception);
	  }
	  System.out.println("The Address book details are updated");
  }
  
  @Test(priority = 3)
  public void deleteAddressBook() throws Exception {
	  Reporter.log("Test test case will delete the address book details");

		try{
	    driver.get(baseUrl + "/index.html");
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("nickname")));
	      passCount++;
	    } catch (Error e) {
	      verificationErrors.append("Element by id 'nickname' not found.\n");
	    } catch (Exception e) {
	    	verificationErrors.append("Element by id 'nickname' not found.\n");
	    }
	    
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("contact")));
	      passCount++;
	    } catch (Error e) {
	      verificationErrors.append("Element by id 'contact' not found.\n");
	    } catch (Exception e) {
	    	verificationErrors.append("Element by id 'contact' not found.\n");
	    }
	    
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("country")));
	      passCount++;
	    } catch (Error e) {
	      verificationErrors.append("Element by id 'country' not found.\n");
	    } catch (Exception e) {
	    	verificationErrors.append("Element by id 'country' not found.\n");
	    }
	    
	    try {
	        AssertJUnit.assertTrue(isElementPresent(By.id("city")));
	        passCount++;
	      } catch (Error e) {
	        verificationErrors.append("Element by id 'city' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'city' not found.\n");
	      }
	    
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("type")));
	      passCount++;
	    } catch (Error e) {
	      verificationErrors.append("Element by id 'type' not found.\n");
	    } catch (Exception e) {
	    	verificationErrors.append("Element by id 'type' not found.\n");
	    }
	    
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("add")));
	      passCount++;
	    } catch (Error e) {
	      verificationErrors.append("Div by id 'addButton' not found.\n");
	    } catch (Exception e) {
	    	verificationErrors.append("Div by id 'addButton' not found.\n");
	    }
	    
	    try {
	        AssertJUnit.assertTrue(isElementPresent(By.id("result")));
	        passCount++;
	      } catch (Error e) {
	        verificationErrors.append("Element by id 'result' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'result' not found.\n");
	      }
	    
	    try {
	        AssertJUnit.assertTrue(isElementPresent(By.id("action")));
	        passCount++;
	      } catch (Error e) {
	        verificationErrors.append("Element by id 'action' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'action' not found.\n");
	      }
	    try {
	    	driver.findElement(By.id("nickname")).clear();
	        driver.findElement(By.id("nickname")).sendKeys("Poj");
	        driver.findElement(By.id("contact")).clear();
	        driver.findElement(By.id("contact")).sendKeys("Pooja");
	        driver.findElement(By.id("company")).clear();
	        driver.findElement(By.id("company")).sendKeys("Wipro");
	        driver.findElement(By.id("city")).clear();
	        driver.findElement(By.id("city")).sendKeys("Chennai");
	        driver.findElement(By.id("country")).clear();
	        driver.findElement(By.id("country")).sendKeys("India");
	        driver.findElement(By.id("type")).clear();
	        driver.findElement(By.id("type")).sendKeys("Sender");
	        driver.findElement(By.id("add")).click();
	        passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
	    } catch(Exception e){
	      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
	    }

	    try {
	      AssertJUnit.assertEquals("Nickname", driver.findElement(By.cssSelector("th")).getText());
	      passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Element by id 'th' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'th' not found.\n");
	      }
	    
	    try {
	      AssertJUnit.assertEquals("City", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr/th[4]")).getText());
	      passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Element by id 'th' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'th' not found.\n");
	      }
	    
	    try {
	        AssertJUnit.assertTrue(isElementPresent(By.id("radio0")));
	        passCount++;
	      } catch (Error e) {
	        verificationErrors.append("Radio button by id 'radio0' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Radio button by id 'radio0' not found.\n");
	      }
	    
	    try {
	      AssertJUnit.assertEquals("Pooja", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[2]")).getText());
	      passCount++;
	    }catch (Error e) {
	        verificationErrors.append("Element by id 'td' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'td' not found.\n");
	      }
	   
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("edit")));
	      passCount++;
	    }  catch (Error e) {
	        verificationErrors.append("Button by id 'edit' not found.\n");
	     } catch (Exception e) {
	      	verificationErrors.append("Bbutton by id 'edit' not found.\n");
	      }
	    
	    try {
	      AssertJUnit.assertTrue(isElementPresent(By.id("delete")));
	      passCount++;
	    }  catch (Error e) {
	        verificationErrors.append("Button by id 'delete' not found.\n");
	     } catch (Exception e) {
	      	verificationErrors.append("Bbutton by id 'delete' not found.\n");
	      }
	    
	    
	    try {
	    driver.findElement(By.id("nickname")).clear();
	    driver.findElement(By.id("nickname")).sendKeys("Rum");
	    driver.findElement(By.id("contact")).clear();
	    driver.findElement(By.id("contact")).sendKeys("Ramya");
	    driver.findElement(By.id("company")).clear();
	    driver.findElement(By.id("company")).sendKeys("Zoho");
	    driver.findElement(By.id("city")).clear();
	    driver.findElement(By.id("city")).sendKeys("Banglore");
	    driver.findElement(By.id("country")).clear();
	    driver.findElement(By.id("country")).sendKeys("India");
	    driver.findElement(By.id("type")).clear();
	    driver.findElement(By.id("type")).sendKeys("Receiver");
	    driver.findElement(By.id("add")).click();
	    driver.findElement(By.id("nickname")).clear();
	    driver.findElement(By.id("nickname")).sendKeys("laa");
	    driver.findElement(By.id("contact")).clear();
	    driver.findElement(By.id("contact")).sendKeys("Lavanya");
	    driver.findElement(By.id("company")).clear();
	    driver.findElement(By.id("company")).sendKeys("Skava");
	    driver.findElement(By.id("city")).clear();
	    driver.findElement(By.id("city")).sendKeys("Coimbatore");
	    driver.findElement(By.id("country")).clear();
	    driver.findElement(By.id("country")).sendKeys("India");
	    driver.findElement(By.id("type")).clear();
	    driver.findElement(By.id("type")).sendKeys("Sender");
	    driver.findElement(By.id("add")).click();
	    passCount++;
	    }  catch (Error e) {
	        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
	    } catch(Exception e){
	      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
	    }
	   
	    try {
	      AssertJUnit.assertEquals("Lavanya", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[6]/td[2]")).getText());
	      passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Element by id 'td' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'td' not found.\n");
	      }
	   
	    try {
	      AssertJUnit.assertEquals("India", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[4]/td[5]")).getText());
	      passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Element by id 'td' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'td' not found.\n");
	      }
	   
	    try{
	    driver.findElement(By.id("radio0")).click();
	    driver.findElement(By.id("delete")).click();
	    passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
	    } catch(Exception e){
	      	verificationErrors.append("Cannot provide the input please stick to the UI constraints.\n");
	    }
	    
	    try {
	      AssertJUnit.assertEquals("Ramya", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[2]")).getText());
	      passCount++;
	    }catch (Error e) {
	        verificationErrors.append("Element by id 'td' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'td' not found.\n");
	      }
	   
	    
	    try {
	      AssertJUnit.assertEquals("Coimbatore", driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[4]/td[4]")).getText());
	      passCount++;
	    } catch (Error e) {
	        verificationErrors.append("Element by id 'td' not found.\n");
	      } catch (Exception e) {
	      	verificationErrors.append("Element by id 'td' not found.\n");
	      }
	   

		  } catch (IllegalStateException ise) {
		      verificationErrors.append("Testcase Failed - Flow interrupted - (Result Page May not be available or not html page) \n");
		      passCount++;
		  } catch (Exception exception) {
			  System.out.println(exception);
		      verificationErrors.append("Testcase Failed \n"+exception);
		  }
		System.out.println("The Address book details are deleted");
  }
  
  
  @AfterMethod
  public void tearDown() throws Exception {
		System.out.println("#"+Math.round((passCount/(float)totalCount)*100));
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

}
