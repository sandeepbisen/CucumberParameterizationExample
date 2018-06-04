package commonutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties obj = new Properties();
	
	
	public String[] ReadData() throws IOException
	{
	  String [] configValue = new String[2];  	
	  File file = new File("config.properties");
	  FileInputStream objfile = new FileInputStream(file);
	  obj.load(objfile);
	  
	  configValue[0] = obj.getProperty("URL");
	  configValue[1] = obj.getProperty("Browser");
	  
	  return configValue;
	}  
}


