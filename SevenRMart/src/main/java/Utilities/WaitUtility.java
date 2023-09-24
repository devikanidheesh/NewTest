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
		public static final long TIME_OUT_WAIT=15;

		public void waitForElement(WebDriver driver, WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(target));
		}

		public void waitForElement(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOfElementLocated(target));
		}
		public void  waitForElements(WebDriver driver,  WebElement timeout) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));	
			wait.until(ExpectedConditions.visibilityOf( timeout));
		}
}