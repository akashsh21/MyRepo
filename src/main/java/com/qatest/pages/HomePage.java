package com.qatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qatest.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(){
		PageFactory.initElements(od, this);
	}
		
		@FindBy(xpath="//a[@class='login']")
		public static WebElement Signin_link;
		
		@FindBy(how=How.XPATH, using="//a[@title='Contact Us']")
		public static WebElement Contact_us_link;

			
		public String verifyHomepageTitle() {
			return od.getTitle();
		}
		
		public SignInPage clickonSignInLink()
		{
			Signin_link.click();
			return new SignInPage();
		}
		public ContactUsPage clickonContactUsLink()
		{
		Contact_us_link.click();
			return new ContactUsPage();
		}
		
}
