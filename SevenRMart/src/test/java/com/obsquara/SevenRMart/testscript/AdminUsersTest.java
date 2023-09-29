package com.obsquara.SevenRMart.testscript;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.PageUtility;
import Utilities.WaitUtility;
import pages.AdminUserspage;
import pages.LoginPage;

public class AdminUsersTest extends Base{


	@Test
	public void verifyUserCreatedSuccessfullyUserDetailsinAdminUserPage()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String username=ExcelUtility.getString(1, 0, "AdminUsersPage");
		String passwordd=ExcelUtility.getString(1, 1, "AdminUsersPage");
		String exceptedUsernameadminlist=ExcelUtility.getString(1, 2, "AdminUsersPage");
		LoginPage loginpage=new LoginPage(driver);
		AdminUserspage adminuserspage=new AdminUserspage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		adminuserspage.navigateToAdminUsersPages();
		adminuserspage.clicktoadminuserpage().clicknewbutton().enterusernametoadminuserfield(username).enterthepasswordtoadminuserfield(passwordd).selecttheusertype().enterusertypeinadminuserpage().clicktheSavebutton();
		String actualUsernameadminlist=adminuserspage.alertSuccesfullymessage();
		assertEquals(exceptedUsernameadminlist,actualUsernameadminlist,"User is Unable to Create Details");	
	}
}


