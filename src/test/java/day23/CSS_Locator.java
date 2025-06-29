package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {

	public static void main(String[] args) {
		// CSS selector locator.
		
		WebDriver driver = new ChromeDriver();
		// URL: 
		driver.get("https://demo.nopcommerce.com/");
		
		// Maximize window.
		driver.manage().window().maximize();
		
		// 1) tagid: tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		// tag is optional just put #.
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts"); 
		
		
		// 2) Tag class tag.classname.
		// driver.findElement(By.cssSelector("input.search-box-text ui-autocomplete-input"))
		// Note: sometimes class name is very lengthy with parts so you can user first part only to locate element.
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Iphone");
		// again tag is optional and it will locate multiple findelements with same name like in demo.opencart app;
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Iphone");
		
		// 3) tag attributes:   tag[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mobiles");
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("mobiles");
		// Java don't allow double quotations inside the double quotations so back slash should be used or single quotes.
		// tag is optional.
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("mobiles");
		
		// 4) tag class attribute combination: https://prnt.sc/p8DRngEDf95L
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("shirt");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("shirt");
		
	}

}
