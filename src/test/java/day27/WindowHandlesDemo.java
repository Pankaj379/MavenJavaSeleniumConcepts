package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	public static void main(String[] args) {
		// Window handles.

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> windowIDs = driver.getWindowHandles();

		// Approach 1 : if have 2 or 3 windows.
		//List<String> windowList = new ArrayList(windowIDs); 
		// why list because we don't have get method in set collections.
		//String parentWin = windowList.get(0);
		//String childWin = windowList.get(1);

		// Now window is focused to first one parent.
		//System.out.println(driver.getTitle()); // OrangeHRM

		//driver.switchTo().window(childWin);
		//System.out.println(driver.getTitle());
		// Human Resources Management Software | OrangeHRM HR Software

		// Approach2: for multiple windows more than 2.
		for(String winId:windowIDs) {
			String winTitle = driver.switchTo().window(winId).getTitle();
			
			if(winTitle.equals("Human Resources Management Software | OrangeHRM HR Software") || winTitle.equals("other title"));
			{
	    System.out.println(driver.getCurrentUrl());// https://www.orangehrm.com/
	    driver.close();
			}
		}
		
	//	driver.quit();


	}

}
