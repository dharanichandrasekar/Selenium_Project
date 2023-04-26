package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesComponentTesting {

	public static void main(String[] args) {

		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground site > Checkboxes page 
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();

		//1. Checkbox
		WebElement checbox1= driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/span"));
		checbox1.click();
		
		//TODO: Try many more examples in the same page
		
		// Close the drive
		driver.close();
	}

}
