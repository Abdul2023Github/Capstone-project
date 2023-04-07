package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyErrMsg {

	@FindBy(xpath = "//h3[contains(@data-test,'error')]")
	private WebElement verifyErrMsg;

	public VerifyErrMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getErrMsg() {
		String message = verifyErrMsg.getText();
		return message;

	}

}
