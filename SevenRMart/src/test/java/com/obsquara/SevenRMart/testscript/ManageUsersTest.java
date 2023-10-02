package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageUsersPage;

public class ManageUsersTest extends Base {
	@Test
	public void verifysAbleToSearchTheUserdetails()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String name=ExcelUtility.getString(1, 0, "ManageUsersPage");
		String email=ExcelUtility.getString(1, 1, "ManageUsersPage");
		String phoneNo="9638527411";
		String expectedResult=ExcelUtility.getString(1, 2, "ManageUsersPage");
		LoginPage loginpage=new LoginPage(driver);
		ManageUsersPage manageuserspage=new ManageUsersPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		manageuserspage.navigateToManageUserPages();
		manageuserspage.clicktomanageuserpage().getTheTable().clicktheSearchButton().enterTheNameinTheNameField(name).enterTheEmailinTheEmailField(email);
		manageuserspage.enterThePhoneNoinThePhoneNumbeField(phoneNo).clickTheStatusinStatusField().clickTheEndSearchButton();
		String ActualResult=manageuserspage.getUserText();
		assertEquals(expectedResult,ActualResult,"Unable to Search");
		
	}

}
