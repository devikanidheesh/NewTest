package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;



public class LoginPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@name='username']") 
	private WebElement usernameField;
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']") 
	private WebElement signInButton;
	@FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]")
	private WebElement dashBoard;
	@FindBy(xpath="//i[contains(@class,'icon fas fa-ban')]//parent::h5") 
	private WebElement alert;
	
	public  LoginPage enterUsernameOnUserNameField(String userName)
	{
		usernameField.sendKeys(userName);
		return this;
	}
	public LoginPage enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}
	public LoginPage clickSigninButton()
	{
		signInButton.click();
		return this;
	}
	public String verifyNavigateToDashBoardHomePage()
	{
		
		return dashBoard.getText();
	}
	public String verifyGetTheAlertMessage()
	{
		return alert.getText();
	}
	public void sample()
	{
		pageutility = new PageUtility();
		pageutility.selectDropdownbyText(alert, "Red");
	}
}
