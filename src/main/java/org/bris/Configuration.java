package org.bris;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	Properties properties;

	public Configuration(String configFile) {
		properties = new Properties();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream(configFile);
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key)
	{
		return this.properties.getProperty(key);
	}

}
