package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Auto_Suggestion_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Handling Auto Suggestion Dropdown.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> dropOptions = driver.findElements(By.xpath("//ul//div[@role='option']"));
		
		System.out.println("Size of the dropdown search elements: "+ dropOptions.size());
		
		for(int i=0 ; i<dropOptions.size() ; i++) {
			System.out.println(dropOptions.get(i).getText());
			
			if(dropOptions.get(i).getText().equals("selenium download")) {
				dropOptions.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		
		//driver.quit();

	}

}
