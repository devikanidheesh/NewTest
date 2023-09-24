package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.ListPagesNewSavepage;
import pages.LoginPage;
import pages.ManagePage;

public class ListPagesNewSaveTest extends Base {
	@Test

	public void verifyaddnewitemlistsavebuttontext()
	{
	String userName="admin";
	String password="admin";
	String title="Apple";
	String description="Australian And African Apples";
	String pageN="Fruits";
	String buttonExcepcted="Save";
LoginPage loginpage=new LoginPage(driver);
ManagePage managepage=new ManagePage(driver);
ListPagesNewSavepage listpagespage=new ListPagesNewSavepage(driver);
loginpage.enterUsernameOnUserNameField(userName);
loginpage.enterPasswordOnPasswordField(password);
loginpage.clickSigninButton();
managepage.navigateToManagePages();
managepage.clicktheManagePage();
listpagespage.listPagenewButton();
listpagespage.enterTitleOfItem(title);
listpagespage.enterTheDescriptionForItem(description);
listpagespage.enterThePageName(pageN);
String buttonActual=listpagespage.getTheSaveButtonText();
assertEquals(buttonExcepcted,buttonActual,"Save Buttonis Not Present");



}
}

