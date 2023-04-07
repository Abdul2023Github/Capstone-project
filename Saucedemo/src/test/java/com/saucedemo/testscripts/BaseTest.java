package com.saucedemo.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
WebDriver driver;
	
	@BeforeClass
	public void buyProductTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14707\\eclipse-workspace\\Saucedemo\\resources\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}
	
	@AfterClass
	public void closeBrowser() {
		
	 driver.quit();
	}

}
