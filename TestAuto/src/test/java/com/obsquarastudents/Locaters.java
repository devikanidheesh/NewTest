package com.obsquarastudents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locaters extends BaseChrome
{
public void locateById()
{
	WebElement Showmessagebutton=driver.findElement(By.id("button-one"));
}
public void navigationCommands()
{
	 driver.navigate().to("https://selenium.obsqurazone.com/jquery-progress-bar.php");
	WebElement Download=driver.findElement(By.id("downloadButton"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
	WebElement message=driver.findElement(By.id("message-two"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-alert.php");
	WebElement ProgrsBar=driver.findElement(By.id("normal-btn-success"));
	
}
public void locateByClass()
{
	WebElement Section=driver.findElement(By.className("clearfix"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
	WebElement Table=driver.findElement(By.className("navbar-nav"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-modal-progress.php");
	WebElement Progrs=driver.findElement(By.className("mb-sec"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
	WebElement List =driver.findElement(By.className("card-body"));
}

 public void locateByCssSelector()
 {
	WebElement  Showmessagebutton=driver.findElement(By.cssSelector("button#button-one"));
	WebElement cssSelector=driver.findElement(By.cssSelector("section.clearfix"));
	driver.navigate().to("https://selenium.obsqurazone.com/index.php");
	WebElement span=driver.findElement(By.cssSelector("span.carousel-control-next-icon"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/jquery-progress-bar.php");
	WebElement card=driver.findElement(By.cssSelector("div.card-body"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
	WebElement cssTag=driver.findElement(By.cssSelector("div#todrag"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/chart.php");
	WebElement footer=driver.findElement(By.cssSelector("footer.mt-5"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement list=driver.findElement(By.cssSelector("a#list0box"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
	WebElement form=driver.findElement(By.cssSelector("form#demoform"));
	
 }
 public void getTotal()
 {
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement getTotalbutton=driver.findElement(By.cssSelector("button[id=button-two]"));
 }
public void locateByName()
 {
	WebElement viewport=driver.findElement(By.name("viewport"));
	WebElement discription=driver.findElement(By.name("description"));
	WebElement keyWord=driver.findElement(By.name("keywords"));
	WebElement author=driver.findElement(By.name("author"));
 }
public void locateByusingLinkText()
{
	WebElement simpleFormDemo=driver.findElement(By.linkText("Simple Form Demo"));
}
public void partialLinkList()
{
	WebElement simpleForm=driver.findElement(By.partialLinkText("Simple Form"));
}
public void locateByXpath()
{
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement enterValueField=driver.findElement(By.xpath("//input[@id='value-a']"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
	WebElement showDate=driver.findElement(By.xpath("//button[@id='button-one']"));
    }
	public void locateExtraXpath()
	{
		
	WebElement button=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	
	WebElement key=driver.findElement(By.xpath("//button[contains(@class,'btn-primary')and(@id='button-one')]"));
	WebElement input=driver.findElement(By.xpath("//input[contains(@class,'control11')or(@id='single-input-field')]"));
	
	WebElement buttonstarts=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement Testdemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	}
	public void axesMethod()
	{
		WebElement parent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement child=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}

public static void main(String[] args) 
	{
		Locaters locators=new Locaters();
		locators.instilBrowser();
		locators.locateByXpath();
		locators.locateExtraXpath();
		locators.driverCloseOrQuit();

	}

}
