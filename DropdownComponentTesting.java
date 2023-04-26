package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownComponentTesting {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground page > Dropdown box component 
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();

		//1. Automation tool options dropdown (dropDown1)
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select selection1=new Select(dropDown1);
		selection1.selectByIndex(4);
		Thread.sleep(2000);// To observer the action
		
		//2. Country options dropdown (dropDown2)
		WebElement dropDown2 = driver.findElement(By.id("j_idt87:country_label"));
		Select selection2=new Select(dropDown2);
		selection2.selectByVisibleText("India"); //TODO : Facing issues to identify the shadow doc elements
		Thread.sleep(2000); // To observer the action
		
		//3. State options dropdown (dropDown3)
		WebElement dropDown3 = driver.findElement(By.id("ui-selectonemenu-trigger ui-state-default ui-corner-right"));
		Select selection3=new Select(dropDown3);
		selection3.selectByVisibleText("Chennai");//TODO : Facing issues to identify the shadow doc elements
		Thread.sleep(2000); // To observer the action
		
		//4. Course options dropdown (dropDown4)
		//WebElement dropDown4 = driver.findElement(By.className("ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left"));
		//Select selection4=new Select(dropDown4);
		//TODO : Have to do the remaining scripts

		//5. Language options dropdown (dropDown5)
		//WebElement dropDown5 = driver.findElement(By.className("ui-selectonemenu-trigger ui-state-default ui-corner-right"));
		//Select selection5=new Select(dropDown5);
		//TODO : Have to do the remaining scripts
		
		//6. language chosen options dropdown (dropDown6)
		//WebElement dropDown6 = driver.findElement(By.id("j_idt87:value_label"));
		//Select selection6=new Select(dropDown6);
		//TODO : Have to do the remaining scripts
		
		// Close the driver
		driver.close();

	}

}
