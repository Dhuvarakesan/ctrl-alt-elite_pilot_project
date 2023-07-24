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


public class stepdefinitionsmessages{
	WebDriver driver;
    @Before
    public void congif() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.cyclos.org/ui/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        PageFactory.initElements(driver,Messages_And_Market_Repo.class);
        Messages_And_Market_Repo.username.sendKeys("demo");
		Messages_And_Market_Repo.password.sendKeys("1234");
		Messages_And_Market_Repo.submit.click();

        
    }
	    
	@Given("Inside the messaging page")
	public void inside_the_messaging_page() {		
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicking the {string} button")
	public void clicking_the_button(String string) {
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("From the contact list selecting the correct user")
	public void from_the_contact_list_selecting_the_correct_user() {
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("click the subject {string}")
	public void click_the_subject(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select {string} font")
	public void select_font(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Apply Bold style to the message")
	public void apply_bold_style_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the following rich text message content:")
	public void i_enter_the_following_rich_text_message_content(String docString) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click the {string} button")
	public void click_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the message should be sent successfully")
	public void the_message_should_be_sent_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
    


}
