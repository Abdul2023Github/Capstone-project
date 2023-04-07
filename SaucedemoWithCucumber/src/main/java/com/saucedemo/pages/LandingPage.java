package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(id="user-name")
	private WebElement emailTextBox;
	
	@FindBy (id= "password")
	private WebElement passwordTextBox;
	
	@FindBy (id= "login-button")
	private WebElement loginBtn;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	

}
