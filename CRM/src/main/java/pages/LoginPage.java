package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
protected WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By emailId = By.xpath("//input[@placeholder='Username']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By logo = By.xpath("//img[contains(@alt,'Free CRM')]");
	private By loginButton = By.xpath("//input[@value='Login']");
	//img[contains(@alt,'Free CRM')]
	
	
	public void invalidLoginToCRM(String un, String pass) {
		
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		
	}
	
	public LandingPage validLoginToCRM(String un, String pass) {
		
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		return new LandingPage(driver);
	}
}
