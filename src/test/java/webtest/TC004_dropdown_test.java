package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utilities.DriverSetup;

public class TC004_dropdown_test extends DriverSetup {
	
	public String Base_url="https://www.w3schools.com/TAGS/tryit.asp?filename=tryhtml_select_multiple";
	@Test
	public void selectMultiSelect() throws InterruptedException {
		
		driver.get(Base_url);
		
	By iframeResult=By.name("iframeResult");
	
	driver.switchTo().frame(driver.findElement(iframeResult));
//driver.findElement(By.cssSelector("option[value='volvo']")).click();
	Select select=new Select(driver.findElement(By.id("cars")));
	
	select.selectByIndex(0);
	String selectValue= select.getFirstSelectedOption().getText();
	System.out.println(selectValue);
	Thread.sleep(3000);
	select.selectByValue("saab");
	Thread.sleep(3000);
	select.deselectAll();
	Thread.sleep(3000);
	select.selectByVisibleText("Audi");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	}
	

}
