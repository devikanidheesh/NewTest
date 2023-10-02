package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class ManageOfferCodePage {
	public WebDriver driver;
	public ManageOfferCodePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//p[text()='Manage Offer Code']//parent::div")
	private WebElement manageroffercode;
	@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode']") 
	private WebElement moreinfo;
	@FindAll({@FindBy(xpath="//table[contains(@class,'table table-bordered table-hover table-sm')]//child::th")}) 
	List<WebElement>listOfferCodeDelete;
	@FindAll({@FindBy(xpath="//table[contains(@class,'table table-bordered table-hover table-sm')]//child::td")}) 
	List<WebElement>listOfferDeleteitem;
	@FindAll({@FindBy(xpath="//i[@class='fas fa-trash-alt']")}) 
	List<WebElement>deleteKey;
	
	public String navigateToManageofferPages(){
		return manageroffercode.getText();
	}
	public ManageOfferCodePage clicktomanageofferpage(){
		moreinfo.click();
		return this;

	}
	public String  getTheListItems(){
		for(WebElement listOfferCodeElements:listOfferCodeDelete) {
			return listOfferCodeElements.getText();	
		}
		return null;
			
		}
	public  ManageOfferCodePage  getThedeleteitems(){
		for(WebElement listitems:listOfferDeleteitem) {
			listitems.getText();
		listOfferDeleteitem.contains(listitems);
		deleteKey.indexOf(listitems);
		listitems.click();
			
		}
		return this;
	}
	public ManageOfferCodePage clickableDeleteItem(){
		PageUtility pageutility=new PageUtility();
		pageutility.singleClickweblist(deleteKey, driver);
		pageutility.alertDismisokcancelWeblist(driver, deleteKey);
		return this;
}
	
	
	
}


