package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIn_Incognito_Mode {

	public static void main(String[] args) {
		// Run Test Case in Incognito Mode.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.quit();
	}

}
