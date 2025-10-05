package day44;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority=1,groups= {"Regression"})
	void SignUpByEmail()
	{
		System.out.println("Signup by using email...");
	}

	@Test(priority=2,groups= {"Regression"})
	void SignUpByFacebook()
	{
		System.out.println("Signup by using Facebook Account...");
	}
	
	@Test(priority=3,groups= {"Regression"})
	void SignUpByInstagram()
	{
		System.out.println("Signup by using Instagram Account...");
	}

}
