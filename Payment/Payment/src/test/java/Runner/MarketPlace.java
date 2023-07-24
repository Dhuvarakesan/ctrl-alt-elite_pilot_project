package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mkanakkanadar\\eclipse-workspace\\Pilot_Project\\src\\main\\resources\\FeatureFiles\\6.6MarketPlace.feature",
		glue = {"com.StepDefinition"}
		)
public class MarketPlace {

}
