package runner;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;

 


@RunWith(Cucumber.class)

 

@io.cucumber.junit.CucumberOptions(

 

features="C:\\Users\\kmuthu\\eclipse-workspace\\Message\\src\\main\\resources\\featurefiles\\message3.feature",
 

glue= {"dataTables"}

 

)
public class runner {


 

}