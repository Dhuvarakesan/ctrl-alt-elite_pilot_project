package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features="C:\\Users\\ssivakumar\\eclipse-workspace\\AccountInformation\\2_Features\\AccountInfo.feature",
glue={"stepdefinition_2"}
)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
