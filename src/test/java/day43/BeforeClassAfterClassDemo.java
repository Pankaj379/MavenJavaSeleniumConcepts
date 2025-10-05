package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAfterClassDemo {
	// Test case to use before and after method.
		//	first login.
		//	search.
		//	advanced search
		//	logout.

		
		@BeforeClass
		void login()
		{
			System.out.println("Login successfull....");
		}
		@AfterClass
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
		
		// Note: Before and After class is not considered in result also before it does not contains validations.
		// TestNG only consider Test method for the valdation the other methods are just for entry and exit.
		// Difference is it'll execute before test and afterclass will execute after all tests.
		

}
