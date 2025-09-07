package day36;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		// Other imp concepts of js
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='70%'");
		Thread.sleep(2000);
		

	}

}
