package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePage {
	public WebDriver driver;
	public ManagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
@FindBy(xpath="//p[text()='Manage Pages']//parent::a") WebElement managePages;
@FindBy(xpath="//i[contains(@class,'fas fa-arrow-circle-right')]//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']") WebElement moreinfo;
@FindBy(xpath="//h1[text()='List Pages']") WebElement listpages;

public  String navigateToManagePages()
{
	return managePages.getText();
	
}
public void clicktheManagePage()
{
	moreinfo.click();
}
public String navigateToListPages()
{
	return listpages.getText();
}
}
