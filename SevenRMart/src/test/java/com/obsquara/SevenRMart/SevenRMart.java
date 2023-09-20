package com.obsquara.SevenRMart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SevenRMart extends Base   {
@Test
	public void sevenrmartAdminLogin()    {
	String username="admin";
	String password="admin";
	WebElement loginUsername=driver.findElement(By.xpath("//input[@name='username']"));
	loginUsername.sendKeys(username);
	WebElement loginPassword=driver.findElement(By.xpath("//input[@name='password']"));
	loginPassword.sendKeys(password);
	WebElement checkboxRember=driver.findElement(By.xpath("//div[@class='icheck-dark']"));
	checkboxRember.click();
	WebElement remeberText=driver.findElement(By.xpath("//label[@for='remember']"));
	remeberText.getText();
	WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();	
	String excpctedURL="https://groceryapp.uniqassosiates.com/admin";
	String actualURL=driver.getCurrentUrl();
	assertEquals(excpctedURL,actualURL,"Wrong password and username");
											
												}
													}
