package naukri.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readProperties {	
	public String readPropertiesName(String propertyName) throws IOException {
		//String path = "config.properties";
		//Give your properties file path and enter EMAIL & PASSWORD in properties file.
		String path = "D:\\myStuffs\\Naukri\\com\\config.properties";
		FileInputStream fis = null;
		Properties prop = null;
		String result = null;
		try {
			fis = new FileInputStream(path);
			prop = new Properties();
			prop.load(fis);
			result = prop.getProperty(propertyName);
		} catch (Exception e) {
			System.out.println("Got Exception:\n****\n"+e);
		}
		return result;
		
		
	}

	
	
	
}
