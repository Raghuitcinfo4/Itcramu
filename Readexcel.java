package readexceldata;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel  
{
	public static void main (String [] args) throws IOException{
		String execFilePath="C:\\Users\\itctesting31\\Downloads\\registration.xlsx";
		FileInputStream inputstream=new FileInputStream(execFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Iterator  iterator= sheet.iterator();
		while(iterator.hasNext())
		{
			XSSFRow row=(XSSFRow) iterator.next();
		Iterator cellIterator =	row.cellIterator();
		while(cellIterator.hasNext())
		{
			XSSFCell cell=(XSSFCell) cellIterator.next();
			switch(cell.getCellType())
			{
			case STRING:System.out.print(cell.getStringCellValue()); break;
			case NUMERIC:System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
			
			}
			System.out.print("   |  ");
		}
			System.out.println();
					
		
		
		
		
		
		}
	}
}


