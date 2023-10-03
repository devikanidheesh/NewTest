package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class ManageProductPage {
		public WebDriver driver;
		public ManageProductPage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//p[text()='Manage Product']//parent::a") 
		private WebElement manageproduct;
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
		private WebElement newButton;
		@FindBy(xpath="//input[@id='title']")
		private WebElement titleField;
		@FindBy(xpath="//input[@id='tag']")
		private WebElement tagField;
		@FindBy(xpath="//label[text()='Product Type']")
		private WebElement productType;
		@FindBy(xpath="//label[@class='radio-inline']//child::input[@value='Veg']")
		private WebElement vegbutton;
		@FindBy(xpath="//label[@class='radio-inline']//child::input[@value='Nonveg']")
		private WebElement nonVegbutton;
		@FindBy(xpath="//label[@class='radio-inline']//child::input[@value='Others']")
		private WebElement othersButton;
		@FindBy(xpath="//label[text()='Price Type']")
		private WebElement pricetype;
		@FindBy(xpath="//input[@id='purpose']")
		private WebElement weightbutton;
		@FindBy(xpath="//input[@id='purpose1']")
		private WebElement piece;
		@FindBy(xpath="//input[@id='purpose2']")
		private WebElement liter;
		@FindBy(xpath="//input[@id='purpose3']")
		private WebElement serves;
		@FindBy(xpath="//input[@id='m_weight']")
		private WebElement entertheweightvalue;
		@FindBy(xpath="//select[@id='w_unit']")
		private WebElement weightunit;
		@FindBy(xpath="//input[@id='max_weight']")
		private WebElement maximumWeightfield;
		@FindBy(xpath="//input[@id='w_price']")
		private WebElement priceField;
		@FindBy(xpath="//input[@id='w_stock']") 
		private WebElement stockAvailability;
		@FindBy(xpath="//button[@type='submit']") 
		private WebElement save;
		@FindBy(xpath="//div[contains(@class,'alert alert-danger alert-dismissible')]")
		private WebElement alerts;
		
		public ManageProductPage navigateManageProductPage() {
			manageproduct.click();
			return this;
		}

		public String addproduct() {
			return newButton.getText();
		}
		public ManageProductPage  clicknewButton(){
			newButton.click();
			return this;
		}
	
		public ManageProductPage  enterTitleField(String title){
			titleField.sendKeys(title);
			return this;
		}
		public void entertaginTagField(String tag){
			tagField.sendKeys(tag);
		}
		public ManageProductPage clickableProductTypebutton(){
			PageUtility pageutility=new PageUtility();
			pageutility.clickusingjavascriptExecuter(driver,productType);
			nonVegbutton.click();
			return this;
		}
		
	
		public ManageProductPage clickablePriceType(){
			PageUtility pageutility=new PageUtility();
			pageutility.clickusingjavascriptExecuter(driver,pricetype);
			weightbutton.click();
			return this;
		}
		public ManageProductPage enterTheWeightValueInWeightTest(String weigthValue) {
		
			String weight=String.valueOf(weigthValue);
					entertheweightvalue.sendKeys(weight);
					return this;
		}
		public ManageProductPage  weightunitclickable()
		{
			weightunit.click();
			return this;
		}
		public ManageProductPage weightUnitsingleclick(){
			PageUtility pageutility=new PageUtility();
			pageutility.singleClick(weightunit,driver);
			weightunit.click();
			return this;
		}
		public ManageProductPage  maximumweightField(String maxWeight) {
			String maximumWeight=String.valueOf(maxWeight);
			maximumWeightfield.sendKeys(maximumWeight);
			return this;
		}
		public ManageProductPage enterThePriceField(String  price) {
			String pricevalue=String.valueOf(price);
			priceField.sendKeys(pricevalue);
			return this;
		}
		public ManageProductPage enterTheStockAvailabilityField(String stock) {
			String stockValue=String.valueOf(stock);
			stockAvailability.sendKeys(stockValue);
			return this;
		}
		public String getSaveButtonText()
		{
			return save.getText();	
		}
		public ManageProductPage clickableSaveButton()
		{
			PageUtility pageutility=new PageUtility();
			pageutility.scrollByUsingJavascriptExecuter(driver,save);
			pageutility.clickusingjavascriptExecuter(driver, save);
			WaitUtility waitutility=new WaitUtility();
			waitutility.waitForElementToBeClickable(driver, save);
			return this;
		}
		
		public String alertmessage()
		{
			return alerts.getText();
			
		}
}
		