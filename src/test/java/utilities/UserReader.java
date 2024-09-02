package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserReader {
	private static Properties userProperties;

	static {
		String filePath = "user.properties";
		try {
			FileInputStream fis = new FileInputStream(filePath);
			userProperties = new Properties();
			userProperties.load(fis);
			fis.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public static String getUser(String userKey) {
		return (userProperties.getProperty(userKey));
	}
}
