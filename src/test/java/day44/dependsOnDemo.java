package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnDemo {

	//	Open App
	//	login
	//	search 
	//	advance search
	//	logout

	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);	
	}

	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login()
	{
		Assert.assertTrue(false);	

	}

	@Test(priority=3, dependsOnMethods= {"openApp","login"})
	void search()
	{
		Assert.assertTrue(true);	
	}

	@Test(priority=4, dependsOnMethods= {"openApp"})
	void advSearch()
	{
		Assert.assertTrue(true);	

	}

	@Test(priority=5, dependsOnMethods= {"openApp"})
	void logout()
	{
		Assert.assertTrue(true);	

	}
	
	// Case1: If only first method is failed then by default all methods will be executed by TestNG.
	// Case2: dependsonMethod if used on the passed methods then this will skip if dependent upon the mentioned method in depends upon method.
	// Case3: WE can add multiple dependsOnMethods and execution only takes place when both have passed.
	


}
