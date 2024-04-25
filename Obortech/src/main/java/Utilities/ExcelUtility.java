package Utilities;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
 
public class ExcelUtility {
 
	public FileInputStream fis;
	public FileOutputStream fos;
	public Workbook workbook;
	public Sheet sheet;
	public Row row;
	public Cell cell;
	String path=null;
	public ExcelUtility(String path)
	{
		this.path=path;
	}
	public int getRowCount(String sheetName) throws Throwable
	{
		 fis=new FileInputStream(path);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return rowcount;

	}
	public int getCellCount(String sheetName,int rownum) throws Throwable
	{
		 fis=new FileInputStream(path);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		//workbook.close();
		//fis.close();
		return cellcount;

	}

	public String getCellData(String sheetName,int rownum,int colnum) throws Throwable
	{
		fis=new FileInputStream(path);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		DataFormatter formatter=new DataFormatter();
		String data;
		data=formatter.formatCellValue(cell);

		//workbook.close();
		//fis.close();
		return data;


	}

 
	
}