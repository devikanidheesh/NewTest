package com.obsquara.SeleniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
	@Test
	public void testcase1()
	{
		System.out.println("Testcase");
	}
	@BeforeMethod
public void beforeMethod()
{
	System.out.println("Before Method");
}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Testcase");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after Method");
}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before Suit");
	}
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("AfterSuit");
	}
	
}
