package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.CheckOut;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Products;
import com.saucedemo.pages.VerifyErrMsg;

public class ThirdScenarioTest extends BaseTest{
	
	@Test
	public void ThirdscenarioTest() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.enterEmail("problem_user");
		landingpage.enterPassword("secret_sauce");
		landingpage.clickLoginBtn();
		
		Products products = new Products(driver);
		products.clickAddToCartBtn();
		products.clickMyCrtBtn();
		
		CheckOut checkOut = new CheckOut(driver);
		checkOut.clickCheckOut();
		
		Information information = new Information(driver);
		information.enterfirstName("Abdl");
		information.enterLastName("GH");
		information.enterzipCode(30021);
		information.clickContinueBtn();
		
		VerifyErrMsg Err = new VerifyErrMsg(driver);
		String expectedErrMsg = "Error: Last Name is required";
		String actualErrMsg = Err.getErrMsg();
		Assert.assertEquals(actualErrMsg,expectedErrMsg );
		
	}

}
