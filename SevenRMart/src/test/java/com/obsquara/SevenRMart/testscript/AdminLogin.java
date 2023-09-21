package com.obsquara.SevenRMart.testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdminLogin extends Base   {
@Test
	public void verifysevenrmartAdminLogin()    {
	String username="admin";
	String password="admin";
	String excpctedresult="Admin";
	WebElement loginUsername=driver.findElement(By.xpath("//input[@name='username']"));
	loginUsername.sendKeys(username);
	WebElement loginPassword=driver.findElement(By.xpath("//input[@name='password']"));
	loginPassword.sendKeys(password);
	WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();	
	WebElement admin=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	String actualresult=admin.getText();
	assertEquals(excpctedresult,actualresult,"verify admin login isfailed ");
	
											
}
@Test													
public void verifyWrongUserandcorrectPassword()
{
	
	String user="user";
	String password="admin";
	String excpctedresult="Alert!";
	WebElement loginUsername=driver.findElement(By.xpath("//input[@name='username']"));
	loginUsername.sendKeys(user);
	WebElement loginPassword=driver.findElement(By.xpath("//input[@name='password']"));
	loginPassword.sendKeys(password);
	WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();	
	WebElement alert=driver.findElement(By.xpath("//i[contains(@class,'icon fas fa-ban')]//parent::h5"));
	String actualresult=alert.getText();
	assertEquals(excpctedresult,actualresult,"verify Wromg username and correct password  is failed ");
	
}
@Test
public void verifycorrectUserNameandwrongPassword()

{
	
	String user="admin";
	String password="user";
	String excpctedresult="Alert!";
	WebElement loginUsername=driver.findElement(By.xpath("//input[@name='username']"));
	loginUsername.sendKeys(user);
	WebElement loginPassword=driver.findElement(By.xpath("//input[@name='password']"));
	loginPassword.sendKeys(password);
	WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();	
	WebElement alert=driver.findElement(By.xpath("//i[contains(@class,'icon fas fa-ban')]//parent::h5"));
	String actualresult=alert.getText();
	assertEquals(excpctedresult,actualresult,"verify Wromg username and correct password  is failed ");
}

@Test
public void verifyinvalidusernameAndpassword()
{
	String user="user";
	String password="user";
	String excpctedresult="Alert!";
	WebElement loginUsername=driver.findElement(By.xpath("//input[@name='username']"));
	loginUsername.sendKeys(user);
	WebElement loginPassword=driver.findElement(By.xpath("//input[@name='password']"));
	loginPassword.sendKeys(password);
	WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();	
	WebElement alert=driver.findElement(By.xpath("//i[contains(@class,'icon fas fa-ban')]//parent::h5"));
	String actualresult=alert.getText();
	assertEquals(excpctedresult,actualresult,"verify Wromg username and correct password  is failed ");
	}
}

	
		
		
	


