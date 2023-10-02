package com.obsquara.SevenRMart.testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	WebDriver driver;
	 @BeforeMethod
	 public void intializeBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace-2021-12\\SevenRMart\\src\\main\\java\\ResourceFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
	 }
	 @AfterMethod
	   public void driverQuit()
	   {
		  
		   driver.quit();
	   }

}
