package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.WaitUtility;

public class LogoutPage {
	public WebDriver driver;
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	private WebElement admin;
	@FindBy(xpath="//i[contains(@class,'ace-icon fa fa-power-off')]") 
	private WebElement logout;
	@FindBy(xpath="//label[@for='remember']") 
	private WebElement loginpage;
	public LogoutPage AdminPage() {
		admin.click();
		return this;
	}
	public LogoutPage adminLogout() {
		logout.click();
		return this;		
	}
	public LogoutPage clickOnLogoutButton() {
		WaitUtility waitutility = new WaitUtility();
		waitutility.fluentwaitelementtoBeClicked(driver, logout);
		return this;
	}
	
	public String verifyGettheloginpage() {
		return loginpage.getText();
	}
	
}
