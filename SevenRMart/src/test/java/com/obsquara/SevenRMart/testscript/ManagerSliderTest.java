package com.obsquara.SevenRMart.testscript;

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
		LoginPage loginpage=new LoginPage(driver);
		ManageSliderPage managersliderpage=new ManageSliderPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		managersliderpage.clicktomanagelocation();
		managersliderpage.getTextNew();
		managersliderpage.clickNewButton();
		managersliderpage.getTextinchooseimage();
		managersliderpage.clickChooseImageButton();
		
	}
	

}
