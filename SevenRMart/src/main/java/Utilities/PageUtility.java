package Utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	
	public void selectDropdownbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectDropDownByIndexValue(WebElement element ,int value){
		Select select = new Select(element);
		select.selectByIndex(value);	
	}
	
	 public void selectDropdownbyTextValue(WebElement element,String text){
		 Select select = new Select(element);
		 select.selectByVisibleText(text);
	 }
	 
	 public void dragAnddrop(WebElement dragableItem, WebElement dropItem, WebDriver driver) {
			Actions actions = new Actions(driver);
			actions.clickAndHold(dragableItem).moveToElement(dropItem).release(dropItem).build().perform();
		}

	 public void iframeConcepts(WebDriver driver,WebElement element) {
	 driver.switchTo().frame(element);
}
	 
	 public void dragAnddrop(WebElement dragableItem, WebDriver driver) {
			Actions actions = new Actions(driver);
			actions.scrollToElement(dragableItem).moveToElement(dragableItem).release(dragableItem).perform();
		}
	 public void clickabletheElement(WebElement target,WebDriver driver) {
	 Actions actions = new Actions(driver);
	 actions.click(target);
	 }
	 
	public void clickAndHold(WebElement dragableItem,WebElement dropItem,WebDriver driver){
		Actions actions = new Actions(driver);
		actions.clickAndHold(dragableItem).moveToElement(dropItem).release(dropItem).build().perform();
	}
	 public void singleClick(WebElement dragableItem,WebDriver driver){
		 Actions actions = new Actions(driver);
		 actions.moveToElement(dragableItem);
	 }
	 public void singleClickweblist(List<WebElement> list,WebDriver driver){
		 Actions actions = new Actions(driver);
		 actions.moveToElement((WebElement) list);
	 }
	 public void doubleClick(WebElement target,WebDriver driver){
		 Actions actions = new Actions(driver);
		 actions.doubleClick(target);
	 }
	 public void rightClick(WebDriver driver){
		 Actions actions = new Actions(driver);
		 actions.contextClick();
	 }
	 public void rightClick(WebDriver driver,WebElement target){
		 Actions actions = new Actions(driver);
		 actions.contextClick(target);
	 }
	 public void clickusingjavascriptExecuter(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,element); 
	}
	 public void clickusingjavascriptExecuterss(WebDriver driver, List<WebElement> element){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();" ,element); 
		}
	public void scrollByUsingJavascriptExecuter(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)"); 
	}
	public void sendInputUsingJavaScript(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=text;",element);
	}
	public void sendInputUsingJavaScripte(WebDriver driver, List<WebElement> Elements){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=text;",Elements);
	}
	 public void alertAccept(WebDriver driver,WebElement element){
		 element.click();
		 driver.switchTo().alert().accept();
	 }
	 public void alertDismis(WebDriver driver,WebElement element){
		 element.click();
		 driver.switchTo().alert().dismiss();
	 }
	 public void alertDismisokcancelWeblist(WebDriver driver,List<WebElement> list){
		 ((WebElement) list).click();
		 driver.switchTo().alert().dismiss();
	 }
	 public void alertPromt(WebElement element,WebDriver driver,String text) {
		 element.click();
		 driver.switchTo().alert().sendKeys(text);
   	  	driver.switchTo().alert().accept();
	 } 
	 public void popUpactions(WebDriver driver) {
	 driver.getWindowHandle();
}
}