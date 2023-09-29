package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class AdminUserspage {
	public WebDriver driver;
	public AdminUserspage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Admin Users']//parent::div")
	private WebElement adminuser;
	@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") 
	private WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']") 
	private WebElement newbutton;
	@FindBy(xpath="//input[@id='username']") 
	private WebElement usernameadminuser;
	@FindBy(xpath="//input[@id='password']") 
	private WebElement passwordadminuser;
	@FindBy(xpath="//select[@id='user_type']") 
	private WebElement usertypeadminuser;
	@FindBy(xpath="//button[contains(@class,'btn btn-block-sm btn-danger')and(@name='Create')]") 
	private WebElement savebutton;
	@FindBy(xpath="//i[contains(@class,'icon fas fa-check')]//parent::h5") 
	private WebElement alert;
	public String navigateToAdminUsersPages(){
		return adminuser.getText();
	}
	public AdminUserspage clicktoadminuserpage(){
		moreinfo.click();
		return this;
	}
	public AdminUserspage clicknewbutton()
	{
		newbutton.click();
		return this;
	}
	public AdminUserspage enterusernametoadminuserfield(String username){
		usernameadminuser.sendKeys(username);
		return this;
	}
	public AdminUserspage enterthepasswordtoadminuserfield(String passwordd){
		passwordadminuser.sendKeys(passwordd);
		return this;
	}
	public AdminUserspage selecttheusertype()
	{
		usertypeadminuser.click();
		return this;
	}
	public AdminUserspage enterusertypeinadminuserpage(){
		PageUtility pageutility=new PageUtility();
		pageutility.selectDropdownbyText(usertypeadminuser, "Staff");
		usertypeadminuser.click();
		return this;
	}
	
	public AdminUserspage clicktheSavebutton()
	{
		savebutton.click();
		return this;
	}
	public String alertSuccesfullymessage()
	{
		return alert.getText();
		
	}
	
	
	
}