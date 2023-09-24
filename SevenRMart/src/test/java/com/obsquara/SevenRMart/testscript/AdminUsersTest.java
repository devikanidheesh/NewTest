package com.obsquara.SevenRMart.testscript;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.AdminUserspage;
import pages.LoginPage;

public class AdminUsersTest extends Base{
	@Test
	public void verifythesearchofAdminuserspage()
	{
		String userName="admin";
		String password="admin";
		String username="junu2023/09/22 19:37:49";
		String exceptedUsernameadminlist="junu2023/09/22 19:37:49";
		LoginPage loginpage=new LoginPage(driver);
		AdminUserspage adminuserspage=new AdminUserspage(driver);
		loginpage.enterUsernameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSigninButton();
		adminuserspage.navigateToAdminUsersPages();
		adminuserspage.clicktoadminuserpage();
		adminuserspage.searchButton();
		adminuserspage.enterusernametoadminuserfield(username);
		adminuserspage.enterusertypeinadminuserpage();
		adminuserspage.submitSearchbutton();
		String actualuser=adminuserspage.adminusersusername();
		boolean actualUsernameadminlist=actualuser.contains(exceptedUsernameadminlist);
		assertTrue(actualUsernameadminlist,"unable to search theAdminuserpage");
		
	}}


