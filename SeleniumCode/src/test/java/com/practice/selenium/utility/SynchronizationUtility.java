package com.practice.selenium.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SynchronizationUtility {
	
	
	
	public static WebElement utility(WebDriver driver ,String xpath ,int time)
	
	{
		
		WebElement element =null;
		
		
		try
		
		
		{
			
		for(int i=0;i<time;i++)
			
		{
			
			element = driver.findElement(By.xpath(xpath));
			break;
			
		}
		
		}
			
		catch (Exception e) {
			// TODO: handle exception
		}	
			
		
		try
		{
			
		Thread.sleep(1000);	
			
		}
		
		catch (InterruptedException e) {
			// TODO: handle exception
			
			System.out.println("Wait for element to present In DOM");
		}
		return element;
		 
		}
		
public static WebElement utilityById(WebDriver driver ,String id ,int time)
	
	{
		
		WebElement element1 =null;
		
		
		try
		
		
		{
			
		for(int i=0;i<time;i++)
			
		{
			
			element1 = driver.findElement(By.id(id));
			break;
			
		}
		
		}
			
		catch (Exception e) {
			// TODO: handle exception
		}	
			
		
		try
		{
			
		Thread.sleep(1000);	
			
		}
		
		catch (InterruptedException e) {
			// TODO: handle exception
			
			System.out.println("Wait for element to present In DOM");
		}
		return element1;
		 
		}
		
	}


