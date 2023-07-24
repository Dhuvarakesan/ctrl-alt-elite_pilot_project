package com.CyclosRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\A Likith\\Downloads\\Project\\com.CyclosAlert\\featurefiles\\model5feature.feature",
glue={"org.stepdef"})
public class Runner {
	
}
