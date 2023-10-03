package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageLocationPage;

public class ManageLocationText extends Base {
	@Test
	public void verifySearchthedetailsofmanagelocationpage()
	{
		
	
	String userName=ExcelUtility.getString(1, 0, "LoginPage");
	String password=ExcelUtility.getString(1, 1, "LoginPage");
	String location=ExcelUtility.getString(1, 0, "ManageLocationPage");
	String exceptedInput=ExcelUtility.getString(1, 1, "ManageLocationPage");
	LoginPage loginpage=new LoginPage(driver);
	ManageLocationPage managelocationpage=new ManageLocationPage(driver);
	loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
	managelocationpage.clicktomanagelocation().getSearchButtonText();
	managelocationpage.searchbuttonclickable().selectcountryid().getTextStateId();
	managelocationpage.selectStateId().enterTheLocationField(location);
	managelocationpage.getSearchButtonTextafterDetails();
	managelocationpage.clickableSearchButton();
	String actualInput= managelocationpage.listLocationTextVisible();
	assertEquals(exceptedInput,actualInput,"UnableTo Search The Details");
	
	}
}
