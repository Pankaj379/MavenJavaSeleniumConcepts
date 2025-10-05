package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSSoftAssertions {
	
	//@Test
	void test_HardAssertions()
	{
		System.out.println("Testing 1......");
		System.out.println("Testing 2......");
		Assert.assertEquals(1, 2);
		// That's the main drawback of hard assertion the next 3,4 statements are not executed.
		// That's why always put hard assetion on the last of the code for validations.
		System.out.println("Testing 3......");
		System.out.println("Testing 4......");
	}
	
	@Test
	void test_SoftAssertions()
	{
		System.out.println("Testing 1......");
		System.out.println("Testing 2......");
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2); // same no of methods are present in softassetions as hardassetions.
		System.out.println("Testing 3......");
		System.out.println("Testing 4......");
		
		sa.assertAll(); 
		// Mandatory otherwise the test will always passed along with 3,4 statement but not now.
		// We can create object only in test class not in class level but we can assign the name of oject in class level.
		// like WebDriver driver; // on class level but object should be into the test class.
		
	}

}
