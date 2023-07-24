package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mkanakkanadar\\eclipse-workspace\\Gift_Voucher_Pilot_Project\\src\\main\\resources\\Features\\Gift.feature",
		glue = {"com.StepDefinition"}
		)
public class GiftVoucher {

}
