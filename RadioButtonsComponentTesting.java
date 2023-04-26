package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsComponentTesting {

	public static void main(String[] args) {
		
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground site > Radio Buttons page 
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//1. Select the Browser's Radio button
		WebElement chromeRadioButton = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]"));
		WebElement fireFoxRadioButton = driver.findElement(By.className("//*[@id='j_idt87:console1']/tbody/tr/td[2]/div/div[2]"));
		WebElement safariRadioButton = driver.findElement(By.className("//*[@id=\'j_idt87:console1\']/tbody/tr/td[3]/div/div[2]"));
		WebElement edgeRadioButton = driver.findElement(By.className("//*[@id=\'j_idt87:console1\']/tbody/tr/td[4]/div/div[2]"));
		
		chromeRadioButton.click();
		fireFoxRadioButton.click();
		safariRadioButton.click();
		edgeRadioButton.click();
		
		//2. UnSelectable the Radio button //TODO
		
		//3. Find the default select radio button//TODO
		
		//4. Select the age group (only if not selected)//TODO
		
		//Close the browser
		driver.close();
	}

}
