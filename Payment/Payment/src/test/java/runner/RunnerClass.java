package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\dmani\\eclipse-workspace\\Payment\\Payment\\src\\test\\resources\\Features\\3.1User_to_User_Payment.feature",
glue={"StepDefinition"}	,
tags="@Test1"
)
public class RunnerClass {

}
