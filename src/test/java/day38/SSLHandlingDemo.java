package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // Accept SSL certificates.
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println("With options class the SSL is handled...");
		
	}

}
