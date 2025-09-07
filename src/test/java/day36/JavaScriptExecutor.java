package day36;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// Js and web driver are not parent inheritence.
			// WebDriver driver = new ChromeDriver();
			
			 ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
			driver.get("https://testautomationpractice.blogspot.com/");
			
			// 1) Simple method without javascript executor but internally it's using javascript.
			//driver.findElement(By.id("name")).sendKeys("Pankaj");
			
			// 2) with javascript executor:
			WebElement nameValue = driver.findElement(By.id("name"));
			// Typecasting(javascriptExecutor) because it is with WebDriver and there is no relation of parent javascript() and WebDriver().
			// javascriptExecutor js = (javascriptExecutor) driver;
			
			
			// This is because the parent if chromedriver(); is javascriptExecutor.
			// This is alternate or sendkeys method if facing exception of ElementInterceptor.
			JavascriptExecutor js = driver;
			js.executeScript("arguments[0].setAttribute('value','Prince')" , nameValue );
			
			// for click: Alternate of click for radio and checkboxes etc.
			
			// 3) CLick with java executor.
			WebElement btnClick = driver.findElement(By.id("male"));

			js.executeScript("arguments[0].click()",btnClick);
			
			driver.quit();
			
		}


}
