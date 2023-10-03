package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageExpencePage;

public class ManageExpenseTest extends Base {
	@Test
	public void  VerifytheAddnewmanageexpense()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String dateTime=ExcelUtility.getString(1, 0, "ManageExpencePage");
		String amount=ExcelUtility.getString(1, 1, "ManageExpencePage");
		LoginPage loginpage=new LoginPage(driver);
		ManageExpencePage manageexpencepage=new ManageExpencePage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		manageexpencepage.navigateTheMangeExpensePage();
		manageexpencepage.clickthemanageExpensepage().getThemanageexpencebutton();
		manageexpencepage.clickthemanageExpensebutton().getNewButton();
		manageexpencepage.clickthenewbuttontoaddexpenceList().enterUserUsingSelectButton();
		manageexpencepage.enterthedateusingcalender(dateTime).enterExpenseTypeusingSelectBuutton().entertheAmount(amount).clickChooseImageButton().imageUpload().clicktoSaveButton();
		boolean alertMessage=manageexpencepage.getTheAlertMessagetoSuceesfully();
		assertTrue(alertMessage,"unable to add new manage expence ");
	}

}
