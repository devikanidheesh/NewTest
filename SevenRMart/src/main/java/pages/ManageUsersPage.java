package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class ManageUsersPage {
	public WebDriver driver;
	public ManageUsersPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//p[text()='Manage Users']//parent::div")
	private WebElement manageUserspageText;
	@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-user']")
	private WebElement moreinfo;
	@FindAll({@FindBy(xpath="//table[contains(@class,'table table-bordered table-hover table-sm')]//child::th")}) 
	List<WebElement>UsersListHead;
	@FindBy(xpath="//a[@onclick='click_button(2)']")
	private WebElement searchbutton;
	@FindBy(xpath="//input[@id='un']")
	private WebElement enterTheName;
	@FindBy(xpath="//input[@id='ut']")
	private WebElement enterTheEmail;
	@FindBy(xpath="//input[@id='ph']")
	private WebElement enterThePhoneNo;
	@FindBy(xpath=" //select[@id='st']")
	private WebElement status;
	@FindBy(xpath="//option[@value='active']")
	private WebElement active;
	@FindBy(xpath="//button[@value='sr']")
	private WebElement endSearch;
	@FindBy(xpath="//h4[text()='List Users']")
	private WebElement userList;
	public String navigateToManageUserPages(){
		return manageUserspageText.getText();
	}
	public ManageUsersPage clicktomanageuserpage(){
		moreinfo.click();
		return this;
	}
	public ManageUsersPage getTheTable()
	{
		UsersListHead.addAll(UsersListHead);
		return this;
	}
  public ManageUsersPage clicktheSearchButton()
  {
	  PageUtility pageutility=new PageUtility();
	  pageutility.clickusingjavascriptExecuter(driver,searchbutton);
	  return this;
  }
  public ManageUsersPage enterTheNameinTheNameField(String name)
  {
	  enterTheName.sendKeys(name);
	  return  this;
  }
  public ManageUsersPage enterTheEmailinTheEmailField(String email)
  {
	  enterTheEmail.sendKeys(email);
	  return  this;
  }
  public ManageUsersPage enterThePhoneNoinThePhoneNumbeField(String phoneNo){
	  
	  enterThePhoneNo.sendKeys(phoneNo);
	  return  this;
  }
 public ManageUsersPage clickTheStatusinStatusField(){
	  
	 PageUtility pageutility=new PageUtility();
	  pageutility.clickusingjavascriptExecuter(driver,status);
	  active.click();
	  return this;
  }
 public ManageUsersPage clickTheEndSearchButton(){
	  
	 PageUtility pageutility=new PageUtility();
	  pageutility.clickusingjavascriptExecuter(driver,endSearch);
	  return this;
}
 
 public String getUserText(){
	  
	  return  userList.getText();
} 
 }
 

