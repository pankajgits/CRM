package base;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import dataProvider.ConfigReader;
import extentReportListner.ExtentReportNG;
import factory.BrowserFactory;

public class TestBase {

		public WebDriver driver;
	
	
	@BeforeMethod
	public  void  setup() 
	{
		Reporter.log("LOG:INFO- Running Before Class- Setting Up Browser", true);
	
		driver=BrowserFactory.getBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("appURL"));
		
		Reporter.log("LOG:INFO- Browser And Application Is Up And Running", true);
		
		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		Reporter.log("LOG:INFO- Running After Class- Closing Browser", true);
		
		BrowserFactory.quitBrowser(driver);
		
		Reporter.log("LOG:INFO- Browser Closed", true);
	}
	
	
}
