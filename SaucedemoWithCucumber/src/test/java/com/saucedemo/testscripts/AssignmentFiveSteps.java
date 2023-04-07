package com.saucedemo.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentFiveSteps extends Driver{
	
	@Given("user is on the landing page \\(Saucedemo) website")
	public void user_is_on_the_landing_page_saucedemo_website() {
	   
	}

	@When("user enters the user name \\(standerd_user) in username textbox")
	public void user_enters_the_user_name_standerd_user_in_username_textbox() {
		
		landingPage.enterEmail("standard_user");
	   
	}

	@When("user enters the password \\(secret_sauce) in password textbox")
	public void user_enters_the_password_secret_sauce_in_password_textbox() {
		
		landingPage.enterPassword("secret_sauce");
	 
	}

	@When("user clicks on the login page")
	public void user_clicks_on_the_login_page() {
		
		landingPage.clickLoginBtn();
	 
	}

	@When("user add the first product to the cart")
	public void user_add_the_first_product_to_the_cart() {
		
		products.clickAddToCartBtn();
	
	}

	@When("user ass the Third product to the cart")
	public void user_ass_the_third_product_to_the_cart() {
		
		products.clickThirdprdctBtn();
	  
	}

	@When("user remove the first product from the cart")
	public void user_remove_the_first_product_from_the_cart() {
		
		products.clickRemoveFirstPrdctBtn();
	  
	}

	@When("user clicks on cart icon on the top right")
	public void user_clicks_on_cart_icon_on_the_top_right() {
		
		products.clickMyCrtBtn();
	  
	}

	@When("user verify the text {string} in displayed at the top left corner of the page")
	public void user_verify_the_text_in_displayed_at_the_top_left_corner_of_the_page(String string) {
		
		String expectedText = "Your Cart";
		String actualText = checkout.verifyText();
		Assert.assertEquals(actualText, expectedText);
	  
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
		
		checkout.clickContinueShopingBtn();
	   
	}

	@When("sort the price from high to low")
	public void sort_the_price_from_high_to_low() {
		
		Select dropDownBtn = new Select(
				driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]")));
				dropDownBtn.selectByVisibleText("Price (high to low)");

	}

	@When("user add the most expensive item to the cart")
	public void user_add_the_most_expensive_item_to_the_cart() {
		
		products.clcikHighPricePrdctBtn();
	  
	}

	@When("user clicks on cart icon")
	public void user_clicks_on_cart_icon() {
		
		products.clickMyCrtBtn();
	
	}

	@When("user verify the there are two items in the cart")
	public void user_verify_the_there_are_two_items_in_the_cart() {
		
		WebElement itemCountElement = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
		String itemCountText = itemCountElement.getText();
		int itemCount = Integer.parseInt(itemCountText);
		if (itemCount == 2) {
			System.out.println("Cart contains 2 items");
		}
		else {
			System.out.println("Unexpected number of items in cart:" +itemCount);
		}
	 
	}

	@When("user enters his first name in first name textbox")
	public void user_enters_his_first_name_in_first_name_textbox() {
		
		information.enterFrstName("Abdl");
	  
	}

	@When("user enters his last name in last name textbox")
	public void user_enters_his_last_name_in_last_name_textbox() {
		
		information.enterLastName("GH");
	
	}

	@When("user enters the postal code in the postal code textbox")
	public void user_enters_the_postal_code_in_the_postal_code_textbox() {
		
		information.enterPostalCode(30021);
	
	}

	@When("user cicks on continue button")
	public void user_cicks_on_continue_button() {
		
		information.clickContinueBtn();
	 
	}

	@When("user clicks on finish button on the next page")
	public void user_clicks_on_finish_button_on_the_next_page() {
		
		finish.clickFinishBtn();
	   
	}

	@Then("user must see the success message {string} is displayed")
	public void user_must_see_the_success_message_is_displayed(String string) {
		
		String expectedSccsMsgTxt = "Thank you for your order!";
		String actualSccsMsgTxt = SccsMsg.sccsMsgTxt();
		Assert.assertEquals(actualSccsMsgTxt, expectedSccsMsgTxt);
	    
	}

}
