package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksComponentTesting {

	public static void main(String[] args) throws InterruptedException {

		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//1. Go to Leafground page > LinkText
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(3000); // To observer the action

		//2. Go to Leafground page & Find the Partial LinkText and click
		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.partialLinkText("many links in this")).click();
		Thread.sleep(3000); // To observer the action

		//Close the driver
		driver.close();
	}

}
