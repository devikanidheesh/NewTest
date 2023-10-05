package com.obsquara.SevenRMart.testscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilities.ScreenShotUtilities;
import Utilities.WaitUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	WaitUtility waitutility;
	 ScreenShotUtilities screenshotutilities;
	 @BeforeMethod(alwaysRun = true)
		@Parameters("browser")
		public void intializeBrowser(String browser) throws Exception {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = WebDriverManager.firefoxdriver().create();
			} else if (browser.equalsIgnoreCase("chrome")) {
				driver = WebDriverManager.chromedriver().create();
			} else if (browser.equalsIgnoreCase("edge")) {
				driver = WebDriverManager.edgedriver().create();
			} else {
				throw new Exception("Browser is not correct");
			}
			driver.get("https://groceryapp.uniqassosiates.com/admin/login");
			waitutility = new WaitUtility();
			waitutility.implicitWaits(driver);
			driver.manage().window().maximize();
	 }
	 @AfterMethod
	 public void browserQuit(ITestResult iTestResult) throws IOException 
		{
			if (iTestResult.getStatus() == ITestResult.FAILURE)
			{
				screenshotutilities = new ScreenShotUtilities();
				screenshotutilities.getScreenShot(driver, iTestResult.getName());
			}
			driver.quit();
		}
}