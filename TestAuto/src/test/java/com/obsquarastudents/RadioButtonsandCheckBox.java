package com.obsquarastudents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonsandCheckBox extends BaseChrome
{
	public void radioButtonM()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleRadioButton.click();
		boolean isMaleRadiobuttonSelected=maleRadioButton.isSelected();
	
		 if(isMaleRadiobuttonSelected)
         {
    	  	System.out.println("testing passed");
         }
      	 else
      	 {
      		System.out.println("testing failed");
      	 }
	
	}
	public void radioButtonF()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleRadioButton.click();
		boolean isFemaleRadiobuttonSelected=femaleRadioButton.isSelected();
	
		 if(isFemaleRadiobuttonSelected)
         {
    	  	System.out.println("Testing passed");
         }
      	 else
      	 {
      		System.out.println("Testing failed");
      	 }
	
	}
	
	public void verifyRadioButtonsDisabled()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement radioButtonDisabled=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement radioButton2Disabled=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		boolean isRadioButton=radioButtonDisabled.isSelected();
		boolean isRadioButton2=radioButton2Disabled.isSelected();
		if(!isRadioButton&&!isRadioButton2)
		{
			System.out.println("Teating passed");
			
		}
		else
		{
			System.out.println("Testing failed");
		}
	}
	public void verifyMaleRadioButtonDisabled()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleRadioButton.click();
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		boolean maleradiobuttonselcted=maleRadioButton.isSelected();
		if(!maleradiobuttonselcted)
		{
			System.out.println("Testing Passed");
		}
		else
		{
			System.out.println("Testing failed");
		}
	}
	public void verifyFemaleRadioButtonDisabled()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton =driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleRadioButton.click();
		WebElement femaleRadioButton =driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		boolean isfemaleRadiobuttonSelected= femaleRadioButton.isSelected();
	
		 if(!isfemaleRadiobuttonSelected)
         {
    	  	System.out.println("testing passed");
         }
      	 else
      	 {
      		System.out.println("testing failed");
      	 }
	}
	public void verifyShowSelectedButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=message.getText();
		String exceptedMessage="Radio button 'Male' is checked";
			if(exceptedMessage.equals(actualMessage))
			{
				System.out.println("Testing passed");
			}
			else
			{
				System.out.println("Testing failed");
			}
	}
	public void checkBox()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxButton=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBoxButton.click();
		boolean isCheckBoxValueDisplayed=checkBoxButton.isDisplayed();
		boolean isCheckBoxselected=checkBoxButton.isSelected();
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualmessage=message.getText();
		String exceptedmessage="Success - Check box is checked";
		//System.out.println("expectedValue.trim()"+exceptedmessage.trim());
		//System.out.println("actualValue.trim()"+actualmessage.trim());
		if(actualmessage.equals(exceptedmessage))
		{
			System.out.println("Testing Passed");
		}
		else
		{
			System.out.println("Testing failed");
		}
	}
	public void verifySelectAllButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean selectAllButtonDisplayed=selectAllButton.isDisplayed();
		if(selectAllButtonDisplayed)
		{
			System.out.println("Testing Passed");
			}
		else
		{
			System.out.println("Testing Failed");
		}
	}
	public void verifyMultiplecheckBox()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement multipleCheckbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement multiplecheckbox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement multiplecheckbox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement multiplecheckbox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean selectmultiple1=multipleCheckbox1.isDisplayed();
		boolean selectmultiple2=multiplecheckbox2.isDisplayed();
		boolean selectmultiple3=multiplecheckbox3.isDisplayed();
		boolean selectmultiple4=multiplecheckbox4.isDisplayed();
		multipleCheckbox1.click();
		multiplecheckbox2.click();
		if(selectmultiple1)
		{
			System.out.println("Testing Passed");
		}
		else
		{
			System.out.println("Testing failed");
		}
		
	}
	public static void main(String[] args) 
	{
		RadioButtonsandCheckBox radiobuttonandcheckbox=new RadioButtonsandCheckBox();
		radiobuttonandcheckbox.instilBrowser();
		radiobuttonandcheckbox.checkBox();
		radiobuttonandcheckbox.verifyShowSelectedButton();
		radiobuttonandcheckbox.verifySelectAllButton();
		radiobuttonandcheckbox.verifyMultiplecheckBox();
		radiobuttonandcheckbox.driverCloseOrQuit();

	}

}
