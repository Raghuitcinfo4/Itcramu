package com.selenium.proj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void setUp() {
	  String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/itctesting31/Desktop/project/register.html");

		
		driver.findElement(By.id("name")).sendKeys("raghu");
		
		driver.findElement(By.id("username")).sendKeys("raghu@ramu4");
		
		driver.findElement(By.id("mail")).sendKeys("raghu123@gmail.com");
		
		driver.findElement(By.id("phone")).sendKeys("7483146110");
	
		driver.findElement(By.id("pass")).sendKeys("raghu12");
		
		driver.findElement(By.id("conpass")).sendKeys("raghu12");
		
		WebElement radioboxSelect=driver.findElement(By.id("boy"));
		Boolean isSelect=radioboxSelect.isSelected();
		if(isSelect==false)
		{
			radioboxSelect.click();
		}
			driver.findElement(By.id("submit")).click();
			
			driver.switchTo().alert().accept();
	
			driver.close();
		}
		
		
  
  @BeforeMethod
  public void beforeMethod() {
	  String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
