package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListenerDemo implements ITestListener{

	public ExtentSparkReporter sparkReporter; // For UI of the Report.
	public ExtentReports extent; // Population of common information in the report.
	public ExtentTest test; // Create test case entry in the report and update status in the report.

	// Changing all method from default to public because it's implemented in child class.
	public void onStart(ITestContext context) {

		// first missing thing: when we are generating file it's hard coded.
		// So to avoid this we will use time stamp with the name during framework design.
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/StandExtentRep.html");
		
		
		sparkReporter.config().setDocumentTitle("Automation Testing Report"); // Set title report.
		sparkReporter.config().setReportName("Functional Testing"); // set name of the report.
		sparkReporter.config().setTheme(Theme.STANDARD); // standard in light colour.
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		// 2nd missing thing: This data will generate automatically during runtime.
		// So to avoid hard coding we will user certain methods to generate this.
		extent.setSystemInfo("Computer Name", "localhost"); // key and value pairs.
		extent.setSystemInfo("Environment", "QA"); // In realtime project it's not hard coded.
		extent.setSystemInfo("Operating System", "Windows11"); // This we given dynamically during framework.
		extent.setSystemInfo("Browser", "Chrome"); // We will do dynamically in framework.


	}

	public void onTestSuccess(ITestResult result) {  // This method contains all the information of passed test case.
		test = extent.createTest(result.getName()); // Create new entry for the report.
		test.log(Status.PASS, "Test case passed is : " + result.getName()); // Update status Pass/Fail/Skip.
	}

	public void onTestFailure(ITestResult result) {  // This method contains all the information of failed test case.
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed is : " + result.getName());
		
		// 3rd Missing thing: Screenshot of failure test is missing and will cover in framework design.
		test.log(Status.FAIL, "Test case Failed Reason is : " + result.getThrowable()); // show the error in report.
		
		
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped : " + result.getName());
	}

	public void onFinish(ITestContext context) {
		
		// 4th Missing thing: In report directly the test methods are disply with pass and fail without id.
		// TO avoid this we will use the class name with testcase id infront of it will conver in framework.
		
		extent.flush();// This method will generate the actual report at the end what we have done above.
		// Writes test information from the started reporters to their output view

	}




}
