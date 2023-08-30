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
    public void testTitle()
    	 {
     if(driver.getTitle().equals("Obsqura Testing"))
		 {
			 System.out.println("testing passed");
	 }
	 else
	 {
		 System.out.println("testing failed");
	 }
}
	public static void main(String[] args)
	{ 
	ChromeBrowserCommand chromebrowsercommand=new ChromeBrowserCommand();
	chromebrowsercommand.instilBrowser();
	chromebrowsercommand.chromeBrowserCommand();
	chromebrowsercommand.testTitle();
	chromebrowsercommand.navigationCommands();
	chromebrowsercommand.driverCloseOrQuit();
	
	}

}
