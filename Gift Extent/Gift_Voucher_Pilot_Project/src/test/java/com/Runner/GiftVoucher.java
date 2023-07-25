package com.Runner;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import com.StepDefinition_7.HelperClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"C:\\Users\\mkanakkanadar\\eclipse-workspace\\Gift_Voucher_Pilot_Project\\src\\main\\resources\\7_Features\\Gift.feature"},
		glue = {"com.StepDefinition_7"},
		dryRun = false,
		monochrome = true,
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		)
public class GiftVoucher extends AbstractTestNGCucumberTests {
	@BeforeMethod
	public void all() throws InterruptedException, IOException
	{
		HelperClass.config();
	}
}
