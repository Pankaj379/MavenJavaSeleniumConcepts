package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokeLinkCheck {

	public static void main(String[] args){
		// Broken Link Check.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " + links.size());
		
		int noOfBrokenLinks = 0; // To count no of broken links.
		
		for(WebElement weblinks : links) {
			String hrefAttValue = weblinks.getAttribute("href");
			if(hrefAttValue==null || hrefAttValue.isEmpty()) {
				System.out.println("The href attribute value is null or empty so not possible to check the broken link..");
				continue;
			}
			
			try {
			// Hit URL to server:
			URL urlLink = new URL(hrefAttValue); // This will convert href value from stirng to URL format.
			HttpURLConnection connc = (HttpURLConnection) urlLink.openConnection(); 
			// Now the URL is open for the connection to connect to the server.
			connc.connect(); // THis will connect to the server and send the request to server.
			
			if(connc.getResponseCode()>=400) {
				System.out.println("The link is a broken link : " + hrefAttValue);
				noOfBrokenLinks++;
			}else {
				System.out.println("The link is not a broken link : "+ hrefAttValue);
			}
			}catch(Exception e) {
				
			}
			
		}
		
		System.out.println("Number of broken Links are : " + noOfBrokenLinks);
	}

}
