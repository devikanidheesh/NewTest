package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class LogoutPage {
	public WebDriver driver;
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//i[contains(@class,'ace-icon fa fa-power-off')]") WebElement logout;
	@FindBy(xpath="//label[@for='remember']") WebElement loginpage;
	public void AdminPage()
	{
		
		admin.click();
	}
	public void adminLogout()
	{
		logout.click();
		
		
	}
	public String verifyGettheloginpage()
	{
		return loginpage.getText();
	}
	public void waitExplicit()
	{
		WaitUtility waitutility = new WaitUtility();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		
	}
}
