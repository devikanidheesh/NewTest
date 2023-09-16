package com.obsquara.SeleniumTestNG;



import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopUp extends Base
{
	@Test
public void popup()
{
	driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
	WebElement popup=driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));
	popup.click();
	String MainWindow=driver.getWindowHandle();
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();		
	
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
              String input="Log in";
                WebElement loginbutton=driver.findElement(By.xpath("//div[contains(@class,'x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1y')]"));
               
                String actualmsg=loginbutton.getText();
                if(actualmsg.equals(input))
                {
               
                assertEquals(actualmsg,input,"Text not Found");
                loginbutton.click();
                
                }
                
              //driver.navigate().to("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1");
                //WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
                
                
        }
    }
	
}
}

