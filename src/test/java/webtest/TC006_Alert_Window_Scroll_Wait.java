package webtest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.DriverSetup;
import net.bytebuddy.asm.Advice.Argument;

public class TC006_Alert_Window_Scroll_Wait extends DriverSetup {
//	@Test
	public void getAlert() throws InterruptedException{
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		String resultText=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(resultText);
		assertEquals(resultText,"You successfully clicked an alert");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		
		String resultText1=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(resultText1);
		assertEquals(resultText1,"You clicked: Cancel");
		
		Thread.sleep(3000);
		
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
Thread.sleep(3000);
		alert.sendKeys("hello");
		alert.accept();
		Thread.sleep(3000);
		
		String resultText3=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(resultText3);
		assertTrue(resultText3.contains("hello"));
		
		Thread.sleep(3000);
	}
	
	public void UseJsInautomation() throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	Thread.sleep(3000);
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	Thread.sleep(3000);
    js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	
	Thread.sleep(3000);
	
	WebElement element = driver.findElement(By.id("mousehover"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	Thread.sleep(3000);
	}
	
	
	public void diffWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://qavbox.github.io/demo/delay/");
		
	driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
	
	
	WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loaderdelay")));
//	String text=driver.findElement(By.id("loaderdelay")).getText();
	System.out.println(element1.getText());
	assertTrue(element1.getText().contains("I appeared after 5 sec"));
		
	}
	
	@Test
	public void UseCommonMethod() {
				
		driver.get("https://qavbox.github.io/demo/delay/");
	    clickElement(By.xpath("//input[@id='loaderStart']"));
	  

	assertTrue(getElementText(By.id("loaderdelay")).contains("I appeared after 5 sec"));
		
	}
	
	public WebElement GetElement(By locator) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public void clickElement(By Loactor) {
		GetElement(Loactor).click();
	}
	public String getElementText(By locator) {
	  return GetElement(locator).getText();
	}
	
	
	public void handleBrowserWindow() throws InterruptedException{
		
//		driver.get("https://www.w3schools.com/TAGS/tryit.asp?filename=tryhtml_select_multiple");
//		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://demoqa.com/menu#");
//		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(3000);
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		Thread.sleep(3000);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("opentab")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		List<String> handles=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(handles);
		
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
	}

}
