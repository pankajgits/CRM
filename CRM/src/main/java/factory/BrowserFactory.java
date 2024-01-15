package factory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProvider.ConfigReader;

public class BrowserFactory {

	public static WebDriver driver;
	// get browser and url and launch to browser open url
	public static WebDriver getBrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {			
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			//launch firefox driver;
		}
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("pageLoadTimeout"))));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("scriptTimeout"))));
			driver.get(url);		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("implicitWait"))));			
			return driver;	
	}
	
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}
}
