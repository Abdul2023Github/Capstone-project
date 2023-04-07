package com.saucedemo.testscripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.CheckOut;
import com.saucedemo.pages.Finish;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Products;
import com.saucedemo.pages.VerifysccsMsg;

public class BuyProductTest extends BaseTest{
	
	

	@Test
	public void buyProduct() {
		
		//	Enter the username – ‘standard_user’ , password ‘secret_sauce’ and then click on Login button. 

		LandingPage landingPage = new LandingPage (driver);
		landingPage.enterEmail("standard_user");
		
		landingPage.enterPassword("secret_sauce");
		
		landingPage.clickLoginBtn();
		
	//	You will see a list of products. Add the first 2 products to the cart. 
		Products products = new Products(driver);
		products.clickAddToCartBtn();
		products.clickscndCrtBtn();
		
   //	Click on the cart icon at top right corner. 
		products.clickMyCrtBtn();
		
	//	Click on ‘Checkout’ button. 
		CheckOut checkOut = new CheckOut(driver);
		checkOut.clickCheckOut();
		
	//	Enter your first name in ‘First Name’ textbox. 
		Information information = new Information(driver);
		information.enterfirstName("Abdl");
				
	//	Enter your last name in ‘Last Name’ textbox.
		information.enterLastName("Gh");
		
	//	Enter Postal Code in ‘Postal Code’ textbox. 
		information.enterzipCode(30021);
		
	//	Click on ‘Continue’ button. 
		information.clickContinueBtn();
		
	//	Click on ‘Finish’ button on the next page.
		Finish finish = new Finish(driver);
		finish.clickFinishBtn();
		
	//	Verify the success message – ‘Your order has been dispatched, and will arrive just as fast as the 
	//	pony can get there!’ is displayed. 
		VerifysccsMsg v = new VerifysccsMsg(driver);
		
		String expectedsccsMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualVerifysccsMsg = v.getsccsMsg();
		Assert.assertEquals(actualVerifysccsMsg,expectedsccsMsg );
	}
		
	//	Close the browser. 
		

	}
	
	
	
	
	
	
