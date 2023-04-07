package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthSccsMsg {
	
	@FindBy(xpath = "//h2[contains(@class,'complete-header')]")
	private WebElement sccsMsgTxt;
	
	
	public FifthSccsMsg (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String sccsMsgTxt () {
		String message = sccsMsgTxt.getText();
		return message;
		
		
	}

}
