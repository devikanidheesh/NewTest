package com.obsquara.SeleniumTestNG;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestcasesObsquara extends Base
{
	@Test
		public void cssSelectorTestcase()
		{
		WebElement  Showmessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		WebElement getTotalbutton=driver.findElement(By.cssSelector("button#button-two"));
		}
	@Test
	public void classAndId()
	{
		WebElement showMesge=driver.findElement(By.xpath("//button[contains(@class,'btn-primary')and (@id='button-one')]"));
		}
	
	@Test
		public void idButtonTestcase()
		{
		WebElement Showmessagebutton=driver.findElement(By.id("button-one"));
		WebElement getTotalbutton=driver.findElement(By.id("button-two"));
		}
	@Test
		public void xpathTestcase()
		{
		WebElement showmsgbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement getTotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		}
	@Test
	public void verifyShowButtonAlignment()
	{
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleInputText=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		int height1=showMessageButton.getSize().getHeight();
		int height2=singleInputText.getSize().getHeight();
		assertEquals(height1, height2);
	}

}
	