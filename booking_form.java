package com.selenium.proj;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class booking_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting31/Desktop/project/booking.html");
		driver.findElement(By.id("fname")).sendKeys("Raghu");
		driver.findElement(By.id("lname")).sendKeys("ram");
		driver.findElement(By.id("mail")).sendKeys("raghu123@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7483146110");
		driver.findElement(By.id("add")).sendKeys("behind vinayaka hotel");
		driver.findElement(By.id("min")).sendKeys("1");
		driver.findElement(By.id("max")).sendKeys("1223444234");
		
		Select se=new Select(driver.findElement(By.xpath("//*[@id='opt']")));
		se.selectByIndex(1);		
		
	WebElement checkboxSelect=driver.findElement(By.id("v1"));
	Boolean isSelect=checkboxSelect.isSelected();
	if(isSelect==false)
	{ 
		checkboxSelect.click();
	}
		
	driver.findElement(By.id("sub")).click();
	driver.switchTo().alert().accept();
		
			//driver.close();
		}
	}


