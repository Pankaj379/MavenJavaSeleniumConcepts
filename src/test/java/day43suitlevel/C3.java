package day43suitlevel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void c2()
	{
		System.out.println("This is the test case of c3 class...");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This executes before suite...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This executes after suite...");
	}

}
