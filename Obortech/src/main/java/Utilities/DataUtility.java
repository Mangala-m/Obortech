package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String datafromPropertiesfile(String key) throws Throwable
	{
		File file=new File("./src/main/resources/Credentials.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pr=new Properties();
		pr.load(fis);
		String value = pr.getProperty(key);
		return value;
	}
	
	
	public class DataUtility1
	{
		public String dataformExcelfile(String sheetname,int rownum, int cellnum) throws Throwable
		{
			File file=new File("./src/main/resources/Credentials.properties");
			FileInputStream fis=new FileInputStream(file);
			Workbook workbook=WorkbookFactory.create(fis);
			Sheet sheet= workbook.getSheet(sheetname);
			Row row=sheet.getRow(rownum);
			
			DataFormatter formatter=new DataFormatter();
			String value=formatter.formatCellValue(row.getCell(cellnum));
			return value;
		}
	}

}
