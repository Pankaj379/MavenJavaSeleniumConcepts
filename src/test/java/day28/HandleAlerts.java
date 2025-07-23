package day28;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// Handling alert messages.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// 1) Handle normal alert message.
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText()); // I am a JS Alert
		myAlert.accept();
		
		// 2) Handle confirmation alert message.
		/* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss(); */
		
		// 3) Handling prompt alert message.
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Welcome to java Automation.");
		// myAlert.accept();
		myAlert.dismiss();
		*/

	}

}
