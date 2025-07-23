package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		// Get methods.

		WebDriver driver = new ChromeDriver();

		// 1) get() : Open the URL of the page.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(9000);

		// 2) getTitle() : Return title of the page.
		//System.out.println(driver.getTitle());
		
		// 3) getCurrentUrl() : return url of the page.
		//System.out.println(driver.getCurrentUrl());
		
		// 4) getPageSource() : Return source code of the page.
		//System.out.println(driver.getPageSource());
		
		// 5) getWindowHandle() : Return ID of single browser window.
		//String winID =driver.getWindowHandle();
		//System.out.println(winID);
		
		// 6) getWindowHandled() : To get the current multiple window IDs.
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> multiWind = driver.getWindowHandles();
		System.out.println(multiWind); // [BFDCBB659C38FE35ED27D5535E7C0476, 3F8F622C25F200E20D7F722AD6B3C5D7]
		
		
		driver.quit();


	}

}
