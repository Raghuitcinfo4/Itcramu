package bike321123;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class contact {
	
	private WebDriver driver;
private ExcelUtility utility;

  @Test(dataProvider = "getTestData")
  
	  
  public void test(String FirstName, String LastName, String Email,String phno, String Message) throws InterruptedException
  {
  driver.findElement(By.id("t1")).sendKeys(FirstName);
  driver.findElement(By.id("t2")).sendKeys(LastName);
  Thread.sleep(1000);
  driver.findElement(By.id("t3")).sendKeys(Email);
  driver.findElement(By.id("t4")).sendKeys(phno);
  Thread.sleep(1000);
  driver.findElement(By.id("t5")).sendKeys(Message);
  Thread.sleep(1000);
  driver.findElement(By.id("t6")).click();
  Thread.sleep(2000);
  //driver.switchTo().alert().accept();
  }
  
  @BeforeMethod
  public void setup() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
  this.driver = new ChromeDriver();

  driver.get("file:///C:/Users/itctesting31/Desktop/project/contact.html");
  Thread.sleep(2000);

  }


  @DataProvider
  public Object[][] getTestData() throws Exception {
	  utility = new ExcelUtility();

	  int totalRows = utility.getRowCount("C:\\Users\\itctesting31\\Documents\\bikegallery.xlsx","Sheet4");
	  int totalColumns = utility.getColumnCount("C:\\Users\\itctesting31\\Documents\\bikegallery.xlsx","Sheet4");
	  System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

	  Object[][] data = new Object[totalRows][totalColumns];
	  for (int i = 0; i < totalRows; i++) {
	  for (int j = 0; j < totalColumns; j++) {
	  data[i][j] = new ExcelUtility()
	  .getData("C:\\Users\\itctesting31\\Documents\\bikegallery.xlsx", "Sheet4", i, j);
	  }
	  }
	  return data;
	  }
  @AfterMethod
  public void login()
  {
  	driver.quit();
  }
  }

