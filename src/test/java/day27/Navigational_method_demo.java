package day27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_method_demo {

	public static void main(String[] args) throws MalformedURLException {
		// NAVIGATIONAL COMMANDS.
		
		WebDriver driver = new ChromeDriver(); // shift+ctrl+o to add required lib automatically.
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// SS : https://prnt.sc/Ga6Rf4NdtA7H
	//	URL myURL = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.navigate().to(myURL);
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // https://demo.nopcommerce.com/
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		
		driver.navigate().refresh();
		
		
		 driver.quit();

	}

}
