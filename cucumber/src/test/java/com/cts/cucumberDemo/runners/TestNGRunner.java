package com.cts.cucumberDemo.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/features", glue="com.cts.cucumberDemo.steps")
public class TestNGRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider()
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
