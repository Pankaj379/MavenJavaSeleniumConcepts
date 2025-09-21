package day38;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRuntime {

	public static void main(String[] args) {
		// Enable SelectorHub at runtime.
		
		ChromeOptions option = new ChromeOptions();		
		File file = new File("C:\\Automation\\ExtensionAtRunTIme\\selectorshub.crx");
		option.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		

	}

}
