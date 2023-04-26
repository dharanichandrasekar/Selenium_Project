package com.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksTesting {

	public static void main(String[] args) {
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground page > HyperLinkText
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().window().maximize();

		//1.Go to Home Page
		WebElement homePage=driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();		

		//2. Find where am supposed to go without clicking me?
		driver.navigate().back();
		WebElement whereGoingLink=driver.findElement(By.partialLinkText("Find where am"));
		String whereLinkLocaiton=whereGoingLink.getAttribute("href");
		System.out.println("This link is going to "+whereLinkLocaiton);
		
		//3.Verify am I broken?
		WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		String title=driver.getTitle();
		
		if(title.contains("404")) {
			System.out.println("This page is broken page");
		}

		//4.Go to Home Page (Interact with same link name)
		driver.navigate().back();
		homePage=driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();
		
		//5.How many links are present in the page
		driver.navigate().back();
		List< WebElement> links=driver.findElements(By.tagName("a"));
		int totalLinksCount=links.size();
		System.out.println("The Total links in this page is "+totalLinksCount);
		
		//Close the driver
		driver.close();

	}

}
