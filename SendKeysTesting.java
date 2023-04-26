package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		
		//Google home page
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		//1. Search the Textbox and enter the word
		driver.findElement(By.name("q")).sendKeys("Selenium interview questions"+Keys.ENTER);
		
		//Close the chrome browser
		driver.close();
		
	}

}
