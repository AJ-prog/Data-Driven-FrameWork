package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


// creating this class to be able to read the data from excel file 
public class ExcelReader {

	// Global Variables
	//String= path , FileInputstream= fis , 
	//XSSFworkbook , XSSFsheet , XSSFrow , XSSFcell
	public String path;
	public FileInputStream fis = null;;
	public XSSFWorkbook workbook= null;;
	public XSSFSheet sheet= null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	//XSSF used for 2010 or late version
	//HSSF used for 2017 or earlier version 
	
	// Constructor to initialize variables
	public ExcelReader (String path) {
		this.path = path;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(0);
	}
	
	// Method to call the value
	public String getCellData(String sheetName, String colName , int rowNum) {
		//For sheet
		int index = workbook.getSheetIndex(sheetName);
		int col_Num = 0;
		sheet = workbook.getSheetAt(index);
		
		//For Row
		row = sheet.getRow(0);
		for(int i = 0; i<row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName)) {
				col_Num = i;	
		 }	
		}

		// For Column
		row = sheet.getRow(rowNum-1);
		cell =  row.getCell(col_Num);
		return cell.getStringCellValue();
	}	 
}

