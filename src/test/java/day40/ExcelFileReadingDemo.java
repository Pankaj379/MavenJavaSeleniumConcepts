package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadingDemo {

	public static void main(String[] args) throws IOException {
		// Reading and writing data into excel file : https://prnt.sc/S4U39fxuMQ-W

		// Hirercy is: Excel Workbook -> Sheets -> rows -> cells

		// for reading user file input stream.

		// Step1: file should be in project and read from the project itself.
		FileInputStream readFile = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");

		// Step2: Read the file.
		XSSFWorkbook workbook = new XSSFWorkbook(readFile);

		// Step3: Read the sheet number.

		//XSSFSheet sheet1 = workbook.getSheetAt(0); // with index number.
		XSSFSheet sheet1 = workbook.getSheet("Sheet1"); // Reading file with name.

		// step4 : To find the total number of rows.
		int totalrows = sheet1.getLastRowNum();

		// Step5: TO find total number of cells.
		int totalcells = sheet1.getRow(1).getLastCellNum();

		System.out.println("Total rows in sheet : "+ totalrows); // 4
		System.out.println("Total cells in sheet : "+ totalcells); // 4
		// Note: most important rows are count from 0 and colums are read from 1.
		// Note: Acc to excel repo the column count starts from 1 but with java the column also count from zero.
		// Note: https://prnt.sc/gBBOZCexCzOK
		// Now in out put the error comes: 2025-09-28T07:19:56.397028700Z main ERROR Log4j API could not find a logging provider.
		// THis is not a blocker but to avoid this use log4j repo from mvn repo.


		for(int r=0;r<=totalrows;r++) { // Read rows

			XSSFRow currentRow = sheet1.getRow(r);

			for(int c = 0;c<totalcells;c++) { // Read columns Note: https://prnt.sc/gBBOZCexCzOK
				// Note: most important rows are count from 0 and colums are read from 1.

				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString() + "\t"); // for tab space between elements.
			}
			System.out.println();// This will jump to next line after printing all cell value of the row.

		}

		workbook.close(); // after done the work we will close the file otherwise it'll get memory space.
		readFile.close(); // after done the work we will close the file otherwise it'll get memory space.
		// NOte: IN result data there is a age data shown with e.g. 27.0 -
		// -this is because we are reading int as string with to string method.



	}

}
