package com.qatest.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qatest.base.TestBase;
import com.qatest.pages.ContactUsPage;
import com.qatest.pages.HomePage;
import com.qatest.pages.SignInPage;

public class SignInPageTest extends TestBase {
	
	HomePage homepage;
	SignInPage signinpage;
	
	public SignInPageTest() {
		super();
	}
	@BeforeMethod
	public void startTest() {
		initialization();
		homepage = new HomePage();
		signinpage = new SignInPage();
	}
	@Test
	public void verify_email_field_test()
	{
		homepage.clickonSignInLink();
		String a=signinpage.validateEmailfield();
		System.out.println(a);
		String b = "text";
		Assert.assertEquals(a,b);
	}
	
	
	
	
	
	
	@AfterMethod
	public void endTest() {
		od.close();
	}
	
	

	

}
