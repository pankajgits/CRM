package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import base.TestBase;

import pages.LandingPage;
import pages.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class LoginTest extends TestBase {
     String username = "slitetablet955@gmail.com";
     String pw ="slite@12";
    
	@Test(priority=1,groups= {"smoke"}, description="ELEM1396_Verify login Functionality")
	public void verifyLoginToApp() {
		
		LoginPage loginPage = new LoginPage(driver); 
		loginPage.invalidLoginToCRM(username, pw);		
		
	}
	
	@Test(priority=2,groups= {"smoke"}, description="ELEM1391_Verify login page title")
	public void verifyLoginPageTitleELEM1391() {
				
		  LoginPage loginPage = new LoginPage(driver); LandingPage landingPage;
		  landingPage = loginPage.validLoginToCRM(username, pw); 
		  landingPage.logout();	
	}
	
	@Test(priority=3,groups= {"sanity", "smoke"}, description="ELEM1392_Verify logo")
	public void validLoginToCRMELEM1392() {
		
		  LoginPage loginPage = new LoginPage(driver); LandingPage landingPage;
		  landingPage = loginPage.validLoginToCRM(username, pw); 
		  landingPage.logout();
			
	}
	
	
}
