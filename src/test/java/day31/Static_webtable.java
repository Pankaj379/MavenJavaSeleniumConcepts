package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_webtable {

	public static void main(String[] args) {
		// Static Web table.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/#");
		
		//1) Find total number of rows.
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // For multiple tables.
		//int row = driver.findElements(By.tagName("tr")).size();// For single web table in a page.
		System.out.println("No. of rows: "+ row);
		
		// 2) || for columns.
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // For multiple tables.
		//int col = driver.findElements(By.tagName("th")).size();// For single web table in a page.

		System.out.println("No. of colums: "+ col);
		
		// 3) To get the specific value.
		WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]"));
		System.out.println("The specific element of the table is: "+ element.getText());
		
		// 4) Get all the table value using loop.
		
		// Get the header also but not with td tag so we have to do this manually.
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2;r<=row;r++) {
			
			for(int c=1; c<=col ; c++) {
				
				WebElement value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));
				System.out.print(value.getText()+"\t"); // to convert the data into tabular form.
			}
			System.out.println();
		}
		
		// 5) Get the books written by mukesh.
		
		for(int r=2;r<=row;r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(authorName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(authorName +"\t"+bookName);
			}
		}
		
		// 6 Get the all the total price of the books.
		int total = 0;
		for(int r=2;r<=row;r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		  total = total + Integer.parseInt(price);
		  }
		  System.out.println("Total price of the books: "+ total);

		
		
		// Assignemnt: https://prnt.sc/5XeU0AtS2UT5      https://prnt.sc/BI6gWjJguO7O
		
		
		driver.quit();
		

		
		

	}

}
