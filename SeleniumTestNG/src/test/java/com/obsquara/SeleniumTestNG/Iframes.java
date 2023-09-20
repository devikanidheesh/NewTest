package com.obsquara.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframes extends Base{
	@Test
	public void iframesample()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframess=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(iframess);
		WebElement link=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		link.click();
	
	}

}
