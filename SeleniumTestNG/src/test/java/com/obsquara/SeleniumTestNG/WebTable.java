package com.obsquara.SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable extends Base		
{
	@Test
public void tableList()
{
	driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
	List<WebElement>table=driver.findElements(By.xpath("//tr[@role='row']//th"));
	for(WebElement tabList:table)
	{
		String actualvalue=tabList.getText();
		System.out.println(actualvalue);
		
	}
	}

	
	@Test
	public void identifyName()	
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		String input="Ashton Cox";
		List<WebElement>name=driver.findElements(By.xpath("//table[@id='dtBasicExample']"));
		
		for(WebElement userName:name)
		{
		String actualName=userName.getText();
			if(actualName.contains(input))
			{
				System.out.println("Required username found");
				userName.click();
				return;
		    }	
			else
			{
				System.out.println("Required username not found");
				return;
			}
	   }

}
}


