package test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("htts://adactinhotelapp.com/");
		//driver.close();
		
	}

}
