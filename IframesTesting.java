package com.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesTesting {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();

		//1. Click Me (Inside frame)
		driver.switchTo().frame(0);
		WebElement clickMeButton =driver.findElement(By.id("Click"));
		clickMeButton.click();
		Thread.sleep(2000);
		String visibleText=clickMeButton.getText();
		System.out.println("The Button is clicked and changed as :"+visibleText);

		//2.How many frames in this page?
		driver.switchTo().defaultContent();//Navigate to default iframe
		List<WebElement> totalFrame= driver.findElements(By.tagName("iframe"));
		int count=totalFrame.size();
		System.out.println("The Total number of iframes is :"+count);
		
		//3.Click Me (Inside Nested frame)
		driver.switchTo().defaultContent(); //Navigate to default iframe
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement clickMeButton2=driver.findElement(By.id("Click"));
		clickMeButton2.click();
		Thread.sleep(2000);
		
		//Close the driver
		driver.close();
		
		//Quite the driver
		driver.quit();

	}

}
