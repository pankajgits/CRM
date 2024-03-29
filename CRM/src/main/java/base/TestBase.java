package base;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import dataProvider.ConfigReader;
import extentReportListner.ExtentReportNG;
import factory.BrowserFactory;

public class TestBase {

		public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public  void  setup(String browser) 
	{
		Reporter.log("LOG:INFO- Running Before method- Setting Up Browser", true);
	
		//driver=BrowserFactory.getBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("appURL"));
		driver=BrowserFactory.getBrowser(browser, ConfigReader.getProperty("appURL"));
		
		Reporter.log("LOG:INFO- Browser And Application Is Up And Running", true);
		
		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		Reporter.log("LOG:INFO- Running After method- Closing Browser", true);
		
		BrowserFactory.quitBrowser(driver);
		
		Reporter.log("LOG:INFO- Browser Closed", true);
	}
	
	
}
