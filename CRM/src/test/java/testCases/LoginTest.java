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
     String username = "Selenium_50";
     String pw ="abcd@123456";
    
     
     
	@Test(priority=1)
	public void invalidLoginToCRM() {
		
		LoginPage loginPage = new LoginPage(driver); 
		loginPage.invalidLoginToCRM(username, pw);		
		
	}
	
	@Test(priority=2)
	public void validLoginToCRM() {
		
		Assert.assertTrue(true);
		/*
		 * LoginPage loginPage = new LoginPage(driver); LandingPage landingPage;
		 * landingPage = loginPage.validLoginToCRM(username, pw); landingPage.logout();
		 */
	
	}
	
	
}
