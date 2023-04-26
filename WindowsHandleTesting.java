package com.SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WindowsHandleTesting {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		
		//1.Click and Confirm new Window Opens
		WebElement openButton=driver.findElement(By.id("j_idt88:new"));
		openButton.click();
		
		Set<String> allActiveWindow=driver.getWindowHandles();
		
		for(String childWindow:allActiveWindow){
			driver.switchTo().window(childWindow);
		}
		Thread.sleep(3000); // To observer the action
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000); // To observer the action
		driver.close();
		
		//TODO: Verification checks for #2,#3,#4
		
	}

}
