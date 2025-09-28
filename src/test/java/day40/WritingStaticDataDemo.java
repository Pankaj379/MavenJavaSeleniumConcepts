package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingStaticDataDemo {

	public static void main(String[] args) throws IOException {
		// Writing the static data into the sheet.

		// 1st Step: Create a workbook.
		XSSFWorkbook wb = new XSSFWorkbook();

		// 2nd Step: Creat sheet in it with name.
		XSSFSheet sheet = wb.createSheet("Data"); 
		// if empty sheet is present then use getsheet method.

		// 3rd Step Write data into it.
		// First Row:
		XSSFRow row1 = sheet.createRow(0); 
		// same if using existing same empty file then get methods will be used everywhere.

		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Cut off Numbers");
		row1.createCell(2).setCellValue("Score");
		row1.createCell(3).setCellValue("Result");

		// 2nd Row:
		XSSFRow row2 = sheet.createRow(1);

		row2.createCell(0).setCellValue("Mehak");
		row2.createCell(1).setCellValue(40);
		row2.createCell(2).setCellValue(70);
		row2.createCell(3).setCellValue("Pass");

		// 3rd Row:
		XSSFRow row3 = sheet.createRow(2);

		row3.createCell(0).setCellValue("Akshay");
		row3.createCell(1).setCellValue(40);
		row3.createCell(2).setCellValue(80);
		row3.createCell(3).setCellValue("Pass");

		// 3rd Row:
		XSSFRow row4 = sheet.createRow(3);

		row4.createCell(0).setCellValue("Pankaj");
		row4.createCell(1).setCellValue(40);
		row4.createCell(2).setCellValue(90);
		row4.createCell(3).setCellValue("Pass");
		
		// 4th Step: Creat file and add data into the file.
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\staticdata.xls");
		
		// 5th step add data into the file.
		wb.write(file);
		wb.close();
		file.close();
		
		System.out.println("The sheet is created successfully...");
		

	}

}
