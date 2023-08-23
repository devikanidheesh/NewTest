package com.obsquarastudents;

public class VerifyChromeTitle extends ChromeBrowserCommand
{
	public void verifyTitle()
    {
   	 if(driver.getTitle()==" Obsqura Testing ")
   		
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
		VerifyChromeTitle  verifychrometitle=new VerifyChromeTitle();
		verifychrometitle.verifyTitle();
		
	}

}
