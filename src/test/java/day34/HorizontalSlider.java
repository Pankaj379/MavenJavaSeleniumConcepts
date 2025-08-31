package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider {

	public static void main(String[] args) throws InterruptedException {
		// Horizontal Slider:
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
		Actions act = new Actions(driver);
		
		WebElement min_slide = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		System.out.println("Miniumum Location point :" +min_slide.getLocation()); // Miniumum Location point :(59, 250)

		
		act.dragAndDropBy(min_slide, 100, 194).perform();  // (x,y)values are: 
		System.out.println("Miniumum Location point :" +min_slide.getLocation()); // Miniumum Location point :(59, 250)

		Thread.sleep(3000);		// For max slider:
		WebElement max_slide = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		System.out.println("Maximum point is :" + max_slide.getLocation());// Maximum point is :(299, 196)
		
		act.dragAndDropBy(max_slide, -100, -196).perform(); 
		System.out.println("Now max point is :"+ max_slide.getLocation());
		
		driver.quit();

	}

}
