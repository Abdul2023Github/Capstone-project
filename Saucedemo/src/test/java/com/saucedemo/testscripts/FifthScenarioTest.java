package com.saucedemo.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.CheckOut;
import com.saucedemo.pages.FifthSccsMsg;
import com.saucedemo.pages.Finish;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Products;

public class FifthScenarioTest extends BaseTest{
	
	@Test
	public void FifthscenarioTest(){
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterEmail("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLoginBtn();
		
		Products products = new Products(driver);
		products.clickAddToCartBtn();
		products.clickThirdprdctBtn();
		products.clickRemoveFirstPrdctBtn();
		products.clickMyCrtBtn();
		
		CheckOut checkOut = new CheckOut(driver);
		String expectedText = "Your Cart";
		String actualText = checkOut.verifyText();
		Assert.assertEquals(actualText, expectedText);
		checkOut.clickContinueShopingBtn();
		
		Select dropDownBtn = new Select(
		driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]")));
		dropDownBtn.selectByVisibleText("Price (high to low)");
		
		products.clcikHighPricePrdctBtn();
		products.clickMyCrtBtn();
		
		WebElement itemCountElement = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
		String itemCountText = itemCountElement.getText();
		int itemCount = Integer.parseInt(itemCountText);
		if (itemCount == 2) {
			System.out.println("Cart contains 2 items");
		}
		else {
			System.out.println("Unexpected number of items in cart:" +itemCount);
		}
		
		checkOut.clickCheckOut();
		Information information = new Information(driver);
		information.enterfirstName("Abdl");
		information.enterLastName("GH");
		information.enterzipCode(30021);
		information.clickContinueBtn();
		
		Finish finish = new Finish(driver);
		finish.clickFinishBtn();
		
		FifthSccsMsg sccsMsg = new FifthSccsMsg(driver);
		String expectedSccsMsgTxt = "Thank you for your order!";
		String actualSccsMsgTxt = sccsMsg.sccsMsgTxt();
		Assert.assertEquals(actualSccsMsgTxt, expectedSccsMsgTxt);
		
		
		}
	
	}


