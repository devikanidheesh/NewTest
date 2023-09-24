package com.obsquara.SeleniumTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable extends Base		
{
	@Test

	public void tableList()
		{
		List<String>exceptedtableValue=Arrays.asList("Name","Position","Office","Age","Start date","Salary");
		String exceptedHead=String.join(" ",exceptedtableValue);
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement>actualtableValue=driver
				.findElements(By.xpath("//table[@id='dtBasicExample']//following-sibling::thead"));
	
		for(WebElement actualValue :actualtableValue)
		{
	String actualtabValue=actualValue.getText();
	assertEquals(exceptedtableValue,actualtabValue,"Actual valueand excepted value are not same");
		
	}
	}
		
	

	
	@Test
	public void identifyName()	
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		String input="Ashton Cox";
		List<WebElement>name=driver
				.findElements(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(input);
		
		for(WebElement userName:name)
		{
			String exceptedmesg=input;
			String actualmesg=userName.getText();
			boolean actualName=actualmesg.contains(exceptedmesg);
			assertTrue(actualName,"The text is not equal");
				
	
		    }	
		

}
}


