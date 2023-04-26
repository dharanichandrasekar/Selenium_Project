package com.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBroswerTesting {

	public static void main(String[] args) {

		//1. Open Firefox browser
		System.setProperty("webdriver.gecko.driver","D:\\Setup_files\\geckodriver\\FirefoxInstaller.exe");//TODO: Firefox setup is not working
				
		//2. Google Home page	
		WebDriver driver= new FirefoxDriver();		
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		//3. Close the driver
		driver.close();
	}
}
