package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipTesting {

	public static void main(String[] args) {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement textbox1=driver.findElement(By.id("j_idt88:j_idt95"));
		String Tooltiptext=textbox1.getAttribute("Value");
		System.out.println(Tooltiptext);
		
		// Close the driver
		driver.close();
	}

}