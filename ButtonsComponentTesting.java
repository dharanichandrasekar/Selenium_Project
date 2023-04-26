package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsComponentTesting {

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground page > Buttons tab 
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		//1. Postion button
		WebElement postionButton= driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point xyButtonpoint =postionButton.getLocation();
		int xposition=xyButtonpoint.getX();
		int yposition=xyButtonpoint.getY();
		System.out.println("X position is : "+xposition +" & "+ "Y position is :"+yposition);
		Thread.sleep(2000); // To observer the action
		
		//2. Color button
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color=colorButton.getCssValue("background-color");
		String backgroundColor=colorButton.getCssValue("background");
		System.out.println("The background color of the button is :"+color);
		System.out.println("The Color of the button is :"+backgroundColor);
		Thread.sleep(2000); // To observer the action
		
		//3. Height and width button
		WebElement heightAndWidthButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int ht = heightAndWidthButton.getSize().getHeight();
		int wt = heightAndWidthButton.getSize().getWidth();
		System.out.println("Height :"+ht+" and "+"Width :"+wt);
		Thread.sleep(2000); // To observer the action
		
		//4. Click the button
		WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
		clickButton.click();
		Thread.sleep(2000); // To observer the action
		
		// Close the drive
		driver.close();

	}

}
