package com.Runner;



import java.io.IOException;

import org.testng.annotations.BeforeMethod;


import com.StepDefinition_6_6.HelperClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"C:\\Users\\mkanakkanadar\\eclipse-workspace\\Pilot_Project\\src\\main\\resources\\6.6_FeatureFiles\\6.6MarketPlace.feature"},
		glue = {"com.StepDefinition_6_6"},
		dryRun = false,
		monochrome = true,
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		)
public class MarketPlace extends AbstractTestNGCucumberTests{
	@BeforeMethod
	public static void all() throws IOException
	{
		HelperClass.driverLaunch();
	}
}
