package extentReportListner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import utils.TestUtils;


public class ExtentReportNG {

	 private static ExtentReports extent;
	
	 public static ExtentReports createExtentReportsInstance() {
		 
	 ExtentSparkReporter spark = new ExtentSparkReporter("./reports/CRMAutomation_"+TestUtils.getdatetime()+".html");
	 spark.config().setTheme(Theme.DARK);
     spark.config().setDocumentTitle("Automation Report");
     spark.config().setEncoding("utf-8");
     spark.config().setReportName("Sprint 1 Report");
     extent = new ExtentReports();
     extent.attachReporter(spark);
    // extent.setSystemInfo("Tester", "Pankaj");
     
     return extent;
}

	 
}