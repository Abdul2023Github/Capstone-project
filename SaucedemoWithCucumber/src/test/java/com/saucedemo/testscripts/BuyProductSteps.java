package com.saucedemo.testscripts;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyProductSteps extends Driver {
	
	@Given("user is on landing page of Saucedemo")
	public void user_is_on_landing_page_of_saucedemo() {
			}

	@When("he enters the username")
	public void he_enters_the_username() {
		landingPage.enterEmail("standard_user");

	}

	@When("he enters the passwords")
	public void he_enters_the_passwords() {
		landingPage.enterPassword("secret_sauce");

	}

	@When("he clicks on log in button")
	public void he_clicks_on_log_in_button() {
		landingPage.clickLoginBtn();

	}

	@When("he add first {int} products to the cart")
	public void he_add_first_products_to_the_cart(Integer int1) {

		products.clickAddToCartBtn();
		products.clickscndCrtBtn();

	}

	@When("he clicks on the cart icon")
	public void he_clicks_on_the_cart_icon() {

		products.clickMyCrtBtn();
	}

	@When("he clicks on checkout button")
	public void he_clicks_on_checkout_button() {

		checkout.clickCheckout();

	}

	@When("he enters first name")
	public void he_enters_first_name() {
		information.enterFrstName("Abdl");

	}

	@When("he enters last name")
	public void he_enters_last_name() {
		information.enterLastName("GH");

	}

	@When("he enters postal code")
	public void he_enters_postal_code() {
		information.enterPostalCode(32001);

	}

	@When("he clicks on continue button")
	public void he_clicks_on_continue_button() {
		information.clickContinueBtn();

	}

	@When("he clicks on finish button")
	public void he_clicks_on_finish_button() {
		finish.clickFinishBtn();

	}

	@Then("he should see the Success message")
	public void he_should_see_the_success_message() {

		String expectedSccsMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualVerifySccsMsg = verifySccsMsg.getSccsMsg();
		Assert.assertEquals(actualVerifySccsMsg, expectedSccsMsg);

	}

}
