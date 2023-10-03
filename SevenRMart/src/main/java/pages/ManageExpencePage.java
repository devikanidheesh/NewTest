package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.FileUploadUtility;
import Utilities.GeneralUtility;
import Utilities.PageUtility;

public class ManageExpencePage {
	public WebDriver driver;
	public ManageExpencePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//p[text()='Manage Expense']")
	private WebElement manageExpense;
	@FindBy(xpath="//p[text()='Manage Expense']//parent::a")
	private WebElement manageExpencebutton;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	private WebElement newButton;
	@FindBy(xpath="//select[@id='user_id']")
	private WebElement user;
	@FindBy(xpath="//option[@value='1']")
	private WebElement adminuser;
	@FindBy(xpath="//input[@id='ex_date']")
	private WebElement date;
	@FindBy(xpath="//select[@id='ex_type']")
	private WebElement expenseType;
	@FindBy(xpath="//option[@value='db']")
	private WebElement expenseBankorCash;
	@FindBy(xpath="//input[@id='amount']")
	private WebElement enterAmount;
	@FindBy(xpath="//input[@name='userfile']")
	private WebElement chooseimagebutton;
	@FindBy(xpath="//button[@name='create']")
	private WebElement saveButton;
	@FindBy(xpath="//div[contains(@class,'alert alert-success alert-dismissible')]")
	private WebElement alert;
	public String navigateTheMangeExpensePage()
	{
		
		return manageExpense.getText();
	}
	public ManageExpencePage clickthemanageExpensepage()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.doubleClick(manageExpense, driver);
		return this;
	}
	public String getThemanageexpencebutton()
	{
		return manageExpencebutton.getText();
	}
	public ManageExpencePage clickthemanageExpensebutton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver, manageExpencebutton);
		return this;
	}
	public String getNewButton()
	{
		return newButton.getText();
	}
	public ManageExpencePage clickthenewbuttontoaddexpenceList()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver, newButton);
		return this;
	}
	public ManageExpencePage enterUserUsingSelectButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver,user);
		adminuser.click();
		return this;
	}
	public ManageExpencePage enterthedateusingcalender(String dateTime)
	{
		date.sendKeys(dateTime);
		return this;
}
	public ManageExpencePage enterExpenseTypeusingSelectBuutton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver,expenseBankorCash);
		expenseBankorCash.click();
		return this;
	}
	public  ManageExpencePage entertheAmount(String amount)
	{
		String amountfield=String.valueOf(amount);
		enterAmount.sendKeys(amountfield);
		return this;
	}
	public ManageExpencePage clickChooseImageButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver,chooseimagebutton);
		return this;
	}
	public ManageExpencePage imageUpload() 
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.activateFileUploadUsingSendKeys(chooseimagebutton,GeneralUtility.IMAGEFILETHATUPLOADMANAGESILDERPAGE );
		return this;
	}
	public ManageExpencePage clicktoSaveButton() {
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver, saveButton);
		return this;	
	}
	public boolean  getTheAlertMessagetoSuceesfully()
	{
		
		return alert.isDisplayed();
	}
	
	
	
	
}