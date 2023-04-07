package com.saucedemo.testscripts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.saucedemo.pages.*;

public class Driver extends Tools {
	//protected static WebDriver driver;
	protected static LandingPage landingPage;
	protected static Products products;
	protected static Checkout checkout;
	protected static Information information;
	protected static Finish finish;
	protected static VerifySccsMsg verifySccsMsg;
	protected static VerifyErrMsg verifyErrMsg;
	protected static FourthSccsMsg fsccsMsg;
	protected static FifthSccsMsg SccsMsg;
	
	
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14707\\eclipse-workspace\\Saucedemo\\resources\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		landingPage = new LandingPage(driver);
		products = new Products(driver);
		checkout    = new Checkout(driver);
		information = new Information (driver);
		finish   = new Finish(driver);
		verifySccsMsg = new VerifySccsMsg(driver);
		verifyErrMsg = new VerifyErrMsg(driver);
		fsccsMsg = new FourthSccsMsg(driver);
		SccsMsg = new FifthSccsMsg(driver);
				
		
	}

}
