package day40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PerticularCellValueUpdateDemo {

	public static void main(String[] args) throws IOException {
		// perticular data update demo.
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("randomValue");
		
		XSSFRow row = sheet.createRow(3);
		
		XSSFCell cell = row.createCell(2);
		
		cell.setCellValue("Perticular Value Entered.");
		
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\PerticularData.xls");
		
		wb.write(file);
		wb.close();
		file.close();
		
		System.out.println("File created Successfully...");

	}

}
