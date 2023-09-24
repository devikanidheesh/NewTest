package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLocationPage {
	public WebDriver driver;
	public ManageLocationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@data-widget='pushmenu']") WebElement sidebar;
	@FindBy(xpath="//p[text()='Manage Location']//parent::a")WebElement managelocation;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/edit?edit=1607&page_ad=1']") WebElement edit;
	@FindBy(xpath="//button[@type='submit']")WebElement  update;
	public void viewsidebarmenu()
	{
		sidebar.click();
	}

	public void clicktomanagelocation()
	{
		managelocation.click();
	}
	public void checktoedit()
	{
		edit.click();
	}
	
	public String updatedbuttonpresent()
	{
		return update.getText();
	}
	public void updatedclickable()
	{
		update.click();
	}
}
