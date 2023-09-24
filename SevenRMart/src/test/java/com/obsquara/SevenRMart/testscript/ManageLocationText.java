package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageLocationPage;

public class ManageLocationText extends Base {
	@Test
	public void verifyupdatebuttondthemanagelocationpage()
	{
		
	
	String userName="admin";
	String password="admin";
	String updateexceptedText="Update";
	LoginPage loginpage=new LoginPage(driver);
	ManageLocationPage managelocationpage=new ManageLocationPage(driver);
	loginpage.enterUsernameOnUserNameField(userName);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickSigninButton();
	managelocationpage.viewsidebarmenu();
	managelocationpage.clicktomanagelocation();
	managelocationpage.checktoedit();
	String updatedActualTest=managelocationpage.updatedbuttonpresent();
	assertEquals(updateexceptedText,updatedActualTest,"update button is not present in manage location page");
	managelocationpage.updatedclickable();
	
	}
}
