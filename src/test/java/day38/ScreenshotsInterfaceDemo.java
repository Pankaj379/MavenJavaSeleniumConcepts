package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsInterfaceDemo {

	public static void main(String[] args) {
		// Screenshot demo.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://demo.nopcommerce.com/");
		
		// 1st Method : Full page screenshot.
		TakesScreenshot ts = (TakesScreenshot) driver; // invoke the takesscreenshot interferance.
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE); // screenshot taken but type is file.
		
		File targetFile = new File(System.getProperty("user.dir") + "\\ScreenshotsDemo\\FullPage.png");
		// user.dir will automatically get the current project location dynamically.
		// so we don't need full path here like: C:\Users\acer\git\MavenJavaSeleniumConcepts\ScreenshotsDemo.
		
		sourceFile.renameTo(targetFile); // to copy source file in to target file to convert into png format.
		
		// 2nd Method: Particular section screenshot.
		
		WebElement sectionScreenshot = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile2 = sectionScreenshot.getScreenshotAs(OutputType.FILE);
		// This is not from interferance but from selenium web driver we directly used sectionScreenshot not ts variable.
		// It is only applicable for selenium 4 and onwards not from takesScreenshot interfarance.
		File targetFile2 = new File(System.getProperty("user.dir") + "\\ScreenshotsDemo\\SectionScreenshot.png");
		sourceFile2.renameTo(targetFile2);
		
		// 3rd Method: Capture the web element.
		WebElement webelementScreenshot = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile3 = webelementScreenshot.getScreenshotAs(OutputType.FILE);
		// This is not from interferance but from selenium web driver we directly used sectionScreenshot not ts variable.
		// It is only applicable for selenium 4 and onwards not from takesScreenshot interfarance.
		File targetFile3 = new File(System.getProperty("user.dir") + "\\ScreenshotsDemo\\WebElementScreenshot.png");
		sourceFile3.renameTo(targetFile3);
		
	
		driver.quit();
	}

}
