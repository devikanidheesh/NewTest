package com.obsquarastudents;

public class ChromeBrowserCommand extends BaseChrome
{
     public void chromeBrowserCommand()
      {
    	 String title=driver.getTitle();
    	 String Url=driver.getCurrentUrl();
    	String pagesource=driver.getPageSource();
      }
     public void navigationCommands()
     {
    	 driver.navigate().to("https://www.amazon.in");
    	 driver.navigate().back();
    	 driver.navigate().forward();
    	 driver.navigate().refresh();
     }
	public static void main(String[] args)
	{
	ChromeBrowserCommand chromebrowsercommand=new ChromeBrowserCommand();
	chromebrowsercommand.instilBrowser();
	chromebrowsercommand.chromeBrowserCommand();
	chromebrowsercommand.navigationCommands();
	chromebrowsercommand.driverCloseOrQuit();
	
	}

}