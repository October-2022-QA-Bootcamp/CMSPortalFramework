package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
	private Properties properties;
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	// Why I am putting loadProperty () method inside constructor
	public Configuration () {
		loadProperty ();
	}
	
	public void loadProperty () {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	// Unit test just to see loadProperty() is working and then the getProperty is giving us expected value
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.loadProperty();
		System.err.println(configuration.getProperty("url"));
	}
*/
}
