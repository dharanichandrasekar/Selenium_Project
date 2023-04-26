package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTesting {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser				
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");

		//Calendar page
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");	
		driver.manage().window().maximize();
		
		//1. Picking the date as dec 15 using send keys tab in calendar
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		WebElement calendarTextbox=driver.findElement(By.xpath("//*[@id=\'datepicker\']"));
		calendarTextbox.click();
		Thread.sleep(3000);
		WebElement nextButton=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
		nextButton.click();
		
		WebElement dec15date=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[5]/a"));
		dec15date.click();
		Thread.sleep(3000);
		
		//2. Entering the date using sendkeys in Textbox
		calendarTextbox.clear();
		calendarTextbox.sendKeys("01/01/2022"+Keys.ENTER);
		Thread.sleep(3000);
		
		//Close the chrome browser
		driver.close();
	}

}
