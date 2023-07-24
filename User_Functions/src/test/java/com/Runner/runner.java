package com.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\prangaswamy\\Downloads\\eclipse-java-2022-12-R-win32-x86_64 (1)\\eclipse\\configuration\\User_Functions\\features\\tag1.feature",
        glue= {"com.Step_definition"}
        )
public class runner {

}
