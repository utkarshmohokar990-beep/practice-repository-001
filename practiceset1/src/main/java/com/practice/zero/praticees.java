package com.practice.zero;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class praticees {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/date/dateadded.html?d1=30&m1=8&y1=2024&type=add&ay=&am=1&aw=&ad=&rec=%22");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
 //system
		// Code down this line will get all cookies of the specific page.
 
		/*
		 * Set<Cookie> cookies = driver.manage().getCookies(); for (Cookie cookie :
		 * cookies) { System.out.println(cookie.getName() + " : " + cookie.getValue());
		 * 
		 * }
		 */
		// Get Specific cookie by name
 
	/*	Cookie cookie = driver.manage().getCookieNamed("TADAN");
		//System.out.println(cookie.getValue());
	 	*/
		  TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);

	        // Save screenshot
	        File dest = new File("screenshots/google.png");
	        FileUtils.copyFile(src, dest);

		Cookie cookie = new Cookie("testCookie", "12345");
		driver.manage().addCookie(cookie);
		driver.quit();
		
		
		
		
		
		
	}
}