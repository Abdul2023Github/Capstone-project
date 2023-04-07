package com.saucedemo.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentFourSteps extends Driver{
	
	@Given("user is on the landing page of Saucedemo")
	public void user_is_on_the_landing_page_of_saucedemo() {
	}
	@When("user enters the user name {string} in username textbox")
	public void user_enters_the_user_name_in_username_textbox(String string) {
		
		landingPage.enterEmail("standard_user");
		
	}
	@When("user enters the password {string} in password textbox")
	public void user_enters_the_password_in_password_textbox(String string) {
		
		landingPage.enterPassword("secret_sauce");

	}
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		
		landingPage.clickLoginBtn();

	}
	@When("user sort the items based on price from low to high")
	public void user_sort_the_items_based_on_price_from_low_to_high() {
		
		Select dropDownBtn = new Select(
				driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]")));
		dropDownBtn.selectByVisibleText("Price (low to high)");
	
	}
	@When("user add first item to the cart")
	public void user_add_first_item_to_the_cart() {
		
		products.clickLowPricePrdctBtn();
		products.clickMyCrtBtn();
	 
	}
	@When("user Verify the same item which you selected on the previous page has been added to cart")
	public void user_verify_the_same_item_which_you_selected_on_the_previous_page_has_been_added_to_cart() {
		
		WebElement confirmationMsg = driver.findElement(By.id("item_2_title_link"));
		String confirmationText = confirmationMsg.getText();
		if (confirmationText.contains("Sauce Labs Onesie")) {
			System.out.println("Item is the same as we selected");
		}
		else
		{System.out.println("Item is not the slected one");
		}
	
	}
	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
		
		checkout.clickCheckout();
	
	}
	@When("user enters his first name in the first name textbox")
	public void user_enters_his_first_name_in_the_first_name_textbox() {
		
		information.enterFrstName("Abdl");
	  
	}
	@When("user enters his last name in the last name textbox")
	public void user_enters_his_last_name_in_the_last_name_textbox() {
		
		information.enterLastName("GH");
	  
	}
	@When("user enters postal code in postal code textbox")
	public void user_enters_postal_code_in_postal_code_textbox() {
		
		information.enterPostalCode(30021);
	    
	}
	@When("user clicks in the continue button")
	public void user_clicks_in_the_continue_button() {
		
		information.clickContinueBtn();
	  
	}
	@When("user clicks on finish botton on the next page")
	public void user_clicks_on_finish_botton_on_the_next_page() {
		
		finish.clickFinishBtn();
	   
	}
	@Then("user meust see the sucess message {string} is disppalyed to the user")
	public void user_meust_see_the_sucess_message_is_disppalyed_to_the_user(String string) {
		
		String expectedFsccsMsg = "Thank you for your order!";
		String actualFsccsMsg = fsccsMsg.fourthSccsMsg();
		Assert.assertEquals(actualFsccsMsg, expectedFsccsMsg);	

	}

}
