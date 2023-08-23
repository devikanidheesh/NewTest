package com.obsquarastudents;

public class EdgeBrowser extends BaseMsEdge 
{
	String title=driver.getTitle();
	 String Url=driver.getCurrentUrl();
	String pagesource=driver.getPageSource();
	
public void navigationCommands()
{
	 driver.navigate().to("https://www.amazon.in");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 
}
	/*public void verifyTitle()
    {
   	 if(driver.getTitle()==" Obsqura Testing ")
   	 {
   		 System.out.println("testing passed");
   	 }
   	 else
   	 {
   		 System.out.println("testing failed");
   	 }
    }*/
	public static void main(String[] args) 
	{
		EdgeBrowser edgebrowser=new EdgeBrowser();
		edgebrowser.instilisebrow();
		edgebrowser.navigationCommands();
		//edgebrowser.verifyTitle();
		edgebrowser.QuitorClose();
	}

}
