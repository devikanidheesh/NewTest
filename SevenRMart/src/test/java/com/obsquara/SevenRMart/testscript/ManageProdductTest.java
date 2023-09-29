package com.obsquara.SevenRMart.testscript;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import pages.LoginPage;
import pages.ManageProductPage;

public class ManageProdductTest extends Base {
	@Test
	
	public void verifyUnableToaddNewIteminmanageproductpage() {
	String userName=ExcelUtility.getString(1, 0, "LoginPage");
	String password=ExcelUtility.getString(1, 1, "LoginPage");
	String title=ExcelUtility.getString(1, 0, " ManageProdduct");
	String tag= ExcelUtility.getString(1, 1, " ManageProdduct");
	String excptedAlert= ExcelUtility.getString(1, 2," ManageProdduct");
	int weigthValue=5;
	int maxWeight=10;
	int pricevalue=500;
	int stockValue=45;
	LoginPage loginpage=new LoginPage(driver);
	ManageProductPage manageproductpage=new ManageProductPage(driver);
	loginpage.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickSigninButton();
	manageproductpage.navigateManageProductPage();
	manageproductpage.addproduct();
	manageproductpage.clicknewButton().enterTitleField(title).entertaginTagField(tag);
	manageproductpage.clickableProductTypebutton().clickablePriceType().enterTheWeightValueInWeightTest(weigthValue).weightunitclickable();
	manageproductpage.weightUnitsingleclick().maximumweightField(maxWeight).enterThePriceField(pricevalue).enterTheStockAvailabilityField(stockValue); 
	manageproductpage.getSaveButtonText();
	manageproductpage.clickableSaveButton();
	String actualalert=manageproductpage.alertmessage();
	assertEquals(excptedAlert,excptedAlert,"User is Able to add item in manageproductpage with incomplete data");
	
	
}
}
