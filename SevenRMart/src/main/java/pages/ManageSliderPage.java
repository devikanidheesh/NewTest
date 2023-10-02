package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.FileUploadUtility;
import Utilities.GeneralUtility;
import Utilities.PageUtility;
import Utilities.WaitUtility;

public class ManageSliderPage {
	public WebDriver driver;
	public ManageSliderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[text()='Manage Slider']//parent::a")
	private WebElement manageSlider;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	private WebElement newButton;
	@FindBy(xpath="//input[@id='main_img']")
	private WebElement chooseImage;
	@FindBy(xpath="//input[@id='link']")
	private WebElement linkText;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	@FindBy(xpath="//h5[text()=' Alert!']//parent::div")
	private WebElement alert;
	
	public ManageSliderPage clicktomanagelocation()
	{
		manageSlider.click();
		return this;
	}
	public ManageSliderPage clickNewButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver,newButton);
		return this;
	}

	public ManageSliderPage imageUpload() 
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.activateFileUploadUsingSendKeys(chooseImage,GeneralUtility.IMAGEFILETHATUPLOADMANAGESILDERPAGE );
		return this;
	}
	public ManageSliderPage enterTheLinkinLInkField(String link)
	{
		linkText.sendKeys(link);
		return this;
	}
	public ManageSliderPage clicktoSaveButton() {
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver, savebutton);
		return this;	
	}
	public boolean  getTheAlertMessagetoSuceesfully()
	{
		
		return alert.isDisplayed();
	}
	
	
	
}
