package day44;

import org.testng.annotations.Test;

public class loginTest {
	
	@Test(priority=1,groups= {"Sanity"})
	void loginByEmail()
	{
		System.out.println("Login by email...");
	}
	
	@Test(priority=2,groups= {"Sanity"})
	void loginByFacebook()
	{
		System.out.println("Login by facebook Account...");
	}

	@Test(priority=3,groups= {"Sanity"})
	void loginByInstagram()
	{
		System.out.println("Login by Instagram Account...");
	}


}
