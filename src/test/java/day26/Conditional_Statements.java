package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Statements {

	public static void main(String[] args) {
		// Conditional Statements.

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();


		// isDisplay()
		// 1st method:	
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Logo is displayed or not : "+ logo.isDisplayed());

		// 2nd Method:
		//boolean Status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(Status);


		// isEnabled() : It's used for button, radio buttons, fields etc on functionality based elements only not on static text.
		//boolean status = driver.findElement(By.xpath("//button[@id='vote-poll-1']")).isEnabled();
		//System.out.println(status);
		
		// isSelected()
	WebElement	male_Rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement	female_Rb = driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println("Before selection--------------------");
	System.out.println(male_Rb.isSelected());
	System.out.println(female_Rb.isSelected());
	
	System.out.println("After selecting male---------------------");
	male_Rb.click();
	System.out.println(male_Rb.isSelected());
	System.out.println(female_Rb.isSelected());
	
	System.out.println("After selecting female---------------------");
	female_Rb.click();
	System.out.println(male_Rb.isSelected());
	System.out.println(female_Rb.isSelected());
		
    driver.quit();


	}

}
