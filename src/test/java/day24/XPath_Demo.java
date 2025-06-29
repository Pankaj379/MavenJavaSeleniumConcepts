package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Demo {

	public static void main(String[] args) {
		// X-path concepts.

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/index.php?route=common/home");
		driver.manage().window().maximize();

		// Xpath with single attribute.
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirt");

		// Xpath with multiple attributes.
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Tshirt");

		// Xpath with and and or operator.
		// and means both should be true.
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Tshirt");
		// Or means only one should be true.
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("Tshirt");

		// By using link & innertext.
		// SS : https://prnt.sc/DLFsOfcYATjJ
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		// Using inner text.
		// Note: SB tag is newely added and not supported by selenium only supported with latest technologies like playwright.
		// why inner text is used because in some cases only inner text is used not other locators.
		//boolean linkStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed(); // true.
		//String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println("Inner text visibility : "+value); // Featured
		
		// By using contains and starts-with.
		//driver.findElement(By.xpath("//input[contains(@placeholder,'rch')]")).sendKeys("SHIRT");
		
		// Difference between both.
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("SHIRT");
		
		// Handle dynamic function usign contains and starts-with methods.
		// SS : https://prnt.sc/WvolF7wv2EEF
		// SS : https://prnt.sc/JoF3oirH3_T9
		// SS : https://prnt.sc/SobHAg34-XBP
		
		// By using chained x-path: It's combination of both relative and absolute x-path.
		// SS : https://prnt.sc/Jih6fSC7OkJO
		boolean dispStatus = driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
		System.out.println(dispStatus);
		
		// Next Topic SS : https://prnt.sc/VHPBzYeOYXp9
		
		driver.quit();
		driver.close();
		

	}

}
