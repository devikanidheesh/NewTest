package com.obsquara.SeleniumTestNG;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElementsSample extends Base  {
	
@Test
	public void menuElements()   {
			String input="Checkbox Demo";
			List<WebElement> menu=driver.findElements(By.xpath("//ul[contains(@class,'list-group')]//a"));
			for(WebElement value : menu)   {
			String actualresult=value.getText();
			if(input.equals(actualresult))  {
			value.click();
			break;
			
			
	}
	
	
	}
  }
}




