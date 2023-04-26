package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteSelectionTesting {

	public static void main(String[] args) {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();
		
		WebElement colorBox=driver.findElement(By.xpath("//*[@id=\'autoCompleteMultipleContainer\']/div/div[1]"));
		colorBox.sendKeys("a");
		
		//TODO : Need to script this concept by identifying one demo site

		// Close the Driver
		driver.close();
	}

}
