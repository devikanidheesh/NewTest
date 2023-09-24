package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class AdminUserspage {
	public WebDriver driver;
	public AdminUserspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[text()='Admin Users']//parent::div") WebElement adminuser;
	@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement search;
	@FindBy(xpath="//input[@id='un']") WebElement usernameadminuser;
	@FindBy(xpath="//select[@id='ut']") WebElement usertypeadminuser;
	@FindBy(xpath="//button[@name='Search']") WebElement searchbutton;
	@FindBy(xpath="//td[text()='junu2023/09/22 19:37:49']") WebElement adminListUsername;
	public String navigateToAdminUsersPages()
	{
		return adminuser.getText();
	}
	public void clicktoadminuserpage()
	{
		moreinfo.click();
	}
	public void searchButton()
	{
		search.click();
	}
	public void enterusernametoadminuserfield(String username)
	{
		usernameadminuser.sendKeys(username);
	}
	public void enterusertypeinadminuserpage()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectDropdownbyText(usertypeadminuser, "Admin");
}
	public void submitSearchbutton()
	{
		searchbutton.click();
	}
	public String adminusersusername()
	{
		return adminListUsername.getText();
	}
}