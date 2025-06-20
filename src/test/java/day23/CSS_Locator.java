package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {

	public static void main(String[] args) {
		// CSS selector locator.
		
		WebDriver driver = new ChromeDriver();
		// URL: 
		driver.get("https://www.nopcommerce.com/");
		
		// Maximize window.
		driver.manage().window().maximize();
		
		// tagID
		
		driver.findElement(By.cssSelector("test"));
		
		

	}

}
