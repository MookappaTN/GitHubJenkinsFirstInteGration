package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties props = new Properties();
	
	static {
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/utils/config.properties");
			props.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static String getProps(String property) {
		return props.getProperty(property);
		
	}

}
