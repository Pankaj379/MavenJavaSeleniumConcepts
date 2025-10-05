package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleLoginTest {
	
	// Test case to run orange hrm and logout.
	
	WebDriver driver; // This should be publically shared to all methods within the class.
  
	@Test(priority=1)
	void openApp()
	{
		//WebDriver driver = new ChromeDriver(); This will work only within this method not outside this method.
		// So, the webDriver should be publically shared within this class.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=2)
	void logoCheck() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed: "+ logo);
		
	}
	
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	@Test(priority=4)
	void logout()
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	
	@Test(priority=5)
	void closeApp() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
}
