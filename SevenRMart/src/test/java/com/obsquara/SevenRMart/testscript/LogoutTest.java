package com.obsquara.SevenRMart.testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends Base{
	@Test
	public void verifyTheAdminLogout()
	{
		String userName="admin";
		String password="admin";
		String elementexcepcted="Remember Me";
	LoginPage loginpage=new LoginPage(driver);
	LogoutPage logoutpage=new LogoutPage(driver);
	loginpage.enterUsernameOnUserNameField(userName);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickSigninButton();
	loginpage.verifyNavigateToAdminHomePage();
	logoutpage.AdminPage();
	logoutpage.waitExplicit();
	logoutpage.adminLogout();
	String elementActual=logoutpage.verifyGettheloginpage();
	assertEquals(elementexcepcted,elementActual,"Unable to Admin logout ");
	

	

}
}
