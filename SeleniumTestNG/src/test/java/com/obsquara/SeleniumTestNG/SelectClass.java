package com.obsquara.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass extends Base {
	@Test
	public void sampleSelectClass()
	{
driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
Select select=new Select(dropDown);
select.selectByVisibleText("Red");
select.selectByIndex(3);
select.selectByValue("Yellow");

		
}
}
