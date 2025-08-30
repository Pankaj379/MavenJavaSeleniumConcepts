package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVSAction {

	public static void main(String[] args) throws InterruptedException {
		// https://prnt.sc/6IrN8thDnAnV

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		// Right click on the button:
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions act = new Actions(driver);

		Action rightClk = act.contextClick(rightClick).build(); // creating/building an action and storing into a variable.
		rightClk.perform(); // performing an action.

		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.quit();
		
		// Actions vs Action : https://prnt.sc/6IrN8thDnAnV






	}

}
