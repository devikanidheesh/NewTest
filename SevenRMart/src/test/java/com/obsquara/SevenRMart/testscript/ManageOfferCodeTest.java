package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageOfferCodePage;

public class ManageOfferCodeTest extends Base{

	@Test
		public void VerifyUserAbletoDeleteOfferCode() {
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String deleteItemExcepted="T153 (First Order)";
		LoginPage loginpage=new LoginPage(driver);
		ManageOfferCodePage manageoffercodepage=new ManageOfferCodePage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		manageoffercodepage.navigateToManageofferPages();
		manageoffercodepage.clicktomanageofferpage().getTheListItems();
		ManageOfferCodePage DeleteItemActual =manageoffercodepage.getThedeleteitems();
		manageoffercodepage.clickableDeleteItem();
		boolean deleteItemText=deleteItemExcepted.contains ((CharSequence) DeleteItemActual);
		assertTrue(deleteItemText,"unable to delete item in offerlist");
}
}