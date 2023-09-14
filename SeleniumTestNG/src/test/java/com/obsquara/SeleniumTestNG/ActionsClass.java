package com.obsquara.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base
{
	@Test
public void actions()
{
	driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
	WebElement dragable1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement dragable2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	Actions action=new Actions(driver);
	action.moveToElement(dragable1).click().perform();
	action.doubleClick(dragable2).perform();
	action.contextClick(dragable2).build().perform();
	WebElement dropdown=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	action.dragAndDrop(dragable2, dropdown);
	
}
}
