package day36;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingbyJavaScript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1) Scroll down the page:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,1500)", ""); // 1500
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 2) Scroll by visible text:
		//WebElement scrolEle = driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
		//js.executeScript("arguments[0].scrollIntoView();", scrolEle);
		//System.out.println(js.executeScript("return window.pageYOffset;")); // 1916.800048828125
		
		// 3) Scroll till the end of the page:
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); // 3387.199951171875

		Thread.sleep(4000);
		
		// 4) Scroll up to initial page:
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  // 0
		
		// Horizontal scroll bar same methods are used but on x-axis.
		
		driver.quit();

	}

}
