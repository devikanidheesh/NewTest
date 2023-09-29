package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class ManageLocationPage {
	public WebDriver driver;
	public ManageLocationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[text()='Manage Location']//parent::a")
	private WebElement managelocation;
	@FindBy(xpath="//a[@onclick='click_button(2)']")
	private WebElement search;
	@FindBy(xpath="//select[@id='country_id']")
	private WebElement countryid;
	@FindBy(xpath="//select[@id='st_id']")
	private WebElement stateid;
	@FindBy(xpath="//input[@id='location']")
	private WebElement locationField;
	@FindBy(xpath="//button[@name='Search']")
	private WebElement searchbutton;
	@FindBy(xpath="//h4[text()='List Locations']")
	private WebElement ListLocationText;
	
	
	public ManageLocationPage clicktomanagelocation()
	{
		managelocation.click();
		return this;
	}
	public String getSearchButtonText()
	{
		return search.getText();
	}
	public ManageLocationPage searchbuttonclickable()
	{
		search.click();
		return this;
	}
	
	public ManageLocationPage selectcountryid() {
	PageUtility pageutility=new PageUtility();
	pageutility.selectDropdownbyText(countryid,"United Kingdom");
	countryid.click();
	return this;
	}
	
	public String getTextStateId()
	{
		return stateid.getText();
	}
	
	public ManageLocationPage selectStateId() {
		PageUtility pageutility=new PageUtility();
		pageutility.selectDropdownbyText(stateid,"Bristol");
		WaitUtility waitutility=new WaitUtility();
		waitutility.fluentwaitelementtoBeClicked(driver, stateid);	
		stateid.click();
		return this;
		
		}
	public ManageLocationPage enterTheLocationField(String location)
	{
		locationField.sendKeys(location);
		return this;
	}
	public String getSearchButtonTextafterDetails()
	{
		return searchbutton.getText();
		
}
	public ManageLocationPage clickableSearchButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.clickAndHold(locationField, searchbutton, driver);
		searchbutton.click();
		return this;
	}
	public String listLocationTextVisible()
	{
		return ListLocationText.getText();
	}
}

