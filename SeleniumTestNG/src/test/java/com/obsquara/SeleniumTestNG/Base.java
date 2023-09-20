package com.obsquara.SeleniumTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


   public class Base 
    {
	 WebDriver driver;
	 @BeforeMethod
	 public void instilBrowser()
	 {
	//driver=WebDriverManager.chromedriver().create();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\NewTest\\SeleniumTestNG\\src\\main\\java\\ResourceFiles\\chromedriver.exe");
		 
		 driver=new ChromeDriver();
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
	 }
	 @AfterMethod
	   public void driverCloseOrQuit()
	   {
		  // driver.close();
		   driver.quit();
	   }
	  
		
		
	}


