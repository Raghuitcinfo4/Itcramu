package com.selenium.proj;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting31/Desktop/project/login.html");
		Thread.sleep(2000);
		driver.findElement(By.id("Username")).sendKeys("raghu");
		driver.findElement(By.id("Password")).sendKeys("ITc@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		//driver.close();
		
		
	}

}
