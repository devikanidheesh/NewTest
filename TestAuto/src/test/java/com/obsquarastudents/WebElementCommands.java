package com.obsquarastudents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends BaseChrome
{
 public void webelementsCommands()
 {
	String input="Apple";
	String actualMessage;
	String expectedMessage="Your Message : "+input;
	WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleInputTextField.sendKeys(input);
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	showMessageButton.click();
	WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	actualMessage=yourMessage.getText();	
	
      if(expectedMessage.equals(actualMessage))
         {
    	  	System.out.println("testing passed");
         }
      		else
      		{
      			System.out.println("testing failed");
      		}
 }

 public void twoInputField()
 {
	    int value1=10;
	    int value2=20;
	    int totalValue=value1+value2;
	    String valueA=String.valueOf(value1);
	    String valueB=String.valueOf(value2);
	    String sum=String.valueOf(totalValue);
		String expectedValue="Total A + B : "+sum;
	WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
	enterValueA.sendKeys(valueA);
	WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	enterValueB.sendKeys(valueB);
	WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotalButton.click();
	WebElement totalAB=driver.findElement(By.xpath("//div[@id='message-two']"));
	String actualValue=totalAB.getText();
	
	System.out.println("expectedValue.trim() "+expectedValue.trim());
	System.out.println("actualValue.trim().. "+actualValue.trim());
	if(expectedValue.trim().equals(actualValue.trim()))
	{
		System.out.println("Testing passed");
	}
	else
	{
		System.out.println("Testing Failed");
	}
 }
 
 
 public void webElementcommands2()
 {

	 WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	String showMessageButtonclassname=showMessageButton.getAttribute("class"); 
	String showmessagename=showMessageButton.getAttribute("id");
	String showmesagebuttontag=showMessageButton.getTagName();
	String showmessagebackgroudcolor=showMessageButton.getCssValue("background-color");	
	int xAxis=showMessageButton.getLocation().getX();
	int yAxis=showMessageButton.getLocation().getY();
	int height=showMessageButton.getSize().getHeight();
	int widthShow=showMessageButton.getSize().getWidth();
	
	String actualResult;
	String excpectedResult="Show Message";
	actualResult=showMessageButton.getText();
	if(excpectedResult.equals(actualResult))
	{
		System.out.println("Testing passed");
	}
	else
	{
	System.out.println("Testing Failed");	
	}
 }
 public void verifyGetTotalButtonText()
 {
 WebElement verifyGetTotalButtonText=driver.findElement(By.xpath("//button[@id='button-two']"));
 String actualResut;
 String excepectedResut="Get Total";
 actualResut=verifyGetTotalButtonText.getText();
 if(excepectedResut.equals(actualResut))
 {
	 System.out.println("Testing passed");
 }
 else
 {
	 System.out.println("Testing Failed");
 }
 }
 
 public void verifyBackGroundColorGettotal()
 {
  
  WebElement verifyBackGroundColorGettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
  String excepectedColor="rgba(0, 123, 255, 1)";
  String actualColor=verifyBackGroundColorGettotal.getCssValue("background-color");
 if(excepectedColor.equals(actualColor))
{
	System.out.println("Testing passed");
}
else
{
	System.out.println("Testing Failed");
}
 }
 public void fontColourGetTotal()
 {
 WebElement fontColourGetTotal=driver.findElement(By.xpath("//button[@id='button-two']")); 
 String excpectedFontColor="rgba(255, 255, 255, 1)";
 String actualFontColor =fontColourGetTotal.getCssValue("color");
 if(excpectedFontColor.equals(actualFontColor))
 {
	 System.out.println("Testing Passed");
 }
 else
 {
	 System.out.println("Testing Failed");
 }
 }
 public void fontWeightShowmsgButton()
 {
	WebElement fontWeightShowmsgButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	String exceptedWeight="400";
	String actualWeight=fontWeightShowmsgButton.getCssValue("font-weight");
	if(exceptedWeight.equals(actualWeight))
	{
		System.out.println("Testing Passed");
	}
	else
	{
		System.out.println("Testing Failed");
	}
	
 }
 
public static void main(String[] args) 
	{
		WebElementCommands webelementscommands=new WebElementCommands();
		webelementscommands.instilBrowser();
		webelementscommands.webElementcommands2();
		webelementscommands.driverCloseOrQuit();

	}

}
