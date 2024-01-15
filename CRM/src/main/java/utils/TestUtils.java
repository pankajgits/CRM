package utils;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TestUtils {

	public WebDriver driver;
	
	
	
	public static String takeScreenShot(WebDriver driver) {
		String spath=null;
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		spath = System.getProperty("user.dir")+"/screenshots/freecrm_"+getdatetime()+".png";
		try{
			
			FileHandler.copy(src, new File(spath));
		}catch(Exception e) {
			
			System.out.println("screeshot message");
		}
		
		return spath;
	}
	
	public  static String getdatetime() {
		
		SimpleDateFormat  customeFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customeFormat.format(currentdate);
		
	}
}
