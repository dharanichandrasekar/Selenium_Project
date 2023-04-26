package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTesting {

	public static void main(String[] args) {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();

		WebElement SourcePlace=driver.findElement(By.xpath("//*[@id=\'form:drag_content\']"));
		WebElement TargetPlace=driver.findElement(By.xpath("//*[@id=\'form:drop_content\']"));
		Actions dragAndDropaction = new Actions(driver);

		//dragAndDropaction.clickAndHold(SourcePlace).moveToElement(TargetPlace).release().build().perform(); //option #1

		dragAndDropaction.dragAndDrop(SourcePlace, TargetPlace).build().perform(); // option #2

		// Close the driver
		driver.close();
	}

}
