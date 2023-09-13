package com.obsquara.SeleniumTestNG;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@Test
public class AnnotationScenario extends Base
{
	public void testcase1()
	{String input="Apple";
	String actualMessage;
	String expectedMessage="Your Message : "+input;
	WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleInputTextField.sendKeys(input);
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	showMessageButton.click();
	WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	actualMessage=yourMessage.getText();assertEquals(expectedMessage,actualMessage,"Your message text is not"+ expectedMessage);	

	}
	@BeforeMethod
	public void beforeMethod()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement simpleFormDemo=driver.findElement(By.xpath("//ul[contains(@class,'list-group-flush')]"));
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement lastPage=driver.findElement(By.xpath("//div[@id='mylist']"));
}
	@Test
	public void testcase2()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleRadioButton.click();
		boolean isMaleRadiobuttonSelected=maleRadioButton.isSelected();
		assertTrue(isMaleRadiobuttonSelected,"MaleRadio Button is not Selected");	
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will execute before the Class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This will execute After the Class");
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
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before Suit");
	}
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("AfterSuit");
	}
	
	
}