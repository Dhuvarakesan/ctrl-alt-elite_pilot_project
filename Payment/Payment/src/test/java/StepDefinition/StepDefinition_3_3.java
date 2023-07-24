package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition_3_3 {
	@Given("user should click the Payment Requests")
	public void user_should_click_the_payment_requests() {
		HelperClass.precondition();
		HelperClass.login();
		Repository.banking.click();
		Repository.payment_Requests.click();
	}
	@Given("User Should Click Send New Request")
	public void user_should_click_send_new_request() {
	    Repository.send_A_New_Request.click();
	}
	@Then("User Should Select Receiver")
	public void user_should_select_receiver() {
	    Repository.contact_List.click();
	    Repository.car_Repair.click();
	}
	@Then("User Should Enter The  Amount")
	public void user_should_enter_the_amount() {
	    Repository.amount_Request.click();
	    Repository.amount_Request.sendKeys("10");
	    Repository.description.click();
		Repository.description.sendKeys("Demo Payment");
	}
	@Then("User Should Enter The Expiration Date")
	public void user_should_enter_the_expiration_date() {
	    Repository.expiration_Date.click();
	    Repository.expiration_Date.sendKeys("11032028");
	}


}
