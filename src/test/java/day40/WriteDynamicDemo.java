package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicDemo {

	public static void main(String[] args) throws IOException {

		// Writing data dynamically.

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("DynamicData");

		// To write data dynamically use scanner class.

		Scanner sc = new Scanner(System.in);

		// Creating no of rows.
		System.out.println("Enter no of rows : ");
		int rows = sc.nextInt();

		// Creating no of cells
		System.out.println("Enter no of cells : ");
		int cells = sc.nextInt();

		for(int r=0;r<=rows; r++) {

			XSSFRow currentrow = sheet.createRow(r);

			for(int c=0;c<cells;c++){
				XSSFCell cellValue = currentrow.createCell(c);
				cellValue.setCellValue(sc.next());
			}
			System.out.println();
		}
		

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\dynamicData.xls");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File created Successfully...");
	}
	

}
