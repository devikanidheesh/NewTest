package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPagesNewSavepage {
	public WebDriver driver;
	public ListPagesNewSavepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy(xpath="//input[@id='title']") WebElement titleItem;
	@FindBy(xpath="//div[@role='textbox']") WebElement itemDiscription;
	@FindBy(xpath="//input[@id='page']") WebElement pageName;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	
	public void listPagenewButton()
	{
		newButton.click();
	}

	public void enterTitleOfItem(String title)
	{
		titleItem.sendKeys(title);
	}
	public void enterTheDescriptionForItem(String description)
	{
		itemDiscription.sendKeys(description);
	}
public void enterThePageName(String pageN)
{
	
	pageName.sendKeys(pageN);
	}
public String getTheSaveButtonText()
{
	return saveButton.getText();
}
}