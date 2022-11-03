package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.DriverSetup;

public class TC05_Action_hover_moveToElement_doubleClick_RightClick extends DriverSetup{
	
	public String base_url="https://demoqa.com/menu/";
	
	@Test
	public void checkAction() throws InterruptedException {
		
		driver.get(base_url);
		
		
		Actions actions=new Actions(driver);
		WebElement mainManuElement=driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		actions.clickAndHold(mainManuElement).build().perform();
//		String testText=driver.findElement(By.xpath("//body//div[@id='app']//li//li//li[2]//a[1]")).getText();
		System.out.println(mainManuElement.getText());
		mainManuElement.click();
		
		WebElement subManuElement=driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		actions.clickAndHold(subManuElement).build().perform();

		System.out.println(subManuElement.getText());
		Thread.sleep(3000);
		
		WebElement childManuElement=driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']"));
		System.out.println(childManuElement.getText());
		actions.clickAndHold(childManuElement).build().perform();

//		childManuElement.click();
		
		Thread.sleep(3000);
		
		
}

}
