package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.PushNotificationPage;

public class PushNotificationTest extends Base {
	@Test
	
	public void sendThePushNotificationInformation()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String title=ExcelUtility.getString(1, 0, "PushNotificationTest");
		String discription=ExcelUtility.getString(1, 1, "PushNotificationTest");
		String expectedAlert=ExcelUtility.getString(1, 2, "PushNotificationTest");
		LoginPage loginpage=new LoginPage(driver);
		PushNotificationPage pushnotificationpage=new PushNotificationPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		pushnotificationpage.clickThePushNotificationPage().enterTheTitleinTitleField(title).enterTheDiscriptioninDiscriptionField(discription);
		pushnotificationpage.getTheSendText();
		pushnotificationpage.clickTheSendButton();
		String actualAlert=pushnotificationpage.alertSuccesfullymessage();
		assertEquals(expectedAlert,actualAlert,"Unable to Send the push notification information");

	
	}

}
