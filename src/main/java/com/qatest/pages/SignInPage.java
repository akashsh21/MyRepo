package com.qatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qatest.base.TestBase;

public class SignInPage extends TestBase {

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement pwd;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgot_pwd_link;

	@FindBy(xpath = "//button[@name='SubmitLogin']")
	WebElement sign_in_btn;

	public SignInPage() {
		PageFactory.initElements(od, this);
	}

	public String verifySignInPageTitle() {
		return od.getTitle();
	}

	public String validateEmailfield() {
		return emailField.getAttribute("type");
	}
}
