package com.obsquara.SevenRMart.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Utilities.ExcelUtility;
import static org.testng.Assert.assertEquals;
import pages.LoginPage;
import pages.LogoutPage;
import retry.Retry;

public class LogoutTest extends Base{
	@Test
	@Parameters("elementexcepctedLogout")
	public void verifyTheAdminLogout(String elementexcepctedLogout )  {
	String userName=ExcelUtility.getString(1, 0, "LoginPage");
	String password=ExcelUtility.getString(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	LogoutPage logoutpage=new LogoutPage(driver);
	loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton().verifyNavigateToDashBoardHomePage();
	logoutpage.AdminPage().clickOnLogoutButton().adminLogout();
	String elementActualLogOut=logoutpage.verifyGettheloginpage();
	assertEquals(elementexcepctedLogout,elementActualLogOut,"Unable to Admin logout ");
		}
}
