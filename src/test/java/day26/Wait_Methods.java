package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Methods {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 2)
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			
		//	Thread.sleep(4000);// 1) Pause the execution for sometime.
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		}

	}
