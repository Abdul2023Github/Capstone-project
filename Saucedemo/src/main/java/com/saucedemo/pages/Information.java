package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {

	@FindBy(id = "first-name")
	private WebElement firstNameTextBox;
	
	@FindBy(id= "last-name")
	private WebElement LastNameTextBox;
	
	@FindBy (id= "postal-code")
	private WebElement ZipCodeTextBox;
	
	@FindBy(id= "continue")
	private WebElement ContinueBtn;
	
	
	

	public Information(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterfirstName(String FirstName) {
		firstNameTextBox.sendKeys("FirstName");
		
	}
	
	public void enterLastName(String LastName) {
		LastNameTextBox.sendKeys("LastName");
				
	}
	
	public void enterzipCode(int ZipCode) {
		ZipCodeTextBox.sendKeys("ZipCode");
		
	}
	
	public void clickContinueBtn() {
		ContinueBtn.click();
		
	}
}