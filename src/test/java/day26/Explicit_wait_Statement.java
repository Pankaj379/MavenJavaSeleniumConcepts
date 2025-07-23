package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_Statement {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
		
			WebDriverWait drWait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		
			WebElement textField = drWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
			//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			textField.sendKeys("Admin");
			
			WebElement waitPass = drWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
			waitPass.sendKeys("admin123");
			
			WebElement loginBtn = drWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
			loginBtn.click();
			
			driver.quit();
			
		}
	}
