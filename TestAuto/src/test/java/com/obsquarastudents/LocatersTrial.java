package com.obsquarastudents;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatersTrial extends BaseChrome
{
public void locatorId()
{
	WebElement getTotal=driver.findElement(By.id("button-two"));
	WebElement inputfield=driver.findElement(By.id("single-input-field"));
	WebElement buton=driver.findElement(By.id("button-one"));
	driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
	WebElement date=driver.findElement(By.id("button-one"));
	WebElement date2=driver.findElement(By.id("button-two"));
}

public void locatorclass()
{
	WebElement Section=driver.findElement(By.className("clearfix"));
	driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
	WebElement card=driver.findElement(By.className("card-body"));
	WebElement clas=driver.findElement(By.className("navbar-nav"));
	driver.navigate().to("https://selenium.obsqurazone.com/range-sliders.php");
	WebElement header=driver.findElement(By.className("header-top"));
	WebElement Range=driver.findElement(By.className("mb-sec"));
}

public void CssSelctorlocater()
{
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement  Showmessagebutton=driver.findElement(By.cssSelector("button#button-one"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/index.php");
	WebElement span=driver.findElement(By.cssSelector("span.carousel-control-next-icon"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement divid=driver.findElement(By.cssSelector("div#message-one"));
	
	WebElement butn2=driver.findElement(By.cssSelector("button#button-two"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement radiobtn=driver.findElement(By.cssSelector("div#message-two"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
	WebElement footer=driver.findElement(By.cssSelector("footer.mt-5"));
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
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement simpleFormDemo=driver.findElement(By.linkText("Simple Form Demo"));
	
	WebElement radio=driver.findElement(By.linkText("Radio Buttons Demo"));
	
	WebElement SelInput=driver.findElement(By.linkText("Select Input"));
	
	WebElement formsub=driver.findElement(By.linkText("Ajax Form Submit"));
	
	WebElement quary=driver.findElement(By.linkText("Jquery Select2"));
}
public void partialLinkList()
{
	WebElement simpleForm=driver.findElement(By.partialLinkText("Simple Form"));
	
	WebElement radiobut=driver.findElement(By.partialLinkText("Radio Buttons "));
	
	WebElement checkbox=driver.findElement(By.partialLinkText("Checkbox "));
	
	WebElement select=driver.findElement(By.partialLinkText("Select2"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
	WebElement datepick=driver.findElement(By.partialLinkText("Bootstrap Date "));
}

public void locateByXpath()
{
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement showmsg2=driver.findElement(By.xpath("//button[@id='button-two']"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement enterValueField=driver.findElement(By.xpath("//input[@id='value-a']"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
	WebElement showDate=driver.findElement(By.xpath("//button[@id='button-one']"));
	
	WebElement showdate2=driver.findElement(By.xpath("//button[@id='button-two']"));
	
	driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
	WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	
	WebElement clasclear=driver.findElement(By.xpath("//section[@class='clearfix']"));
	}
	public void xpathcontains()
	{
		WebElement containbuton=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		WebElement containcls=driver.findElement(By.xpath("//div[contains(@class,'sec')]"));
		WebElement containclear=driver.findElement(By.xpath("//section[contains(@class,'clear')]"));
		WebElement buttonget=driver.findElement(By.xpath("//button[contains(@id,'two')]"));
		WebElement mesg=driver.findElement(By.xpath("//div[contains(@id,'two')]"));
	}
	public void xpathAndOr()
	{
		WebElement andxpath1=driver.findElement(By.xpath("//div[contains(@id,'two')and(@class='my-2')]"));
		WebElement andxpath2=driver.findElement(By.xpath("//button[contains(@class,'btn-primary')and(@id='button-one')]"));
		WebElement andxpath3=driver.findElement(By.xpath("//button[contains(@class,'btn-primary')and(@id='button-two')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement andxpath4=driver.findElement(By.xpath("//input[contains(@type,'checkbox')and(@id='gridCheck')]"));
		WebElement andxpath5=driver.findElement(By.xpath("//label[contains(@class,'check')and(@for='gridCheck')]"));
		
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement orxpath1=driver.findElement(By.xpath("//div[contains(@id,'two')or(@class='myy')]"));
		WebElement orxpath2=driver.findElement(By.xpath("//button[contains(@class,'btn-primaryy')or(@id='button-one')]"));
		WebElement orxpath3=driver.findElement(By.xpath("//button[contains(@class,'btn-primaryy')or(@id='button-two')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement orxpath4=driver.findElement(By.xpath("//input[contains(@type,'checkboxs')or(@id='gridCheck')]"));
		WebElement orxpath5=driver.findElement(By.xpath("//label[contains(@class,'check1')or(@for='gridCheck')]"));
	}
	public void xpathStartswith()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement startsWith1=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		
		WebElement StartsWith2=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement startsWith3=driver.findElement(By.xpath("//input[starts-with(@id,'button-t')]"));
		
		WebElement Startswith4=driver.findElement(By.xpath("//input[starts-with(@id,'is_ch')]"));
		
		WebElement Startswith5=driver.findElement(By.xpath("//input[starts-with(@id,'check-box-o')]"));
	}
	public void xpathtext()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement Testdemo1=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		
		WebElement testdemo2=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		
		WebElement Testdemo3=driver.findElement(By.xpath("//a[text()='Home']"));
		
		WebElement TestDemo4=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		
		WebElement TestDemo5=driver.findElement(By.xpath("//a[text()='Form Submit']"));
	}
	
	public void parentAxes() 
	{
		WebElement parent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement parent2=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement parent3=driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));
		WebElement parent4=driver.findElement(By.xpath("//div[@id='message-two']//parent::form"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement parent5=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void childAxes()
	{
		WebElement child1=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		WebElement child2=driver.findElement(By.xpath("//form[@method='POST']//child::div"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement child3=driver.findElement(By.xpath("//form[@method='POST']//child::div"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement child4=driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='gridCheck']"));
		
		WebElement child5=driver.findElement(By.xpath("//div[@class='form-check']//child::label[@for='check-box-two']"));
	}
	public static void main(String[] args) 
	{
		LocatersTrial locaterstrial=new LocatersTrial();
		locaterstrial.instilBrowser();
		//locaterstrial.locatorId();
		//locaterstrial.locatorclass();
		//locaterstrial.locateByName();
		//locaterstrial.locateByusingLinkText();
		//locaterstrial.partialLinkList();
		//locaterstrial.locateByXpath();
		//locaterstrial.xpathcontains();
		//locaterstrial.xpathAndOr();
		//locaterstrial.xpathStartswith();
		//locaterstrial.xpathtext();
		//locaterstrial.CssSelctorlocater();
		locaterstrial.parentAxes();
		locaterstrial.childAxes();
		locaterstrial.driverCloseOrQuit();

	}

}
