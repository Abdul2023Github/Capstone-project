package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.VerifyErrMsg;

public class SecondScenarioTest extends BaseTest {

	@Test
	public void Scenario2() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterEmail("locked_out_user");

		landingPage.enterPassword("secret_sauce");
		landingPage.clickLoginBtn();
		
		VerifyErrMsg err = new VerifyErrMsg(driver);
		String expectedErrMsg = "Epic sadface: Sorry, this user has been locked out.";
		String actualErrMsg = err.getErrMsg();
		Assert.assertEquals(actualErrMsg,expectedErrMsg );
	}
}
