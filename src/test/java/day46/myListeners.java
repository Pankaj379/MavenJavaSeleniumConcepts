package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListeners implements ITestListener {
	
	// Changing all method from default to public because it's implemented in child class.
	public void onStart(ITestContext context) {
		System.out.println("Execute once when execution starts...");
	  }
	
	public void onTestStart(ITestResult result) {
		System.out.println("Execute on every test start...");

	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execute on every test success...");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Execute on every test failure...");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Execute on every test skipped...");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("Execute once when completed execution...");
	  }

}
