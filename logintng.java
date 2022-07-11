package com.selenium.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class logintng {
WebDriver driver;
WebDriverWait wait;
HSSFWorkbook workbook;
HSSFSheet sheet;
XSSFCell cell;

@BeforeClass
public void beforeClass() {
System.out.println("Before Class");
}

@BeforeMethod
public void beforeMethod() throws Exception {
String path1 = "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
driver = new ChromeDriver();
driver.get("file:///C:/Users/itctesting31/Desktop/project/login.html");
}

@Test
public void login() throws Exception
{
File src = new File("‪C:\\Users\\itctesting31\\Documents\\Book1.xlsx");
FileInputStream fis = new FileInputStream(src);
@SuppressWarnings("resource")
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1 = wb.getSheetAt(0);
System.out.println("login to Bike gallery");
XSSFCell cell = sheet1.getRow(0).getCell(0);
driver.findElement(By.id("name")).sendKeys(cell.getStringCellValue());
XSSFCell cell1 = sheet1.getRow(1).getCell(0);
driver.findElement(By.id("password")).sendKeys(cell1.getStringCellValue());
XSSFCell cell2 = sheet1.getRow(2).getCell(0);
driver.findElement(By.id("login")).sendKeys(cell2.getStringCellValue());
XSSFCell cell3 = sheet1.getRow(3).getCell(0);
//driver.findElement(By.id("mail")).sendKeys(cell3.getStringCellValue());


driver.findElement(By.id("Submit")).click();
Alert alert = driver.switchTo().alert();
alert.accept();
}

@AfterMethod
public void afterMethod() {
// driver.close();
}

@AfterClass
public void afterClass() {
System.out.println("After Class");
}
}