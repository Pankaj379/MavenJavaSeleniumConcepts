package day45;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	WebDriver driver;
	
	@BeforeClass
	void Setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "dp")
	void testCase(String email , String pwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("qwerty12@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		
		//driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("qwerty@123");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
			
		}else {
			Assert.fail(); // forcefully fail the test case.
		}
		
	}
	
	@AfterClass
	void TearDown() {
		
		driver.quit();
		
	}
	
	@DataProvider(name = "dp", indices= {0,3})
	// now only first and 4th data will be use as input only specific inputs.
	// data provider method always user two dimensinal array to get the data.
	Object [][] loginCase()    
	// 2 dim means n no of rows/columns return type is any object/string/number.
	
	 {
	Object data [][]  = // we can use string/num but object type is better.
		{
			
			{"testcase01@gmail.com","Test@01"},
			{"testcase02@gmail.com","Test@12"},
			{"testcase03@gmail.com","Test@12"},
			{"testcase01@gmail.com","Test@12"},
			{"testcase05@gmail.com","Test@12"},
			
			
		};
	return data; // same here return should be provided.
	
	 }
}
