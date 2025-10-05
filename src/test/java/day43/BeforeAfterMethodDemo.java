package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodDemo {

	// Test case to use before and after method.
	//	first login.
	//	search.
	//	logout.
	//	again login
	//	advanced search
	//	logout.

	
	@BeforeMethod
	void login()
	{
		System.out.println("Login successfull....");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout Successfull...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Searched successfully...");
	}
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("Advanced searched successfully..");
	}
	
	// Note: Before and After Method is not considered in result also before it does not contains validations.
	// TestNG only consider Test method for the valdation the other methods are just for entry and exit.
	
	
}
