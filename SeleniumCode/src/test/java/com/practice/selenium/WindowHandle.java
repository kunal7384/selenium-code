package com.practice.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandle {
	
	WebDriver driver;
	
	
	@Test
	
	public void windowHandle() throws InterruptedException
	{
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window" + parentWindow);
		
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		

		
		
		
	/*for(String child : driver.getWindowHandles())
		{
			if(!parentWindow.equals(child))
			{
				
				driver.switchTo().window(child);
				
				driver.findElement(By.xpath("//*[@alt='Selenium Tutorial in Java']")).click();		
				
			}
			System.out.println("2");
		}*/
		
		
		Set<String> handles = driver.getWindowHandles();
		
		
		System.out.println("Window Handles" + handles);
		
		Iterator<String> sethandle = handles.iterator();
		
		while(sethandle.hasNext())
		{
			
		String childWindow = sethandle.next();
		
		if(!parentWindow.equals(childWindow))
		{
			
			driver.switchTo().window(childWindow);
			
		driver.findElement(By.xpath("//*[@alt='Selenium Tutorial in Java']")).click();	
		System.out.println(driver.getTitle());	
			driver.close();
		}
			
		} 
		
		
		driver.switchTo().window(parentWindow);
		
		
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
	

		System.out.println(driver.getTitle());	
		
		Set<String> handles1 = driver.getWindowHandles();
		
		System.out.println("gjkfjgjdfjg"+handles1);
Iterator<String> sss = handles1.iterator();
		
		while(sss.hasNext())
		{
			
		String childWindow1 = sss.next();
		
		if(!parentWindow.equals(childWindow1))
		{
		
			driver.switchTo().window(childWindow1);
			
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@alt='Appium StudioTutorial']")).click();
		

	String a=driver.getTitle();	
		}
		
		}
		System.out.println("5");
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Alert Box']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		
	}

}
