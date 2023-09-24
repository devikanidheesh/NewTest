package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManagePage;

public class ManageTest extends Base {
	@Test
	public void verifytheuserisnavigatemanagePages()
	{
	String userName="admin";
	String password="admin";
	String elementExcepted="List Pages";
LoginPage loginpage=new LoginPage(driver);
ManagePage managepage=new ManagePage(driver);
loginpage.enterUsernameOnUserNameField(userName);
loginpage.enterPasswordOnPasswordField(password);
loginpage.clickSigninButton();
managepage.navigateToManagePages();
managepage.clicktheManagePage();
String elementActual=managepage.navigateToListPages();
assertEquals(elementExcepted,elementActual,"User is unable to navigate the managepages");

	}
}
