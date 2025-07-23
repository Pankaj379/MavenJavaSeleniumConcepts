package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Dropdown {

	public static void main(String[] args) {
		// Bootstrap dropdown demo.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		// Open dropdown option.
		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]")).click();
		
		
		
		

	}

}
