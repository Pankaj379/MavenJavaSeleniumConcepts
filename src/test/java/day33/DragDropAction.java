package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) {
		// Drag and drop:
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement drag = driver.findElement(By.id("draggableElement"));
		WebElement drop = driver.findElement(By.id("droppableElement"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		driver.quit();

	}

}
