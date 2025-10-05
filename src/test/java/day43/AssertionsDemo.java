package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void testTitle()
	{
		String title1 = "openCart";
		String title2 = "openOrder";

		//		if(title1.equals(title2))
		//		{
		//			System.out.println("The title is correct...");
		//		}
		//		else
		//		{
		//			System.out.println("Title is not correct..");

		// Note: Now observer the title is not correct and else statement is executed-
		// but in consol/testng result the validation is passed because the code is right.
		// So, for assetions are newely implemented in testng.

	//	Assert.assertEquals(title1, title2);
		// By using this the test is failed and in consol also failed the test.


		//we can also use if else statement with assetions.

		if(title1.equals(title2))
		{
			//System.out.println("The title is correct...");
			Assert.assertTrue(true);
		}
		else
		{
			//System.out.println("Title is not correct..");
			Assert.assertTrue(false);

		}
	}
}

