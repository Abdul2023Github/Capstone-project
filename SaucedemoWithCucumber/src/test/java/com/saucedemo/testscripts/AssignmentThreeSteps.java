package com.saucedemo.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentThreeSteps extends Driver{
	
	@Given("User is on Landing page of Saucedemo")
	public void user_is_on_landing_page_of_saucedemo() {
	}
	@When("he enters the username {string} in username textbox")
	public void he_enters_the_username_in_username_textbox(String string) {
		
		landingPage.enterEmail("problem_user");
		
	}
	@When("he enters the password {string} in the password textbox")
	public void he_enters_the_password_in_the_password_textbox(String string) {
		
		landingPage.enterPassword("secret_sauce");

	}
	@When("he clicks in login button")
	public void he_clicks_in_login_button() {
		
		landingPage.clickLoginBtn();

	}
	@When("he will see a list of product")
	public void he_will_see_a_list_of_product() {
		

	}
	@When("he add the first product to the cart")
	public void he_add_the_first_product_to_the_cart() {
		
		products.clickAddToCartBtn();

	}
	@When("he clicks the cart icon at the top right corner")
	public void he_clicks_the_cart_icon_at_the_top_right_corner() {
		
		products.clickAddToCartBtn();
	 
	}
	@When("he enters his first name in the first name textbox")
	public void he_enters_his_first_name_in_the_first_name_textbox() {
		
		information.enterFrstName("Abdl");
	
	}
	@When("he enters his last name in the last name textbox")
	public void he_enters_his_last_name_in_the_last_name_textbox() {
		
		information.enterLastName("GH");

	}
	@When("he enters postal code in postal code textbox")
	public void he_enters_postal_code_in_postal_code_textbox() {
		
		information.enterPostalCode(30021);

	}
	@When("he clicks in the continue button")
	public void he_clicks_in_the_continue_button() {
		
		information.clickContinueBtn();

	}
	@Then("he must see the last name textbox gets emptied automatically and an error message {string} is displayed")
	public void he_must_see_the_last_name_textbox_gets_emptied_automatically_and_an_error_message_is_displayed(String string) {
		
		String expectedErrMsg = "Error: Last Name is required";
		String actualErrMsg = verifyErrMsg.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);

	}

}
