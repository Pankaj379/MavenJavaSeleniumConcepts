package day33;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Double_click_Actions {
	public static void main(String[] args) throws InterruptedException {
		// double click action.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.id("field1"));
		WebElement box2 = driver.findElement(By.id("field2"));
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Automation");
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClick).perform();
		Thread.sleep(3000);
		
		// Validation of box 2 should contain box1 value.
		//String text = box2.getText(); 
		// Text not copied...: because box2 does not have value attribute: https://prnt.sc/6M3utF3rWEAu 
		
		String text = box2.getAttribute("value"); // https://prnt.sc/sF5p0MecuR6Pl
		
		System.out.println("Captured value is :" + text);
		
		if(text.equals("Automation")) {
			System.out.println("Text is copied..");
		}else {
			System.out.println("Text not copied...");
		}
		
		driver.quit();
	}
}
