package day42;

import org.testng.annotations.Test;

public class TestNGFirstExecution {
	/*
	 * Open the app. 
	 * Login into the app. 
	 * Logout from the app.
	 */
	@Test(priority=1)
	void a_openApp()
	{
		System.out.println("Opened the app....");
	}
	@Test(priority=2)
	void b_loginApp()
	{
		System.out.println("Logged in into the app...");
	}
	@Test(priority=3)
	void c_logoutApp()
	{
		System.out.println("logged out from the app...");
	}
	
	// Note: By default testNG execute the Test in alphabetical order.
	// So, we need to set the prioprity=num for the execution of the script.
}
