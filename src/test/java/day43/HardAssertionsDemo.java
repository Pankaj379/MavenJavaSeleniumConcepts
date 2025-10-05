package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
	
	
	@Test
	void test()
	{
		// Assert.assertEquals("xyz", "xyz"); // we can compare any value here no. or decimal anything.
		// Assert.assertEquals("xyz", 123); // fail
		// Assert.assertEquals("123", 123); // fail bacause datatype is different.
		
		// Assert.assertNotEquals("xyz", "xyz"); // Fail : did not expect [xyz] but found [xyz]
		// Assert.assertNotEquals("xyz", "xyw"); // passed.
		
		// Assert.assertTrue(false); // fail
		// Assert.assertTrue(true); // passed
		
		// Assert.assertFalse(false); // Passed
		// Assert.assertFalse(1==2); // Passed
		// Assert.assertFalse(1==1); // fail
		
		Assert.fail();// To fail the test case intentionally.
		
		// These are all hard assertion and static assertions.
		
		
		
	}

}
