package LocatorLearning;



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
	
//	String testText=driver.findElement(By.tagName("h1")).getText();
	WebElement checkBox= driver.findElement(By.id("checkBoxOption1"));

	WebElement checkText= driver.findElement(By.className("right-align"));
	System.out.println(checkText.getText());
	checkBox.click();
	
	WebElement linkText= driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
	System.out.println(linkText.getTagName());
	
	WebElement linkText1= driver.findElement(By.partialLinkText("Free Access to InterviewQues"));
	System.out.println(linkText1.getText());
	WebElement radiotext= driver.findElement(By.xpath("//input[@name='radioButton']"));
	radiotext.click();
	System.out.println("hello"+radiotext.getText());
	
	WebElement searchtext= driver.findElement(By.cssSelector("input[id='autocomplete']"));;
	searchtext.sendKeys("test text");
	System.out.println("hello"+radiotext.getText());
	
//	System.out.println(testText);
			Thread.sleep(4000);
		driver.quit();
		
	}

}
