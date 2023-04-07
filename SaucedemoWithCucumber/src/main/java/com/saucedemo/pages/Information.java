package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {
	
	@FindBy(id="first-name")
	private WebElement enterFrstNameTextBox;
	
	@FindBy(id="last-name")
	private WebElement enterLastNameTextBox;
	
	@FindBy (id="postal-code")
	private WebElement postalCodeTextBox;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	
	
	public Information(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void enterFrstName(String firstName) {
		enterFrstNameTextBox.sendKeys("FirstName");
	}
	
	public void enterLastName(String lastName) {
		enterLastNameTextBox.sendKeys("LastName");
	}
	
	public void enterPostalCode(int postCode) {
		postalCodeTextBox.sendKeys("PostCode");
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}

}
