package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageProductPage;

public class ManageProdductTest extends Base {
	@Test
	
public void verifytheSearchbuttoninmanageproductpage()
{
	String userName="admin";
	String password="admin";
	String exceptedText="Search";
	LoginPage loginpage=new LoginPage(driver);
	ManageProductPage manageproductpage=new ManageProductPage(driver);
	loginpage.enterUsernameOnUserNameField(userName);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickSigninButton();
	manageproductpage.navigateManageProductPage();
	manageproductpage.clickManageProductPage();
	String actualText=manageproductpage.SearchButton();
	assertEquals(exceptedText,actualText,"Search Button is not present in Manage Product Page");
	
	
	
	
}
}
