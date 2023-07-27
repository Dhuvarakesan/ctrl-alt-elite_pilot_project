package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features="C:\\Users\\ssivakumar\\eclipse-workspace\\AccountInformation\\2_Features\\AccountInfo.feature",
glue={"stepdefinition_2"},
monochrome=true,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"},
dryRun=true
)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
