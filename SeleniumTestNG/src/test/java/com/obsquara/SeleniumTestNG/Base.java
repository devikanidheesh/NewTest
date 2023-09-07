package com.obsquara.SeleniumTestNG;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


   public class Base 
    {
	 WebDriver driver;
	 public void instilBrowser()
	 {
	driver=WebDriverManager.chromedriver().create();
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		 driver.manage().window().maximize();
	 }
	   public void driverCloseOrQuit()
	   {
		  // driver.close();
		   driver.quit();
	   }
	  
		
		
	}


