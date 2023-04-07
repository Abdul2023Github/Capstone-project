package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthSccsMsg {
	
	@FindBy(xpath="//h2[contains(@class,'complete-header')]")
	private WebElement FssccsMsg;
	
	
	public FourthSccsMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String fourthSccsMsg()	{
		String message = FssccsMsg.getText();
		return message;
	}
}
