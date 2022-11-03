package webtest;import org.testng.annotations.Test;

import Utilities.DriverSetup;


public class Get_Navigation_TC001 extends DriverSetup {
	
	public String base_url="https://www.javatpoint.com/selenium-webdriver";
	@Test
	public void getUrl() {
		driver.get("https://www.javatpoint.com/selenium-webdriver");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.javatpoint.com/appium");
		driver.navigate().back();
	}
	

}
