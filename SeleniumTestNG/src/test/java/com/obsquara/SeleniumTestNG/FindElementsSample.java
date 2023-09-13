package com.obsquara.SeleniumTestNG;

import static org.testng.Assert.assertEquals;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FindElementsSample extends Base
{
	
@Test
public void findelements() 
{
	
	List<WebElement> menu=driver.findElements(By.xpath("//ul[contains(@class,'list-group')]//a"));
	for(WebElement value : menu) 
	{
	String actualresult=value.getText();
	System.out.println(actualresult);
	}
}
@Test
	public void simpleformdemo() 
	{
			String input="Simple Form Demo";
			List<WebElement> menu=driver.findElements(By.xpath("//ul[contains(@class,'list-group')]//a"));
			for(WebElement value : menu) 
			{
			String actualresult=value.getText();
			assertEquals(actualresult,input,"Text not found");
			value.click();
			return;
	}
	
	
	}
  }




