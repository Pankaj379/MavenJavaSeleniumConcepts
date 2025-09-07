package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		// File Upload Methods:
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		// Single File upload:
		/*
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("F:\\uploads\\Test.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test.txt")) 
		{
			System.out.println("The file is uploaded successfully..");
		}else 
		{
			System.out.println("The file is not uploaded..");
		}
		*/
		
		// For Multiple File Upload:
		String file1 = "F:\\uploads\\Test.txt";
		String file2 = "F:\\uploads\\Test1.txt";
		String file3 = "F:\\uploads\\Test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2+"\n"+file3);
		
		int noOfFiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		// 1) Validate the number of files uploaded:
		if(noOfFiles==3)
		{
			System.out.println("The three files are successfully uploaded..");
		}else
		{
			System.out.println("All files are not uploaded..");
		}
		
		// 2) Validate the name of the files uploaded:
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test.txt") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test1.txt")
				 && driver.findElement(By.xpath("//ul[@id='fileList']//li[3]")).getText().equals("Test2.txt"))
				 {
			System.out.println("File names are matched...");
				 }else
				 {
					 System.out.println("File names are not matched...");
				 }
		
		driver.quit();

	}

}
