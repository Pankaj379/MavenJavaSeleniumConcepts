package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationMessageDemo {

	public static void main(String[] args) {
		// Disable the chome is handled by automated tool.
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.quit();
		
		

	}
}

