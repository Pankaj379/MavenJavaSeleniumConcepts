package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDriverDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Data driver demo for excel.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		
		String filePath = System.getProperty("user.dir")+("\\testdata\\ExelUtil.xlsx");
		
		int row = ExcelUtilFile.getRowCount(filePath, "Sheet1");
		
		for(int i=1;i<=row;i++) {
			// 1) Read data from the excel:
			String pri = ExcelUtilFile.getCellData(filePath, "Sheet1", i, 0); // column in java also starts from zero but in excel from 1.
			String rate = ExcelUtilFile.getCellData(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtilFile.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtilFile.getCellData(filePath, "Sheet1", i, 3);
			String freq = ExcelUtilFile.getCellData(filePath, "Sheet1", i, 4);
			String mValue = ExcelUtilFile.getCellData(filePath, "Sheet1", i, 5);
			
			
			//  2) Pass data to the application:
			
			driver.findElement(By.id("principal")).sendKeys(pri);
			
			driver.findElement(By.id("interest")).sendKeys(rate);
			
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select selPeriod = new Select(driver.findElement(By.id("tenurePeriod")));
			selPeriod.selectByVisibleText(per2);
			
			Select selInterest = new Select(driver.findElement(By.id("frequency")));
			selInterest.selectByVisibleText(freq);
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); // to click on calculate button.
			
			
			
			
			
			// 3) Most Important Validations:
			String actValue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText(); // dynamic x-path
			
			if(Double.parseDouble(mValue)==Double.parseDouble(actValue))
			{
				System.out.println("Test Passed...");
				ExcelUtilFile.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtilFile.fillGreenColor(filePath, "Sheet1", i, 7);
				
			}
			else
			{
				
				System.out.println("Test Failed...");
				ExcelUtilFile.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtilFile.fillRedColor(filePath, "Sheet1", i, 7);
				
			}
			Thread.sleep(3000); // only to view the script.
			// Before moving next round of row then clear is necessary.
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
			
		} // ending of the for loop.
		
		driver.quit();
		
		// Note: Before the execution of script close the opened same excel file-
		// -because some time it's locked if opened then data weill not update automatically.
	}

}
