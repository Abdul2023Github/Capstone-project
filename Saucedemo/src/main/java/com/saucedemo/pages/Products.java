package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartBtn;
	
	@FindBy (id= "add-to-cart-sauce-labs-bike-light")
	private WebElement scndCrtBtn;
	
	@FindBy (className = "shopping_cart_link")
	private WebElement clickMyCrtBtn;
	
	@FindBy (id= "add-to-cart-sauce-labs-onesie")
	private WebElement lowPricePrdctBtn;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement thirdPrdctBtn;
	
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement removeFirstPrdctBtn;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement highPricePrdctBtn;
	
		

	public Products(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
		
	}
	
	public void clickscndCrtBtn() {
		scndCrtBtn.click();
		
	}
	
	public void clickMyCrtBtn() {
		clickMyCrtBtn.click();
		
	}
	
	public void clickLowPricePrdctBtn() {
		lowPricePrdctBtn.click();
		
	}
	
	public void clickThirdprdctBtn() {
		thirdPrdctBtn.click();
	}
	
	public void clickRemoveFirstPrdctBtn() {
		removeFirstPrdctBtn.click();
	}
	
	public void clcikHighPricePrdctBtn() {
		highPricePrdctBtn.click();
	}

}