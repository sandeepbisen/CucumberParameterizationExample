package basesetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	protected static Properties configProp = null;

	static {
		try {
			InputStream input = new FileInputStream("config.properties");
			configProp = new Properties();
			configProp.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getURL() {
		return configProp.getProperty("URL");
	}
	
	public static String getBrowserType() {
		return configProp.getProperty("MyDriver");
	}
	
}
