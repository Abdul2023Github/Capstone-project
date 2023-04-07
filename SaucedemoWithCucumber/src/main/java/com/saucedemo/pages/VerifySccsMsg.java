package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySccsMsg {
	
	@FindBy (xpath="//div[contains(@class,'complete-text')]")
	private WebElement verifySccsMsg;
	
	public VerifySccsMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getSccsMsg() {
		String message = verifySccsMsg.getText();
		return message;
	}
	

}
