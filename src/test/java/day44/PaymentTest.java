package day44;

import org.testng.annotations.Test;

public class PaymentTest {
	
	
	@Test(priority=1,groups= {"Sanity","Regression","Functional"})
	void payInRupees()
	{
		System.out.println("Payment done in rupees...");
	}
	
	@Test(priority=2,groups= {"Sanity","Regression","Functional"})
	void payInUSD()
	{
		System.out.println("Payment done in USD...");
	}
	
	@Test(priority=3,groups= {"Sanity","Regression","Functional"})
	void payInCAD()
	{
		System.out.println("Payment done in CAD...");
	}

}
