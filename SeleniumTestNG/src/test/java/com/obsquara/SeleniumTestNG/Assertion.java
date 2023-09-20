package com.obsquara.SeleniumTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends Base
{
@Test
	 public void assertsEqualsSingleinputform()
	 {
		String input="Apple";
		String actualMessage;
		String expectedMessage="Your Message : "+input;
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		actualMessage=yourMessage.getText();
		assertEquals(expectedMessage,actualMessage,"Your message text is not"+ expectedMessage);	
 }
@Test
public void asserTrueRadioButtonM()
{
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
	maleRadioButton.click();
	boolean isMaleRadiobuttonSelected=maleRadioButton.isSelected();
	assertTrue(isMaleRadiobuttonSelected,"MaleRadio Button is not Selected");	
}
@Test
public void assertFalsRadiobuttonDisable()
{
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	        .withTimeout(Duration.ofSeconds(30))
	        .pollingEvery(Duration.ofSeconds(5))
	        .ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.elementToBeClickable(femaleRadioButton));
	femaleRadioButton.click();
	WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
	boolean maleradiobuttonselcted=maleRadioButton.isSelected();
	assertFalse(maleradiobuttonselcted,"Radio Button is Enabled");
}
@Test
public void notEqualSample()
{
	String a="ABC";
	String b="CDE";
	assertNotEquals(a,b,"a And b is failed");
}
@Test
public void assertNullSample()
{
	String a=null; 
	assertNull(a,"A is Not Null");
}
@Test
public void  assertNotNullSample()
{
	String  a="ABC";
	assertNotNull(a,"A is Null");
	
}
@Test
public void softAssert()
{

		
		String actualResult;
		String excpectedResult="Show Message";
		SoftAssert softassert=new SoftAssert();
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		actualResult=showMessageButton.getText();
		String exceptedWeight="400";
		String actualWeight=showMessageButton.getCssValue("font-weight");
		softassert.assertEquals(actualResult,excpectedResult,"The Text is Not Show Message");
		softassert.assertEquals(actualWeight,exceptedWeight,"Weight is not same");
		softassert.assertAll();
}
@Test
public void verifyShowButtontext()
{
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	String exceptedmesg="Show Message buttons";
	String actualmesg=showMessageButton.getText();
	assertNotEquals(exceptedmesg,actualmesg,"The text is not equal");
	
}

}