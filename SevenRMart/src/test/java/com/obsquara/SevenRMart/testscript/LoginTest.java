package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	public LoginPage loginpage;
	
	@Test
	public void verifyUserIsAbleToLoginWithCorrectUserNameAndPassword()
	{
		String userName="admin";
		String password="admin";
		String excpctedresult="Admin";
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSigninButton();
		String actualresult=loginpage.verifyNavigateToAdminHomePage();
		assertEquals(excpctedresult,actualresult,"login with wrong UserName and Password");
		
	}
	@Test
	public void verifyUserIsAbleTOLoginWithWrongUserNameAndCorrectPassword()
	{
		String userName="user";
		String password="admin";
		String exceptedResult="Alert!";
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSigninButton();
		String actualResult=loginpage.verifyGetTheAlertMessage();
		assertEquals(exceptedResult,actualResult,"verify Wrong username and correct password  is failed ");	
		
		
	}
	@Test
	public void verifycorrectUserNameandwrongPassword()

	{
		
		String userName="admin";
		String password="password";
		String excpctedresult="Alert!";
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSigninButton();
		String actualresult=loginpage.verifyGetTheAlertMessage();
		assertEquals(excpctedresult,actualresult,"verify correct username and wrong password  is failed ");
	}
	@Test
	public void verifyInvalidUserNameAndInvalidPassword()

	{
		
		String userName="user";
		String password="password";
		String excpctedresult="Alert!";
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickSigninButton();
		String actualresult=loginpage.verifyGetTheAlertMessage();
		assertEquals(excpctedresult,actualresult,"verify Invalid username and Invalid password  is failed ");
	}

}
