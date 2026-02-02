package com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotsd {

	
	public static void main(String[] args) throws IOException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
	        // Take screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        // Destination path
	        File dest = new File("screenshots/google_" + timeStamp + "jhb.png");
	        // Save screenshot
	        FileUtils.copyFile(src, dest);
	        System.out.println("Screenshot taken successfully");   
}
}
