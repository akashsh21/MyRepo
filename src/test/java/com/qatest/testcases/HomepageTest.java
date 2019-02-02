package com.qatest.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qatest.base.TestBase;
import com.qatest.pages.ContactUsPage;
import com.qatest.pages.HomePage;
import com.qatest.pages.SignInPage;

public class HomepageTest extends TestBase {

	HomePage homepage;
	ContactUsPage contactuspage;
	SignInPage signinpage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void startTest() {
		initialization();
		homepage = new HomePage();
		contactuspage = new ContactUsPage();
		signinpage = new SignInPage();
	}

	@Test()
	public void verifyHomepage() throws IOException {
		String a = "My Store";
		String title = homepage.verifyHomepageTitle();
		System.out.println(title);
		Assert.assertEquals(title, a);
	}

	@Test()
	public void signInLinkTest() {
		String b = "Login - My Store";
		homepage.clickonSignInLink();
		String title1 = signinpage.verifySignInPageTitle();
		System.out.println(title1);
		Assert.assertEquals(title1, b);
	}

	@Test()
	public void contactsUsLinkTest() {
		String c = "Contact us - My Store";
		homepage.clickonContactUsLink();
		String title2 = contactuspage.verifyContactusTitle();
		System.out.println(title2);
		Assert.assertEquals(title2, c);
	}

	@AfterMethod
	public void endTest() {
		od.close();
	}
}
