package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"D:\\AutomationRepo_09192019\\BasicCoreJava\\src\\FileHandling\\TextData.xls");

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet = wb.getSheet("Sheet1");

		HSSFRow row = sheet.getRow(0);

		HSSFCell cell = row.getCell(0);

		System.out.println(cell.getStringCellValue());
		
		//Number of Rows
		System.out.println(sheet.getLastRowNum());
		
		//Column number
		System.out.println(row.getLastCellNum());

	}

}
