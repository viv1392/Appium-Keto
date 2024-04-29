package appium.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
	@Test
	public void excelReading() throws IOException {
		
		String file="C:\\Users\\HISPL\\eclipse-workspace\\ProjectAppium\\src\\test\\java\\resorurces\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(new File(file));
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(0);
		//int x = sheet.getPhysicalNumberOfRows();
		int y= row.getLastCellNum();
			for (int j = 0; j < y; j++) {
				XSSFCell cell1 = row.getCell(j);
				System.out.println(cell1);
			}
			book.close();
		}
		
	}


