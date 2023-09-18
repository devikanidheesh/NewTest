package com.obsquara.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExcuteSample extends Base 
{
	
	@Test
	public void showmsg()
	 {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String input="Apple";
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		js.executeScript("arguments[0].value='Apple';", singleInputTextField);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("window.scrollBy(0,-300)");
		
	 }
}
