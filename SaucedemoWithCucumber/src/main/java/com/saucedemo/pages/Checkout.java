package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	@FindBy (id="checkout")
	private WebElement clickCheckoutBtn;
	
	@FindBy(xpath= "//span[contains(@class,'title')]")
	private WebElement verifyText;
	
	@FindBy(id="continue-shopping")
	private WebElement clickContinueShopingBtn;
	
	
	public Checkout (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckout() {
		clickCheckoutBtn.click();
	}
	
	public String verifyText () {
		String message = verifyText.getText();
		return message;
		
	}
	
	public void clickContinueShopingBtn() {
		clickContinueShopingBtn.click();
	
	
		
	}

}
