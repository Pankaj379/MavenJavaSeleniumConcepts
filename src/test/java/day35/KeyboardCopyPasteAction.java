package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardCopyPasteAction {

	public static void main(String[] args) throws InterruptedException {
		//Copy paste actions
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.name("text1")).sendKeys("Automation");
		
		Actions act = new Actions(driver);
		
		//1) CTRL+A = select all.
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//2) CTRL+C = copy
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//3) Tab = move to next box.
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		Thread.sleep(3000);
		//4) CTRL+V = Paste the copied text.
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		driver.quit();
		
		// Examples: https://prnt.sc/809_gFJEjgsN


	}

}
