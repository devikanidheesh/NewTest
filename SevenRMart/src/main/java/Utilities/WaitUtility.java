package Utilities;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUtility {
	
		public static final long IMPLICIT_WAIT = 10;
		public static final long PAGE_LOAD_WAIT = 20;
		public static final long EXPLICIT_WAIT = 50;
		public static final long FLUENT_WAIT=30;
		public static final long POLL_WAIT=15;
		
		public void implicitWaits(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
		}

		public void waitForElement(WebDriver driver, WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(target));
		}

		public void waitForElement(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOfElementLocated(target));
		}
		public void waitForElementToBeClickable(WebDriver driver,By locator){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			
		}
		public void waitForElementToBeClickable(WebDriver driver,WebElement target ){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(target));
			
		}
		public void waitForElementAlertIsPresent(WebDriver driver,WebElement target ){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.alertIsPresent());	
		}
		public void  fluentwaitForVisibility(WebDriver driver,  WebElement timeout) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));	
			wait.until(ExpectedConditions.visibilityOf( timeout));
		}
		public void fluentWaitForVisibilityofallElement(WebDriver driver,WebElement target)
		{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(FLUENT_WAIT))
		        .pollingEvery(Duration.ofSeconds(POLL_WAIT))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOfAllElements(target));
	
		}
		public void  fluentwaitForAlertIsPresent(WebDriver driver,  WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		public void  fluentwaitelementtoBeClicked(WebDriver driver,  WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));	
			wait.until(ExpectedConditions.elementToBeClickable(target));
		}
		public void  fluentwaitelementtoBeClickedlocator(WebDriver driver,  WebElement locator) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));	
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		
}