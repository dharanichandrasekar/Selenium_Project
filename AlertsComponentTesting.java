package com.SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsComponentTesting {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Alerts page in Leafground site
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();

		//1.Alert (Simple Dialog) 
		WebElement Alertbox1 =driver.findElement(By.id("j_idt88:j_idt91")); 
		Alertbox1.click();
		Thread.sleep(2000); 
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept(); 
		Thread.sleep(1000);

		//2.Alert (Confirm Dialog) 
		WebElement Alertbox2 =driver.findElement(By.id("j_idt88:j_idt93")); 
		Alertbox2.click(); 
		Alert confirmAlert1=driver.switchTo().alert(); 
		Thread.sleep(1000);
		confirmAlert1.accept();
		Thread.sleep(1000);

		Alertbox2.click(); 
		Alert confirmAlert2=driver.switchTo().alert();
		Thread.sleep(1000);
		confirmAlert2.dismiss(); //TODO : dismiss is not properly working. Have to revisit for fixing the code
		Thread.sleep(1000);

		//3.Sweet Alert (Simple Dialog)
		WebElement Alertbox3 =driver.findElement(By.id("j_idt88:j_idt95")); 
		Alertbox3.click(); 
		Alert dismissAlert=driver.switchTo().alert(); 
		dismissAlert.dismiss();

		//4.Sweet Modal Dialog 
		WebElement Alertbox4 =driver.findElement(By.id("j_idt88:j_idt100")); 
		Alertbox4.click(); 
		Alert modalAlert=driver.switchTo().alert(); 
		modalAlert.dismiss();

		//5.Alert (Prompt Dialog) 
		WebElement Alertbox5 =driver.findElement(By.id("j_idt88:j_idt104")); 
		Alertbox5.click(); Alert
		promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Alert Component -Selenium Automation Testing");
		Thread.sleep(1000); promptAlert.accept();

		//6.Sweet Alert (Confirmation) 
		//WebElement Alertbox6 =driver.findElement(By.id("j_idt88:j_idt106")); 
		//Alertbox6.click(); 
		//Alert confrmationAlert=driver.switchTo().alert();
		//TODO : Need to continue later

		// 7.Minimize and Maximize
		//WebElement Alertbox7 = driver.findElement(By.id("j_idt88:j_idt111"));
		//Alertbox7.click();
		//Alert MinAlert = driver.switchTo().alert();
		//TODO: Handling the Min and Max screen of the Alerts
		
		// Close the driver
		driver.close();
	}

}
