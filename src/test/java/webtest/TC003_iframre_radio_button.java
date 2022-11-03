package webtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilities.DriverSetup;

public class TC003_iframre_radio_button extends DriverSetup {
	
	public String Base_url="https://jqueryui.com/checkboxradio/";
	@Test
	public void getIFrame() throws InterruptedException{
		
		driver.get(Base_url);
		By iframmeLocatedBy=By.className("demo-frame");
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("label[for='radio-1']")).click();
		
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector("i[class='icon-eye-open']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame(driver.findElement(iframmeLocatedBy));
	driver.findElement(By.cssSelector("label[for='radio-2']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("label[for='checkbox-1']")).click();
	Thread.sleep(2000);
	}

	
}
