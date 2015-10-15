package framework.dataaccess;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
	public String getExcelData(String filePath, String sheetName, int rowNumber, int colNumber) throws IOException
	{
		
				
		XSSFWorkbook workbook = new XSSFWorkbook(filePath);
		System.out.println("SheetCount : " + workbook.getNumberOfSheets());
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		String retValue = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
		System.out.println(retValue);
		
		workbook.close();
		return retValue;
		
	}
	
 public void setExcelData(String filePath, String sheetName, int rowNumber, int colNumber, String value) throws IOException
 {
	XSSFWorkbook workbook = new XSSFWorkbook(filePath);
	System.out.println("SheetCount : " + workbook.getNumberOfSheets());
	
	XSSFSheet sheet = workbook.getSheet(sheetName);
	
	XSSFRow row = sheet.getRow(rowNumber);
	XSSFCell cell = row.getCell(colNumber, XSSFRow.RETURN_BLANK_AS_NULL);
	
	if (cell == null)
		cell = row.createCell(colNumber);
	cell.setCellValue(value);
	
	workbook.write(new FileOutputStream(filePath));
	workbook.close();
	
	
 }
 

}

/*for (int r = 1; r < sheet.getPhysicalNumberOfRows(); r++) 
{
	XSSFRow row = sheet.getRow(r);
	XSSFCell usernameCell = row.getCell(1);
	XSSFCell passCell = row.getCell(2);
	
	System.out.println("Username: " + usernameCell.getStringCellValue());
	System.out.println("Username: " + passCell.getStringCellValue());
	
}*/
