package day47;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPFactory {

	// Page factory approach is not intially provided by the selenium so in older versions
	// they user the first approach but newely projects user page factory approach.

	// Constructor: TO initiate the driver.
	WebDriver driver;

	LoginPFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
		// this statement replace the driver.findelement externally to locate element and apply actions but internally it's working.
		// initelements is a method which will initiate all the elements using driver.
	}

	// Locators: TO locate elements.

	/*
	 * By text_username_loc = By.xpath("//input[@placeholder='Username']"); By
	 * text_userpassword_loc = By.xpath("//input[@placeholder='Password']"); By
	 * btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	 */

	@FindBy(xpath="//input[@placeholder='Username']") WebElement text_userName; 
	// no need of assignment automatically assign =.
	
	//@FindBy(xpath="//input[@placeholder='Password']") WebElement text_Password;
	
	// Another approach: by how and using methods.
	@FindBy(how=How.XPATH, using="//input[@placeholder='Password']") WebElement text_Password;
	
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_Login;
	// instead of xpath we can use any locator like id,css,name etc.
	
	// To find multiple elements.
	@FindBy(tagName="a") List<WebElement> all_Links;

	// Actions Methods: To add the corresponding actions.

	/*
	 * public void setUserName(String user) {
	 * driver.findElement(text_username_loc).sendKeys(user); }
	 * 
	 * public void setUserPassowrd(String pwd) {
	 * driver.findElement(text_userpassword_loc).sendKeys(pwd); }
	 * 
	 * public void clickLogin() { driver.findElement(btn_login_loc).click(); }
	 */
	
	public void setUserName(String user)
	{
		text_userName.sendKeys(user);
	}
	
	public void setUserPassowrd(String pwd) 
	{
	text_Password.sendKeys(pwd); 
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}
	
	public void generateLinks()
	{
	 all_Links.size(); 
	}


}
