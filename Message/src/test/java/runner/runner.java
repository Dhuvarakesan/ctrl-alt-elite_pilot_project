package runner;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;

 


@RunWith(Cucumber.class)

 

@io.cucumber.junit.CucumberOptions(

 

features="C:\\Users\\kmuthu\\eclipse-workspace\\Message\\src\\main\\resources\\4_features\\4.1 rich_text_message1.feature",
 

glue= {"dataTables"},
monochrome=true,
dryRun=true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\",\"pretty",

		 

"html:target/cucumber-reports/cucumberreport.html"}
)

 


public class runner {


 

}