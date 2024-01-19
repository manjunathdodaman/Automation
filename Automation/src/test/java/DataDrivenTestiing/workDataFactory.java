package DataDrivenTestiing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class workDataFactory {
@Test
	public void ReadNumericData() throws EncryptedDocumentException, IOException {
		
		 FileInputStream fis = new FileInputStream("./src/test/resources/Workbookfactory.xlsx");
		           Workbook  workbook = WorkbookFactory.create(fis);
		          Sheet sheet = workbook.getSheet("sheet1");
		        Row row = sheet.getRow(2);
		     Cell cell = row.getCell(0);
		    Long cellValue = (long)cell.getNumericCellValue();
		    System.out.println(cellValue);
		          
	}
@Test
public void ReadStringData() throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream("./src/test/resources/Workbookfactory.xlsx"); 
	          Workbook  workbook = WorkbookFactory.create(fis);
	    Sheet   sheet =  workbook.getSheet("sheet1");
	 Row  row = sheet.getRow(2);
  Cell cell	= row.getCell(2);
 String cellValue = cell.getStringCellValue();
 System.out.println(cellValue);
	
}
}
