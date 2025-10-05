package day43suitlevel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	
	@Test
	void test1C1()
	{
		System.out.println("This is the test case of C1 class...");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This executes before all tests....");
	}

}
