package AUCC_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {
	
	public static Object[][] getTestDataFromExcel(String sheet1) throws IOException {
		Properties	prop = new Properties();

		File excelFile = new File(System.getProperty("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Book1.xlsx"));
	
			FileInputStream fisExcel = new FileInputStream(excelFile);
	        XSSFWorkbook workbook = new XSSFWorkbook(fisExcel);
		
		XSSFSheet sheet = workbook.getSheet(sheet1);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0;j<cols;j++) {
				
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				

				switch(cellType) {
				
				case STRING: 					
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC: 
					data[i][j] = cell.getStringCellValue();
					break;
				case BOOLEAN: 
					data[i][j] = cell.getStringCellValue();
					break;	
		
				}
				
			}
			
			
		}
		
		return data;
		
	}

}
