package com.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesTesting {

	public static void main(String[] args) {
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//1. Go to Leafground page > LinkText
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		
		//Close the driver
		driver.close();
	}

}
