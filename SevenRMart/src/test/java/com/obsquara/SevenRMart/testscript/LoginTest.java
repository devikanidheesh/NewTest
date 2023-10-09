package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import retry.Retry;

public class LoginTest extends Base {
	public LoginPage loginpage;
	
	@Test(retryAnalyzer = Retry.class,groups={"regression"})
	public void verifyUserIsAbleToLoginWithCorrectUserNameAndPassword()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String excpctedLogin=ExcelUtility.getString(1, 4, "LoginPage");
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		String actualLogin=loginpage.verifyNavigateToDashBoardHomePage();
		assertEquals(excpctedLogin,actualLogin,"Unable to login with correct UserName and Password");
		
	}
	@Test(retryAnalyzer = Retry.class,groups="smoke")
	public void verifyUserIsUnableTOLoginWithWrongUserNameAndCorrectPassword()
	{
		String userName=ExcelUtility.getString(1, 2, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String exceptedAlert=ExcelUtility.getString(1, 5, "LoginPage");
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		String actualAlert=loginpage.verifyGetTheAlertMessage();
		assertEquals(exceptedAlert,actualAlert,"Able to login with Wrong username and correct password");	
		
		
	}
	@Test(retryAnalyzer = Retry.class,groups= {"regression","smoke"})
	public void verifycorrectUserNameandwrongPassword()

	{
		
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 3, "LoginPage");
		String excpctedresult=ExcelUtility.getString(1, 5, "LoginPage");
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		String actualresult=loginpage.verifyGetTheAlertMessage();
		assertEquals(excpctedresult,actualresult,"Able to login with correct username and wrong password ");
	}
	@Test(retryAnalyzer = Retry.class,dataProvider="LoginProvider")
	public void verifyInvalidUserNameAndInvalidPassword(String userName,String password)

	{
		String excpctedresult=ExcelUtility.getString(1, 5, "LoginPage");
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		String actualresult=loginpage.verifyGetTheAlertMessage();
		assertEquals(excpctedresult,actualresult,"Able to login with Wrong username and wrong password");
	}
	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() {
	return new Object[][] { { ExcelUtility.getString(1, 2, "LoginPage"), ExcelUtility.getString(1, 3, "LoginPage") },
		};

}
}
