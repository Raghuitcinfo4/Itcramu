package bike321123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebElement;
import com.google.common.base.Function;
import bike321123.ExcelUtility.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class booking {
	
	private WebDriver driver;
private ExcelUtility utility;

  @Test(dataProvider = "getTestData")
  
	  
  public void test(String FirstName, String LastName, String Address, String Email, String PhNum,String date, String Minm,String Maxm) throws InterruptedException {
		  driver.findElement(By.id("fname")).sendKeys(FirstName);
		  Thread.sleep(1000);
		  driver.findElement(By.id("lname")).sendKeys(LastName);
		  Thread.sleep(1000);
		  driver.findElement(By.id("add")).sendKeys(Address);
		  Thread.sleep(1000);
		  driver.findElement(By.id("mail")).sendKeys(Email);
		  Thread.sleep(1000);
		  driver.findElement(By.id("phone")).sendKeys(PhNum);
		  Thread.sleep(1000);
		  driver.findElement(By.id("DOB")).sendKeys(date);
		  Thread.sleep(1000);
		 
		  Select se = new Select(driver.findElement(By.xpath("//*[@id='opt']")));
		  se.selectByIndex(1);
		  Thread.sleep(2000);
		  WebElement checkboxSelect = driver.findElement(By.id("v1"));
		  Boolean isSelect = checkboxSelect.isSelected();
		  if (isSelect == false)
		  {
		  checkboxSelect.click();
		  }
		  driver.findElement(By.id("min")).sendKeys(Minm);
		  Thread.sleep(1000);
		  driver.findElement(By.id("max")).sendKeys(Maxm);
		  Thread.sleep(1000);
		  driver.findElement(By.id("sub")).click();
		//  driver.findElement(By.id("alert")).click();
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);

		  }

		  
		  
  @BeforeMethod
  public void setup() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
  this.driver = new ChromeDriver();

  driver.get("file:///C:/Users/itctesting31/Desktop/project/booking.html");
  Thread.sleep(2000);

  }


  @DataProvider
  public Object[][] getTestData() throws Exception {
	  utility = new ExcelUtility();

	  int totalRows = utility.getRowCount("C:\\Users\\itctesting31\\Documents\\bikegallery.xlsx","Sheet3");
	  int totalColumns = utility.getColumnCount("C:\\Users\\itctesting31\\Documents\\bikegallery.xlsx","Sheet3");
	  System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

	  Object[][] data = new Object[totalRows][totalColumns];
	  for (int i = 0; i < totalRows; i++) {
	  for (int j = 0; j < totalColumns; j++) {
	  data[i][j] = new ExcelUtility()
	  .getData("C:\\\\Users\\itctesting31\\Documents\\bikegallery.xlsx", "Sheet3", i, j);
	  }
	  }
	  return data;
	  }
  @AfterMethod
  public void register()
  {
  	driver.quit();
  }
}
