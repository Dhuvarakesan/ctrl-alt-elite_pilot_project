package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(
features="C:\\Users\\kmuthu\\eclipse-workspace\\Marketplace_6_1_6_5\\src\\test\\resources\\features\\Marketplace6.1_6.5.feature",
//feature file path
glue={"Stepdefinitions6_1_6_5"},
plugin="html:target/CucumberReports/CucumberReport.html",
monochrome=true
)

public class Runner6 extends AbstractTestNGCucumberTests{


}