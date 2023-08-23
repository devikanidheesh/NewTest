package com.obsquarastudents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseChrome 
{
 WebDriver driver;
 public void instilBrowser()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\MyWorkAuto\\AutomationTesting\\TestAuto\\src\\main\\java\\ResourceFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	 driver.manage().window().maximize();
 }
   public void driverCloseOrQuit()
   {
	  // driver.close();
	   driver.quit();
   }
	public static void main(String[] args) 
	{
	BaseChrome basechrome=new BaseChrome();
	basechrome.instilBrowser();
	basechrome.driverCloseOrQuit();
	}
	
}
