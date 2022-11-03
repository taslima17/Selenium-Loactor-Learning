package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public WebDriver driver;
	@Test
	@BeforeGroups
	public void getDriver(){
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
	public static void get(String base_url) {
		// TODO Auto-generated method stub
		
	}
	
	
}
