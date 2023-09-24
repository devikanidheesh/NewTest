package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;



public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@name='username']") WebElement usernameField;
	@FindBy(xpath="//input[@name='password']") WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signInButton;
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//i[contains(@class,'icon fas fa-ban')]//parent::h5") WebElement alert;
	
	public void enterUsernameOnUserNameField(String userName)
	{
		usernameField.sendKeys(userName);
	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
	}
	public void clickSigninButton()
	{
		signInButton.click();
	}
	public String verifyNavigateToAdminHomePage()
	{
		
		return admin.getText();
	}
	public String verifyGetTheAlertMessage()
	{
		return alert.getText();
	}
	public void sample()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectDropdownbyText(alert, "Red");
	}
}
