package day26;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class Fluent_Wait_Demo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> flWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(8))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		flWait.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			}
		});

driver.quit();

}
}
