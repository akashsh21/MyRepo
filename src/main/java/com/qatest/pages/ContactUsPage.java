package com.qatest.pages;

import org.openqa.selenium.support.PageFactory;

import com.qatest.base.TestBase;

public class ContactUsPage extends TestBase{

	public ContactUsPage(){
		PageFactory.initElements(od, this);
	}
	
	public String verifyContactusTitle()
	{
		return od.getTitle(); 	
	}
}
