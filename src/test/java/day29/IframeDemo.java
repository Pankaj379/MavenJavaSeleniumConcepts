package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		// Frame demo.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// Frame1:
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);


		// Now it will work within frame1.
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome Back");

		// frame 2:
		driver.switchTo().defaultContent(); // SS : https://prnt.sc/sibKq54Wxksz
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome back to frame 2");
		
		// Frame3:
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium with java.");
	
	// Entering to iframe:
	driver.switchTo().frame(0); // Switching to 1st part of the frame.
	WebElement rdButton = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
	//rdButton.click();
	
	// Execute using javascriptexecutor:
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", rdButton);
	// driver.quit();
	}

}
