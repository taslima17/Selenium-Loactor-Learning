package FogzeeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MyFirstTest {
    @Test

	public void myFirstTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		
	
		
		WebElement element= driver.findElement(By.xpath("//fieldset/legend"));
		System.out.println(element.getText());
		WebElement element1= driver.findElement(By.cssSelector("fieldset>legend"));
		System.out.println(element1.getText());
		WebElement input1= driver.findElement(By.xpath("//input[@value='radio1' and @name='radioButton']"));
		input1.click();
	
		WebElement input2= driver.findElement(By.cssSelector("input[value='radio1'][name='radioButton']"));
		input2.click();
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[contains(@value,'adio2')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[value*='adio3']")).click();
			Thread.sleep(1000);
			
//			driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).sendKeys("hello");
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).clear();
//			driver.findElement(By.cssSelector("input[id^='autocom']")).sendKeys("hello");
//			Thread.sleep(2000);
			
//			driver.findElement(By.xpath("//input[ends-with(@id,'tocomplete')]")).sendKeys("hello");
//			Thread.sleep(4000);
			driver.findElement(By.cssSelector("input[id$='tocomplete']")).sendKeys("hello 5");
			WebElement sibling=driver.findElement(By.xpath("//label[@for='radio2']/preceding-sibling::label"));
			System.out.println(sibling.getText());
			Thread.sleep(2000);
			
		driver.quit();
		
	}

}
