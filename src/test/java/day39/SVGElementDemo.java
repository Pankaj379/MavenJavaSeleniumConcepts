package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementDemo {

	public static void main(String[] args) {
		// Handle SVG ELements.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Login with the credentials:
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		// Find the svg Element and try to automate: https://prnt.sc/ib8tJjxNeSGS
		// SVG elements have one common thing they are identified by name tag.
		
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M511.004,4')]")).click();
		driver.quit();

	}

}
