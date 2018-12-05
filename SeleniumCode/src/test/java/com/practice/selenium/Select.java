package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Select {
	
	
	WebDriver driver;
	
	
	
	@Test
	
	public void testSelect()
	{
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.practice-pad.com/");
		
		driver.findElement(By.id("username_or_email")).sendKeys("kunal");
		
		driver.findElement(By.id("login_password")).sendKeys("password");
		
		driver.findElement(By.name("commit")).click();
		
		driver.findElement(By.id("Layer_1")).click();
		
		WebElement element = driver.findElement(By.className("selectpicker"));
		
	org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(element);
	
	List<WebElement> oselect = select.getOptions();
	if(select.isMultiple())
	{
		
	select.selectByIndex(0);
	select.selectByIndex(1);
	select.selectByIndex(2);
	select.selectByIndex(3);
	select.selectByIndex(4);
		
		System.out.println("Total Dropdown Element is"  +"::" + oselect.size());
	for(int i=0;i<oselect.size();i++)
	{
	String selectText=	oselect.get(i).getText();
	
	System.out.println("Total Select Element Text is "+"::"+ selectText);
		
	}
	List<WebElement> oselect1 = select.getAllSelectedOptions();
	
	for(int i=0;i<oselect1.size();i++)
	{
	String selectText1=	oselect1.get(i).getText();
	
	System.out.println("Total Selected Element Text is "+"::"+ selectText1);
		
	}
		
	
	}
		
	else
	{
		
		System.out.println("Select is not Multiple");
		
		select.selectByIndex(22);
		
	}	
		
		
	}
	
	
	
	

}
