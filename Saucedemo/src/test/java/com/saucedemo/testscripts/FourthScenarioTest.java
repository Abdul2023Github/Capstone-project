package com.saucedemo.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.CheckOut;
import com.saucedemo.pages.Finish;
import com.saucedemo.pages.FourthSccsMsg;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Products;

public class FourthScenarioTest extends BaseTest {

	@Test
	public void ForthScenarioTest() {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterEmail("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLoginBtn();

		Select dropDownBtn = new Select(
				driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]")));
		dropDownBtn.selectByVisibleText("Price (low to high)");

		Products products = new Products(driver);
		products.clickLowPricePrdctBtn();
		products.clickMyCrtBtn();

		WebElement confirmationMsg = driver.findElement(By.id("item_2_title_link"));
		String confirmationText = confirmationMsg.getText();
		if (confirmationText.contains("Sauce Labs Onesie")) {
			System.out.println("Item is the same as we selected");
		}
		else
		{System.out.println("Item is not the slected one");
		}

		CheckOut checkOut = new CheckOut(driver);
		checkOut.clickCheckOut();

		Information information = new Information(driver);
		information.enterfirstName("Abdl");
		information.enterLastName("GH");
		information.enterzipCode(30021);
		information.clickContinueBtn();

		Finish finish = new Finish(driver);
		finish.clickFinishBtn();

		FourthSccsMsg FsccsMsg = new FourthSccsMsg(driver);

		String expectedForthSccsMsg = "Thank you for your order!";
		String actualFourthSccsMsg = FsccsMsg.fourthSccsMsg();
		Assert.assertEquals(actualFourthSccsMsg, expectedForthSccsMsg);

	}

}
