package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifysccsMsg {

	@FindBy(xpath = "//div[contains(@class,'complete-text')]")
	private WebElement verifysccsMsg;
	
	

	public VerifysccsMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getsccsMsg() {
		String message = verifysccsMsg.getText();
		return message;

	}

}
