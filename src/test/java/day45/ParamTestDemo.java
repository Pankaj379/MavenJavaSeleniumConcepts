package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTestDemo {
	
	WebDriver driver;
	
	@Parameters({"browser" , "url"})
	@BeforeClass
	void setup(String br ,String url) throws InterruptedException
	{
		switch(br.toLowerCase()) // to avoid case senstivity.
		{
		case"chrome":driver = new ChromeDriver(); break;
		case"edge":driver = new EdgeDriver(); break;
		case"firefox":driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid Browser..");
		return; // This should be used because if there is invalid browser then rest of the code will execute.
		// but by using return keyword it will not execute further if browser is invalid.
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get(url);
		Thread.sleep(4000);
	}
	
	@Test(priority=1)
	void TestLogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void TestTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=3)
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
