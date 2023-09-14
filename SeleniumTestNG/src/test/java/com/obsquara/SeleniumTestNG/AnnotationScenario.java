package com.obsquara.SeleniumTestNG;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@Test
public class AnnotationScenario 
{
	 WebDriver driver;
	 @BeforeMethod
	 public void instilBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\NewTest\\SeleniumTestNG\\src\\main\\java\\ResourceFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.meesho.com/");
		 driver.manage().window().maximize();
	 }
	 @AfterMethod
	   public void driverQuit()
	   {
		 
		   driver.quit();
	   }
	@Test
	public void testCase1()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement  Showmessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		
	}
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Testcase Started");
	}
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("Testcase passed");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	
}
	
	