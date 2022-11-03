package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.DriverSetup;

public class Daraz_MoveTo_Test extends DriverSetup{
	
	
  public String url="https://www.daraz.com.bd/";
  @Test
  public void moveTo() throws InterruptedException {
	  
	  driver.get(url);
	  
	  Actions action= new Actions(driver);
	  
	  WebElement catElement = driver.findElement(By.xpath("//h3[normalize-space()='Categories']"));
	  
	  action.moveToElement(catElement);
	  
	  Thread.sleep(6000);
  }
}
