package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderdatepickerDemo {

	public static void main(String[] args) {
		// Calender date picker demo.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		// 1) Method One:-
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("13/08/2025");
		
		// 2) Method Two Using Date picker:- 
		// https://prnt.sc/db0v0xyPK1hs
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // Open the calender
		
		// Expected Date.
		String year = "2024";
		String month = "May";
		String date = "20";
		
		while(true)
		{
		
		String current_Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String current_Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(current_Month.equals(month) && current_Year.equals(year))
		{
			break;
		}
		
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Click on Next.
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Click on Previous.
		
		
		}
			
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement pdate:allDates)
			
		{
			if(pdate.getText().equals(date)) 
			{
				pdate.click();
				break;
			}
			
		}
		
		

	}

}
