package commonutilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class TakeScreenshot {

	public static void takeSnapShot(WebDriver webdriver) throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File("ScreenShots\\screenshot1.png");
        FileUtils.copyFile(SrcFile, DestFile);
        
        TakesScreenshot ts = ((TakesScreenshot)webdriver);
        File fromFile = ts.getScreenshotAs(OutputType.FILE);
        
        DateFormat df = new SimpleDateFormat("hhhhmmdd_hhmmmss");
        Date date = new Date();
        String printTime = df.format(date);
        
        File toFile = new File("ScreenShots/"+printTime+"_screenshot.png");
        FileUtils.copyFile(fromFile, toFile);
        
        
        

    }
}
