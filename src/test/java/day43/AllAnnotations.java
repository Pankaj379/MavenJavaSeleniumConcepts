package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	
	@BeforeSuite
	void bs()
	{
		System.out.println("THis is before suit level.....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("THis is After suit level.....");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("THis is before Test level.....");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("THis is After Test level.....");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("THis is before Class level.....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("THis is after Class level.....");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("THis is before Method level.....");
	}
	
	@AfterMethod
	void Am()
	{
		System.out.println("THis is After Method level.....");
	}
	
	@Test(priority=1)
	void test1()
	{
		System.out.println("THis is Test case with priority = 1.....");
	}
	

	@Test(priority=2)
	void test2()
	{
		System.out.println("THis is Test case with priority = 2.....");
	}

}
