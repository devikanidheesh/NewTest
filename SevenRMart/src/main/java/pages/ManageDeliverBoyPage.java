package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class ManageDeliverBoyPage {
	public WebDriver driver;
	public ManageDeliverBoyPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}
		@FindBy(xpath="//p[text()='Manage Delivery Boy']//parent::div")
		private WebElement manageDeliveryBoyPage;
		@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
		private WebElement moreinfo;
		@FindBy(xpath="//a[@onclick='click_button(1)']")
		private WebElement newButton;
		@FindBy(xpath="//input[@id='name']")
		private WebElement nameField;
		@FindBy(xpath="//input[@id='email']")
		private WebElement emailField;
		@FindBy(xpath="//input[@id='phone']")
		private WebElement enterThePhoneNumber;
		@FindBy(xpath="//textarea[@id='address']")
		private WebElement addressfield;
		@FindBy(xpath="//input[@id='username']")
		private WebElement userNameFieldDelBoy;
		@FindBy(xpath="//input[@id='password']")
		private WebElement paswordFieldDelBoy;
		@FindBy(xpath="//button[text()='Save']")
		private WebElement saveButton;
		@FindBy(xpath="//i[contains(@class,'icon fas fa-check')]//parent::h5")
		private WebElement alertmesge;
		

			public String navigateToManageDeliveryBoyPages(){
			return manageDeliveryBoyPage.getText();
				} 
			public ManageDeliverBoyPage clicktoManageDeliverBoyPagemoreinfo(){
				moreinfo.click();
				return this;
			}
			public String getNewButtonText()
			{
				return newButton.getText();
				
			}
			public ManageDeliverBoyPage newButtonClicked()
			{
				newButton.click();
				return this;
			}
			public ManageDeliverBoyPage enterNametoManageDeliverBoyPage(String name){
				nameField.sendKeys(name);
				return this;
			}
			public ManageDeliverBoyPage enterEmailtoManageDeliverBoyPage(String email){
				emailField.sendKeys(email);
				return this;
			}
			public void enterThePhoneNumberToManAgeDeliverBoyPage(String phonNo) {
				
				String phone=String.valueOf(phonNo);
				enterThePhoneNumber.sendKeys(phone);
			}
			public ManageDeliverBoyPage enterAddresstoManageDeliverBoyPage(String address){
				addressfield.sendKeys(address);
				return this;
			}
			public ManageDeliverBoyPage enterUserNametoManageDeliverBoyPage(String usernamedelboy){
				userNameFieldDelBoy.sendKeys(usernamedelboy);
				return this;
			}
			public ManageDeliverBoyPage enterPassWordtoManageDeliverBoyPage(String pasworddelboy){
				paswordFieldDelBoy.sendKeys(pasworddelboy);
				return this;
			}
			
			public void clickSavebutton()
			{
				PageUtility pageutility=new PageUtility();
				WaitUtility waitutility=new WaitUtility();
				waitutility.fluentwaitelementtoBeClicked(driver,saveButton);
				pageutility.clickusingjavascriptExecuter(driver, saveButton);
			
			}
			public boolean getAlertSucessfulMessage()
			{
				return alertmesge.isDisplayed();
			}
			
	}
