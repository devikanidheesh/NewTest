package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class CategoryPage {
	public WebDriver driver;
	public CategoryPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//p[text()='Category']//parent::div")
	private WebElement categorypageText;
	@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	private WebElement moreinfo;
	@FindAll({@FindBy(xpath="//table[contains(@class,'table table-bordered table-hover table-sm')]//child::td")}) 
	private List<WebElement>categoryListElement;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/delete?del=204&page_ad=1']")
	private WebElement deleteKey;
	@FindBy(xpath="//div[contains(@class,'alert alert-success alert-dismissible')]")
	private WebElement alertMsg;

	public String navigateToCategoryPage(){
		return categorypageText.getText();
	}
	public CategoryPage  clicktoCategorylistpage(){
		moreinfo.click();
		return this;
	}
	public CategoryPage deleteTheParticularItem(String expectedListItem)
	{
		for(WebElement item:categoryListElement)
		{
			String cateogaryItem=item.getText();
			if(cateogaryItem.contains(expectedListItem))
			{
				WaitUtility waitutility=new WaitUtility();
				PageUtility pageutility=new PageUtility();
				pageutility.clickusingjavascriptExecuter(driver, deleteKey);
				waitutility.fluentWaitForVisibilityofallElement(driver, deleteKey);
				pageutility.alertAccept(driver, deleteKey);
			
			}
		}
		return this;
	}
	public boolean AlertMessageIsDisplayed()
	{
		boolean alert=alertMsg.isDisplayed();
		return alert;
	}
	
}
