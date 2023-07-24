package dataTables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

 


 

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class stepdefinitionmessage3 {
	WebDriver driver;
    @Before
    public void congif() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
       
        PageFactory.initElements(driver,Messagerepo_4_1.class);
        PageFactory.initElements(driver,Messages_And_Market_Repo_4_1.class);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        

        
    }
	

@Given("open the website {string}")
public void open_the_website(String string) {
	driver.get("https://demo.cyclos.org/ui/login");
}

@When("pressing login")
public void pressing_login() {
	Messages_And_Market_Repo_4_1.logincyclos.click();

}

@When("credentials of login is username {string} and password {string}")
public void credentials_of_login_is_username_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press submit")
public void press_submit() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press messages")
public void press_messages() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press inbox")
public void press_inbox() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press appropriate input from dropdown")
public void press_appropriate_input_from_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In keyword type'Inbox mail history'")
public void in_keyword_type_inbox_mail_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In user type {string}")
public void in_user_type(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press inbox history")
public void press_inbox_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press sent")
public void press_sent() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In sent to dropdown box press user")
public void in_sent_to_dropdown_box_press_user() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In keyword type'Greetings'")
public void in_keyword_type_greetings() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In user click {string}")
public void in_user_click(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Click the sent message history")
public void click_the_sent_message_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("press trash")
public void press_trash() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In sent to dropdown box press Administration")
public void in_sent_to_dropdown_box_press_administration() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("In keyword type'banking'")
public void in_keyword_type_banking() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click the trash message history")
public void click_the_trash_message_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
