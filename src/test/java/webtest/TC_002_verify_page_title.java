package webtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.DriverSetup;

public class TC_002_verify_page_title extends DriverSetup {
	public String base_url="http://automationpractice.com/index.php";
	@Test
	public void getTitle() {
		driver.get(base_url);
		System.out.println("pass");
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals("My Store")) {
			System.out.println("pass");
		}
		else {
			System.out.println("false");
		}
		Assert.assertEquals(actualTitle,"My Store");
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actualTitle, "My Store");
	}
	
	public void verifyUrl(){
		
		System.out.println(driver.getCurrentUrl());
		Assert.assertNotEquals(driver.getCurrentUrl(),"http://automationpractice.com");
		
	}
}
