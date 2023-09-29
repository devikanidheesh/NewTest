package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class PushNotificationPage {
	public WebDriver driver;
	public PushNotificationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[text()='Push Notifications']//parent::a")
	private WebElement pushNotification;
	@FindBy(xpath="//input[@id='title']")
	private WebElement titleField;
	@FindBy(xpath="//input[@id='description']")
	private WebElement enterDiscription;
	@FindBy(xpath="//button[contains(@class,'btn btn-block-sm btn-info')]")
	private WebElement sendButton;
	@FindBy(xpath="//i[contains(@class,'icon fas fa-check')]//parent::h5")
	private WebElement alert;

	public PushNotificationPage clickThePushNotificationPage()
	{
		pushNotification.click();
		return this;
	}
	public PushNotificationPage enterTheTitleinTitleField(String title)
	{
		titleField.sendKeys(title);
		return this;
	}
	public PushNotificationPage enterTheDiscriptioninDiscriptionField(String discription)
	{
		enterDiscription.sendKeys(discription);
		return this;
	}
	public String getTheSendText()
	{
		return sendButton.getText();
	}
	public PushNotificationPage clickTheSendButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.singleClick(sendButton, driver);
		sendButton.click();
		return this;
	}
	public String alertSuccesfullymessage()
	{
		return alert.getText();
		
	}
} 
