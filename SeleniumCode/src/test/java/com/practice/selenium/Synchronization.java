package com.practice.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.practice.selenium.utility.SynchronizationUtility;

public class Synchronization {
	
	static WebDriver driver;
	
	@Test
	
	
	public void synTest()
	{
		
	driver = new ChromeDriver();
	
	
	
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	
	SynchronizationUtility.utility(driver, "//input[@title='Search']", 10).sendKeys("Selenium WebDriver"+Keys.ENTER);
	
	
	  driver.get("https://www.practice-pad.com/");
	  
	  
	  SynchronizationUtility.utilityById(driver,"username_or_email", 10).sendKeys("asdfghj");
	
      System.out.println("Done");
	
	
		
		
	}

}
