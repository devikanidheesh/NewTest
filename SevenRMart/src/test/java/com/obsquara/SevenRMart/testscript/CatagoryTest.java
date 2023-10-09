package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.CategoryPage;
import pages.LoginPage;
import retry.Retry;

public class CatagoryTest extends Base{
	@Test(retryAnalyzer = Retry.class,groups={"regression"})
	public void verifyAbleToDeleteTheItemInCateogryList()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String expectedListItem="Rambootan";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.navigateToCategoryPage();
		categorypage.clicktoCategorylistpage().deleteTheParticularItem(expectedListItem);
		boolean alert=categorypage .AlertMessageIsDisplayed();
		assertTrue(alert,"unable to delete the iem in Category list");
		
}
}