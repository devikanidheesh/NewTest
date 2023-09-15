package com.obsquara.SeleniumTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable extends Base		
{
	@Test

	public void tableList()
		{
		List<String>exceptedtableValue=new ArrayList<String>();
		exceptedtableValue.add("Name");
		exceptedtableValue.add("Position");
		exceptedtableValue.add("Office");
		exceptedtableValue.add("Age");
		exceptedtableValue.add("Salary date");
		exceptedtableValue.add("Salary");  
		String exceptedHead=String.join(" ",exceptedtableValue);
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement>actualtableValue=driver.findElements(By.xpath("//table[@id='dtBasicExample']//following-sibling::thead"));
	
		for(WebElement actualValue :actualtableValue)
		{
	String actualtabValue=actualValue.getText();
	System.out.println(actualtabValue);
	if(exceptedtableValue.contains(actualtableValue))
	{
	
		assertEquals(exceptedtableValue,actualtabValue,"Actual valueand excepted value are not same");
		
	}
	}
		}
	

	
	@Test
	public void identifyName()	
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		String input="Ashton Cox";
		List<WebElement>name=driver.findElements(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(input);
		
		for(WebElement userName:name)
		{
			String exceptedmesg=input;
			String actualmesg=userName.getText();
			if(exceptedmesg.contains(actualmesg))
			{
			assertNotEquals(exceptedmesg,actualmesg,"The text is not equal");
				
	
		    }	
		

}
}}


