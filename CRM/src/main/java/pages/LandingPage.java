package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	
	protected WebDriver driver;
	

	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By singout = By.xpath("//a[normalize-space()='Logout']");
	
	

	public void logout() {
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(singout).click();
	}
}


