package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesTesting {

	public static void main(String[] args) {
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Go to Leafground page > Buttons tab 
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		driver.manage().window().maximize();

		//1.Click on this image to go home page
		WebElement image=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		image.click();

		//2.Am I Broken Image?
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");//back to previous page
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));

		if (brokenImage.getAttribute("naturalWidth").equals("0")){
			System.out.println("The image is broken image");
		}else{
			System.out.println("The image is not broken");
		}

		//Close the driver
		driver.close();
	}
}
