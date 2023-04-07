package com.saucedemo.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//assignment_five.feature",
		glue     = "com.saucedemo.testscripts"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}

   
