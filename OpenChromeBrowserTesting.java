package com.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Open chrome browser				
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		
		//2. Google home page
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//3. Maximize and Minimize the window screen
		driver.manage().window().maximize();
		//driver.manage().wait();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		//4. Close the chrome browser
		driver.close();
	}

}
