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
	@FindBy(xpath="//div[@id='imagePreview']")
	private WebElement imageupload;
	
	
	public ManageSliderPage clicktomanagelocation()
	{
		manageSlider.click();
		return this;
	}
	public String getTextNew()
	{
		return newButton.getText();
	}
	public ManageSliderPage clickNewButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickusingjavascriptExecuter(driver,newButton);
		return this;
	}
	public String getTextinchooseimage()
	{
		return chooseImage.getText();
	}
	public ManageSliderPage clickChooseImageButton()
	{
		chooseImage.click();
		return this;
	}
	public void imagepathSelected(WebElement element,String path) 
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		//fileuploadutility.activateFileUploadUsingSendKeys(imageupload, "src/main/java/ResourceFiles/flower.jpg");
		fileuploadutility.activateFileuploadUsingRobertClass(imageupload, path);
		
	}
	
	
	
}
