package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxComponentTesting {

	public static void main(String[] args) throws InterruptedException {

		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground page & Find the Textbox 
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		//1. Enter the values in NameTextbox
		WebElement NameTextbox = driver.findElement(By.id("j_idt88:name"));
		NameTextbox.sendKeys("This is sample testing in the textbox filed as Dharani Chandrasekar");
		Thread.sleep(2000); // To observer the action

		//2. Enter the new values in AppendTextbox				
		WebElement AppendTextbox = driver.findElement(By.name("j_idt88:j_idt91"));
		AppendTextbox.sendKeys("India");
		Thread.sleep(2000); // To observer the action

		//3. Check the Textbox is disabled or not 
		WebElement disbaledTextbox = driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div[3]/div"));
		boolean enabled=disbaledTextbox.isEnabled();
		System.out.println(enabled);
		Thread.sleep(2000); // To observer the action

		//4. Clear the Textbox
		WebElement clearTextbox=driver.findElement(By.name("j_idt88:j_idt95"));
		clearTextbox.clear();
		Thread.sleep(2000); // To observer the action

		//5. Read the values / Retrieve the typed text in the Textbox
		WebElement retrieveTextbox =driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
		String Value= retrieveTextbox .getAttribute("Value");
		System.out.println(Value);
		Thread.sleep(2000); // To observer the action
		
		//6. Type email and Tab in the EmailTextbox
		WebElement emailTextbox = driver.findElement(By.cssSelector("#j_idt88\\:j_idt99"));
		emailTextbox.sendKeys("testing@gmail.com");
		emailTextbox.sendKeys(Keys.TAB);
		emailTextbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000); // To observer the action
		
		//Close the drive
		driver.close();

	}

}
