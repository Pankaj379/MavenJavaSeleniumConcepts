package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDownDemo {
	
	public static void main (String args[]) {
		
	// Hidden Dropdown.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// Login page handled.
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Clicking on PIM option.
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();
		
		// CLick on Hidden dropdown
		// To select hidden dropdown use have to uncheck the checkbox : https://prnt.sc/PpzbLjyucr5L
		// Then the window will freeze when click on selector hub debugger.
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		
		// Read only one option.
		// driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();

		// Count number of options.
		List<WebElement> listDropdown = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("No. of options:" + listDropdown.size());
		
		// Print options.
		for(WebElement options:listDropdown) {
			System.out.println(options.getText());
			
		}
		
	}

}
