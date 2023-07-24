package com.Step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_definition {

	public static WebDriver driver;



	@Given("User must click on edit button")

	public void user_must_click_on_edit_button() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.cyclos.org/ui/login");
		 PageFactory.initElements( driver,UserfuncRepo.class);
	      UserfuncRepo.username.sendKeys("Arunsir");
	}

	@Given("click on email text field")
	
	public void click_on_email_text_field() {
		 PageFactory.initElements( driver,UserfuncRepo.class);
		UserfuncRepo.password.sendKeys("Arun");
		
	}

	@When("enter valid email in text field")

	public void enter_valid_email_in_text_field() {
		 PageFactory.initElements( driver,UserfuncRepo.class);
		 UserfuncRepo.Submit.click();

	}

	@Then("click on name field in address")

	public void click_on_name_field_in_address() {
		 PageFactory.initElements( driver,UserfuncRepo.class);
		 UserfuncRepo.edit.

	}

	@Then("enter correct name in name field")

	public void enter_correct_name_in_name_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@When("User click on city field")

	public void user_click_on_city_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@When("enter the cityname")

	public void enter_the_cityname() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("click on save button")

	public void click_on_save_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}



	@Given("User should click on edit button")

	public void user_should_click_on_edit_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Given("click on Add address button")

	public void click_on_add_address_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("click on name text field")

	public void click_on_name_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("enter the valid name")

	public void enter_the_valid_name() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("click on Address line1 text field")

	public void click_on_address_line1_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("enter the valid Address line1")

	public void enter_the_valid_address_line1() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on city text field")

	public void click_on_city_text_field() {
		
		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("enter the valid city")

	public void enter_the_valid_city() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on Zipcode text field")

	public void click_on_zipcode_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("enter the valid Zipcode")

	public void enter_the_valid_zipcode() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("click on the save button")

	public void click_on_the_save_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}



	@Given("User click on edit button")

	public void user_click_on_edit_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Given("click on Add mobiles button")

	public void click_on_add_mobiles_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@When("click the mobile phone name text field")

	public void click_the_mobile_phone_name_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@When("Enter the valid mobile phone name")

	public void enter_the_valid_mobile_phone_name() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@When("click the valid mobile phone number text field")

	public void click_the_valid_mobile_phone_number_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@When("Enter the valid mobile phone number")

	public void enter_the_valid_mobile_phone_number() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("click on Add Mobile phones button")

	public void click_on_add_mobile_phones_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Given("Click on Profile button")

	public void click_on_profile_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Given("Click on password button")

	public void click_on_password_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("click on Change button")

	public void click_on_change_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on Old password text field")

	public void click_on_old_password_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("enter the valid password in password text field")

	public void enter_the_valid_password_in_password_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on new password text field")

	public void click_on_new_password_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("enter the new valid password in new password text field")

	public void enter_the_new_valid_password_in_new_password_text_field() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on Submit button")

	public void click_on_submit_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}


	@Given("Click on the Profile button")

	public void click_on_the_profile_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on notification button")

	public void click_on_notification_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on unread checkbox")

	public void click_on_unread_checkbox() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	

	@Given("Click on profile button")

	public void click_on_profile_button1() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on contacts button")

	public void click_on_contacts_button() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

	@Then("Click on first profile in list view")

	public void click_on_first_profile_in_list_view() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}

}
