//package Utilities;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Properties;
//
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//public class DataUtility {
//	public String datafromPropertiesfile(String key) throws Throwable
//	{
//		File file=new File("./src/main/resources/Credentials.properties");
//		FileInputStream fis=new FileInputStream(file);
//		Properties pr=new Properties();
//		pr.load(fis);
//		String value = pr.getProperty(key);
//		return value;
//	}
//	
//	
//	public class DataUtility1
//	{
//		public String dataformExcelfile(String sheetname,int rownum, int cellnum) throws Throwable
//		{
//			File file=new File("./src/main/resources/Credentials.properties");
//			FileInputStream fis=new FileInputStream(file);
//			Workbook workbook=WorkbookFactory.create(fis);
//			Sheet sheet= workbook.getSheet(sheetname);
//			Row row=sheet.getRow(rownum);
//			
//			DataFormatter formatter=new DataFormatter();
//			String value=formatter.formatCellValue(row.getCell(cellnum));
//			return value;
//		}
//	}
//
//}





package Utilities;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
 
public class DataUtility {
	public String dataFromPropertiesFile(String key) throws Throwable
	{
		File file=new File("./src/main/resources/Credentials.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pr=new Properties();
		pr.load(fis);
		String value=pr.getProperty(key);
		return value;
	}

 
@DataProvider(name="Recipient")
public String[][] getData() throws Throwable
{
	
	String path="C:\\Users\\Mangala\\OneDrive - chaincode consulting llp\\Obortechtestdata.xlsx";

 //String path="";
	
	ExcelUtility excel=new ExcelUtility(path);
	
	int totalrows=excel.getRowCount("Sheet1");
	int totalcols=excel.getCellCount("Sheet1", 1);

	String recipientdata[][]=new String[totalrows][totalcols];

			for(int i=1;i<=totalrows;i++)
			{
				for(int j=0;j<totalcols;j++)
				{
					recipientdata[i-1][j]=excel.getCellData("Sheet1", i, j);
				}
			}

 
return recipientdata;
}			

}
 


