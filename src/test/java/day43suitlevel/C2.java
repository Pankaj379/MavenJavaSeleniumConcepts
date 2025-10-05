package day43suitlevel;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	
	@Test
	void test1C2()
	{
		System.out.println("This is the test case of C2 class...");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This executes after all tests....");
	}

}
