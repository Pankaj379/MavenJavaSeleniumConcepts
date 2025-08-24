package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo_2 {

	public static void main(String[] args) {
		// DatePickerDemo_2
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Expected Date.
		String year = "2023";
		String month = "May";
		String date = "20";
		
		// Selecting calender:
		driver.findElement(By.name("SelectedDate")).click();
		
		// Clicking on the Year dropdown button:
		WebElement yeardropdown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selYear = new Select(yeardropdown);
		selYear.selectByVisibleText(year);
		System.out.println(selYear.toString());
		
		// Same for month field:
		WebElement monthdropdown = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selmonth = new Select(monthdropdown);
		selmonth.selectByVisibleText(month);
		System.out.println(selmonth.toString());
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement reqDate:allDates)
			
		{
			if(reqDate.getText().equals(date)) 
			{
				reqDate.click();
				break;
			}	
			
		}
		

	}

}
