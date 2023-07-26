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


public class Stepdefinitionsmessages_3_1{
	WebDriver driver;
    @Before
    public void congif() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.cyclos.org/ui/login");
       
        PageFactory.initElements(driver,Messagerepo_4_1.class);
        PageFactory.initElements(driver,Messages_And_Market_Repo_4_1.class);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        

        
    }
	    
	@Given("Inside the messaging page")
	public void inside_the_messaging_page()  {	
		Messages_And_Market_Repo_4_1.username.sendKeys("demo");
		Messages_And_Market_Repo_4_1.password.sendKeys("1234");
		Messages_And_Market_Repo_4_1.submit.click();
	}

	@When("Clicking the {string} button")
	public void clicking_the_button(String string) {
		Messages_And_Market_Repo_4_1.Clickingmessagebar.click();
		Messages_And_Market_Repo_4_1.NewmessageButton.click();
		
	}

	@When("From the contact list selecting the correct user")
	public void from_the_contact_list_selecting_the_correct_user() {
		Messagerepo_4_1.sendto.click();
		Messagerepo_4_1.user.click();
	
	}

	@When("click the subject {string}")
	public void click_the_subject(String string) {
		  Messagerepo_4_1.contact.click();

		  Messagerepo_4_1.element.click();
	}

	@When("Select {string} font")
	public void select_font(String string) throws InterruptedException {
		Thread.sleep(3000);
		Messagerepo_4_1.subject.click();
		Messagerepo_4_1.subject.sendKeys("sending mail");   
	}

	@When("Apply Bold style to the message")
	public void apply_bold_style_to_the_message() {
		Messages_And_Market_Repo_4_1.bold.click();
		
	}

	
	@When("I enter the following rich text message content:")
	public void i_enter_the_following_rich_text_message_content(String docString) throws InterruptedException {
		Thread.sleep(3000);
		Messagerepo_4_1.content.sendKeys("Sometimes i wonder why i am alive");
	}

	@When("click the {string} button")
	public void click_the_button(String string) {
		Messagerepo_4_1.send.click();
	   
	}

	@Then("the message should be sent successfully")
	public void the_message_should_be_sent_successfully() {
		System.out.println("something is going on");
	    
	}
    


}
