package com.obsquarastudents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseMsEdge 
{
WebDriver driver;
public void instilisebrow()
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\user\\git\\NewTest\\TestAuto\\src\\main\\java\\ResourceFiles\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
}
  public void QuitorClose()
  {
	  //driver.close();
	  driver.quit();
  }
	public static void main(String[] args)
	{
		BaseMsEdge basemsedge=new BaseMsEdge();
		basemsedge.instilisebrow();
		basemsedge.QuitorClose();

	}

}
