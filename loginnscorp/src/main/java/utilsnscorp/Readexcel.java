package utilsnscorp;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	public static void main() throws IOException
	{

	String fileloc="./test-data/logindata.xlxs";
	XSSFWorkbook wbook=new XSSFWorkbook(fileloc);
	XSSFSheet sheet=wbook.getSheetAt(0);
	for (int i = 1; i <= 2; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < 2; i++) {
			XSSFCell cell = row.getCell(j);
			String userval = cell.getStringCellValue();
		} 
	}
	
	}
}
