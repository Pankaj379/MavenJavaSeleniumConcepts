package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		// Mouse hover actions.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// Mouse hover elements:
		WebElement desktop = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement notebooks = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"));
		
		Actions act = new Actions(driver);
		
		// act.moveToElement(desktop).moveToElement(notebooks).build().perform(); // build is executing 2 times here.
		
		// act.moveToElement(desktop).moveToElement(notebooks).perform(); // Here perform internally itself creating the build() method one time : https://prnt.sc/rIO1sTwUW8xV
		act.moveToElement(desktop).moveToElement(notebooks).click().perform(); // TO click.
		
		
		

	}

}
