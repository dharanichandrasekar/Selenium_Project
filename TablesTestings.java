package com.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTestings {

	public static void main(String[] args) {
		// Open chrome browser				
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");

		// Navigate to page
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();

		//TODO: Script here...

		// Close the chrome browser
		driver.close();

	}

}
