package com.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectableTesting {

	public static void main(String[] args) {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://www.leafground.com/selectable.xhtml");//This page is currently not available 
		driver.manage().window().maximize();
		
		//TODO: Need sample website for pratise session
		
		// Close the driver
		driver.close();
	}

}
