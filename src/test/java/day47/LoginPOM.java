package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	
	// POM class contains web elements and actions.

	// Constructor: TO initiate the driver.
	WebDriver driver;

	LoginPOM(WebDriver driver){
		this.driver = driver;
		// constructor of driver is required because POM class also need driver to find elements and actions.
	}

	// Locators: TO locate elements.

	By text_username_loc = By.xpath("//input[@placeholder='Username']");
	By text_userpassword_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	// Actions Methods: To add the corresponding actions.
	
	public void setUserName(String user)
	{
		driver.findElement(text_username_loc).sendKeys(user);
	}
	
	public void setUserPassowrd(String pwd)
	{
		driver.findElement(text_userpassword_loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
	
	// Now create test case class for login page.

}
