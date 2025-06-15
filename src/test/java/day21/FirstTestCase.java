package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// Test case:
		// 1) Lauch chrome browser.
		// 2) Open URL: https://demo.automationtesting.in/Register.html or https://demoblaze.com/
		// 3) Validate tittle should be "Register".
		// 4) Close browser.

		// 1) Lauch chrome browser.
		//	ChromeDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		// Note: WebDriver is parent of all Chrome/edge/firefox driver.
		
		// 2) Open URL: https://demo.opencart.com
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// 3) Validate tittle should be "your Score".
		
		String act_Title = driver.getTitle();
		System.out.println(act_Title);
		if(act_Title.equals("Register")) {
			System.out.println("Test Pass");
		}
		else{
			System.out.println("Test Fail.");
		}
		
		// 4) Close browser.
		driver.close();
		System.out.println("Test Case is passed now...");
	//	driver.quit();
		
	}

}
