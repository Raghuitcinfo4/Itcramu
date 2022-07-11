package com.selenium.proj;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class regist_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/itctesting31/Desktop/project/register.html");

		
		driver.findElement(By.id("name")).sendKeys("raghu");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("raghu4");
		Thread.sleep(2000);
		
		driver.findElement(By.id("mail")).sendKeys("raghu123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("phone")).sendKeys("7483146110");
		Thread.sleep(2000);
	
		driver.findElement(By.id("pass")).sendKeys("raghu12");
		Thread.sleep(2000);
		
		driver.findElement(By.id("conpass")).sendKeys("raghu12");
		Thread.sleep(2000);
		
		WebElement radioboxSelect=driver.findElement(By.id("boy"));
		Boolean isSelect=radioboxSelect.isSelected();
		if(isSelect==false)
		{
			radioboxSelect.click();
		}
		Thread.sleep(2000);
			
		driver.findElement(By.id("submit")).click();
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
	
			driver.close();
		}
		
		

	}


