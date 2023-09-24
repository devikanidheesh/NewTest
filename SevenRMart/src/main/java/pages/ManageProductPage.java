package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
	public WebDriver driver;
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[text()='Manage Product']//parent::a") WebElement manageproduct;
	@FindBy(xpath="//i[contains(@class,'nav-icon fas fa-tasks')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']") WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement search;
	public String navigateManageProductPage()
	{
		return manageproduct.getText();
	}

	public void clickManageProductPage()
	{
		moreinfo.click();
	}
	public String SearchButton()
	{
		return search.getText();
	}
}
