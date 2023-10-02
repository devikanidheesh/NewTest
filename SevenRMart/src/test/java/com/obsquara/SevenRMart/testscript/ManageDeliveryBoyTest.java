package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageDeliverBoyPage;

public class ManageDeliveryBoyTest extends Base {
	@Test
	public void verifyAddDeliverBoyInformationinManageDeliveryBoyPage()
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String name=ExcelUtility.getString(1, 0, "ManageDeliveryBoy");
		String email=ExcelUtility.getString(1, 1, "ManageDeliveryBoy");
		String address=ExcelUtility.getString(1, 2, "ManageDeliveryBoy");
		String usernamedelboy=ExcelUtility.getString(1, 3, "ManageDeliveryBoy");
		String pasworddelboy=ExcelUtility.getString(1, 4, "ManageDeliveryBoy");
		int phonNo=12345678;
		LoginPage loginpage=new LoginPage(driver);
		ManageDeliverBoyPage managedliverBoypage=new ManageDeliverBoyPage(driver);
		loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
		managedliverBoypage.navigateToManageDeliveryBoyPages();
		managedliverBoypage.clicktoManageDeliverBoyPagemoreinfo();
		managedliverBoypage.getNewButtonText();
		managedliverBoypage.newButtonClicked();
		managedliverBoypage.enterNametoManageDeliverBoyPage(name).enterEmailtoManageDeliverBoyPage(email).enterThePhoneNumberToManAgeDeliverBoyPage(phonNo);
		managedliverBoypage.enterAddresstoManageDeliverBoyPage(address).enterUserNametoManageDeliverBoyPage(usernamedelboy).enterPassWordtoManageDeliverBoyPage(pasworddelboy);
		managedliverBoypage.getSaveButtonText();
		managedliverBoypage.clickSavebutton();
		boolean alertMesgActual=managedliverBoypage.getAlertSucessfulMessage();
		assertTrue(alertMesgActual,"unable to add Details of DeleverBoy in DeliveredPage");
	}

}
