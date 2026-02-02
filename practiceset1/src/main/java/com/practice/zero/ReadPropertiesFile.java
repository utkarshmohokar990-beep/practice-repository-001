package com.practice.zero;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        prop.load(fis);
        
        
        // Step 4: Read 
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        // Print values
        System.out.println("URL: " + url);
        System.out.println("Browser: " + browser);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
	}
}
