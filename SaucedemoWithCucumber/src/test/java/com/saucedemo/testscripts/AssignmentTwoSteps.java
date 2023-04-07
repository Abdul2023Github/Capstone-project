package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentTwoSteps extends Driver{
	
	@Given("User is on landing page of Saucedemo")
	public void user_is_on_landing_page_of_saucedemo() {   
	}
	@When("user enters the username {string} in the username textbox")
	public void user_enters_the_username_in_the_username_textbox(String string) {
		
		landingPage.enterEmail("locked_out_user");
	
	}
	@When("user enters the password {string} in the password textbox")
	public void user_enters_the_password_in_the_password_textbox(String string) {
		
		landingPage.enterPassword("secret_sauce");

	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		landingPage.clickLoginBtn();

	}
	@Then("user must see the error message {string} is displayed on the webpage")
	public void user_must_see_the_error_message_is_displayed_on_the_webpage(String string) {
		
		String expectedErrMsg = "Epic sadface: Sorry, this user has been locked out.";
		String actualErrMsg = verifyErrMsg.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		
	    
	}


}
