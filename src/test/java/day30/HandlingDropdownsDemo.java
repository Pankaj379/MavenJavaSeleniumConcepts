package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement cDD = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select cDrop = new Select(cDD);
		
		// 1st method: Select by visible text.
		//cDrop.selectByVisibleText("France");
		
		// 2nd Method: Select by value: https://prnt.sc/wA3eHclFO844
		
		//cDrop.selectByValue("uk"); // only possible if value attribute is present.
		
		// 3rd Method: By index.
		//cDrop.selectByIndex(2);
		
		// Capture option from dropdown.
		List<WebElement> options = cDrop.getOptions();
		System.out.println("Number of drop downs : "+ options.size());
		
		// Print options: Using normal for loop.
		/* for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		} */
		
		// Using enhanced for loop:
		for(WebElement opt : options) {
			System.out.println(opt.getText());
		}
		
	
	}

}
