package day28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) To select one checkbox.
		//driver.findElement(By.id("monday")).click();
		
		// 2) Select all Checkboxes.
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		// 1st Approach:
		/*
		 * for(int i=0 ; i<checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 */
		
		// 2nd Approach:
		/*for(WebElement checkB:checkboxes) {
			checkB.click();
		}*/
		
		// 3) Select last 3 checkboxes.
		/*for(int i=4 ; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}*/
		
		// 4) Unselect checkbox if they are selected.
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(3000); // used to slow down the automation.
		
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
		driver.quit();

	}

}
