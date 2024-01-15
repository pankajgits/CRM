package extentReportListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import utils.TestUtils;


public class Listener implements ITestListener {

	
	ExtentReports extent = ExtentReportNG.createExtentReportsInstance();
	ExtentTest extentTest;
	private static ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Listener started");
		extentTest = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.log(Status.PASS, "Successfull");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		  extentTest.fail("Test Failed " + result.getThrowable().getMessage(),
		  MediaEntityBuilder
		  .createScreenCaptureFromPath(TestUtils.takeScreenShot(factory.BrowserFactory.
		  driver)) .build());
		 
		//extentTest.fail(result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	
	
}
