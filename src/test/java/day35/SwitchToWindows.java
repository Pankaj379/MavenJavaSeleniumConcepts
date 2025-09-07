package day35;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindows {


	public static void main(String[] args) {

		// switch to windows:


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		//driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");

		// For new tab:
		driver.switchTo().newWindow(WindowType.TAB);
		
		// For new window:
		// driver.switchTo().newWindow(WindowType.WINDOW);

		// Switch to 2nd window in new tab:
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.quit();


	}

}
