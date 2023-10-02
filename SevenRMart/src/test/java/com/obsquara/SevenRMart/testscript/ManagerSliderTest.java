package com.obsquara.SevenRMart.testscript;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageSliderPage;

public class ManagerSliderTest extends Base{
	@Test
	public void entersliderinformationinmanagersliderpage() 
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String link="http:flowerpic";
		LoginPage loginpage=new LoginPage(driver);
		ManageSliderPage managersliderpage=new ManageSliderPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		managersliderpage.clicktomanagelocation();
		managersliderpage.clickNewButton();
		managersliderpage.imageUpload();
		managersliderpage.enterTheLinkinLInkField(link);
		managersliderpage.clicktoSaveButton();
		boolean alertsmessage=managersliderpage.getTheAlertMessagetoSuceesfully();
		assertTrue(alertsmessage,"User is unable to enter the details of manage SliderPage");		
	}
}
