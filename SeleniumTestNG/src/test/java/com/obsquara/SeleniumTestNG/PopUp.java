package com.obsquara.SeleniumTestNG;



import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopUp extends Base {
	@Test
public void popup()  {
	driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
	WebElement popup=driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));
	popup.click();
	String MainWindow=driver.getWindowHandle();
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();		
	
    while(i1.hasNext())			{		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			{    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                String input="Log in";
                WebElement loginbutton=driver.findElement(By.xpath("//div[contains(@class,'x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1y')]"));
               
                String actualmsg=loginbutton.getText();
               
               
                assertEquals(actualmsg,input,"Text not Found");
                loginbutton.click();
                
                String exceptedalertmesg="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
                WebElement alertmsg=driver.findElement(By.xpath("//div[@class='_9ay7']"));
                String actualalertMesg=alertmsg.getText();
                	assertEquals(actualalertMesg,exceptedalertmesg,"Message not found");
                
        															}   
        																}
																				}
    
	@Test
               public void alertmet()     {
				  String	input="Devika";
            	  driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
            	  WebElement alerMsg=driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
            	  alerMsg.click();
            	  driver.switchTo().alert().accept();
            	  WebElement alertCancel=driver.findElement(By.xpath("//button[contains(@class,'btn btn-warning')]"));
            	  alertCancel.click();
            	  driver.switchTo().alert().dismiss();
            	  WebElement alertpromt=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
            	  alertpromt.click();
            	  
            	  driver.switchTo().alert().sendKeys(input);
            	  driver.switchTo().alert().getText();
            
            	  
               }
                
        }
    
