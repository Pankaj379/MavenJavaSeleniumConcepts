package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamic_WebTable {

	public static void main(String[] args) throws InterruptedException {
		// Dynamic WebTable.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		//driver.get("https://demo.opencart.com/TlbeVW/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) Add username and passowrd and click on submit button.
	//	WebElement userName = driver.findElement(By.id("input-username"));
		//userName.clear();
		//userName.sendKeys("demo");
		
		//WebElement password = driver.findElement(By.id("input-password"));
		//password.clear();
		//password.sendKeys("demo");
		
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// 2) Click on the customer dropdown.
		//driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		//driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		// 3) Capture the total number of pages.
		// https://prnt.sc/_mmyyQPYmoud
		// https://prnt.sc/GV8fayNUIvwq
		
		// 
		
		
		   // Find total number of pages
        int totalPages = driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
        System.out.println("Total pages: " + totalPages);

        // Loop through each page
        for (int p = 1; p <= totalPages; p++) {
			
			if(p>1) { // https://prnt.sc/nZDgg1ZVXUNS
				WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
				//String actPage = driver.findElement(By.xpath("//div[@class='main-outer']//li["+p+"]")).getText();
				//System.out.println(actPage);
				activePage.click();
				Thread.sleep(2000);
			}
			
			// Reading data: 
			// https://prnt.sc/WKWfgMJqF6Su
			// https://prnt.sc/Qfdw6ewB9ljZ
			// https://prnt.sc/AJqQo_SgT1JM
        
        
     // Find total rows (excluding header)
        int rowCount = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
     		
		/*
		 * for(int r=1;r<=rowCount;r++) { String id =
		 * driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+
		 * "]//td[1]")).getText(); String name =
		 * driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+
		 * "]//td[2]")).getText(); String price =
		 * driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+
		 * "]//td[3]")).getText(); // String select =
		 * driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[4]"))
		 * .getText(); System.out.println(id+"\t"+name+"\t"+price);
		 * 
		 * }
		 */
		
		  // Loop through each row
        for (int r = 1; r <= rowCount; r++) {
            String id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[1]")).getText();
            String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]")).getText();
            String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]")).getText();
            System.out.println(id + "\t" + name + "\t" + price);
        }
	}
			
			
		driver.quit();	

	}
}
