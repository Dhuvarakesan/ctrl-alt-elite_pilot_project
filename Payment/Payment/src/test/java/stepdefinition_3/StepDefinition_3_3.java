package stepdefinition_3;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import repository.Payment_Repository_3;

public class StepDefinition_3_3 extends HelperClass{
	
	
	@Given("user should click the Payment Requests")
	public void user_should_click_the_payment_requests() throws InterruptedException, IOException {
		HelperClass.getDataFromExcel();
		HelperClass.precondition();
		HelperClass.login();
		Thread.sleep(3000);
		Payment_Repository_3.banking.click();
		Payment_Repository_3.payment_Requests.click();
	}
	@Given("User Should Click Send New Request")
	public void user_should_click_send_new_request() {
	    Payment_Repository_3.send_A_New_Request.click();
	}
	@Then("User Should Select Receiver")
	public void user_should_select_receiver() {
	    Payment_Repository_3.contact_List.click();
	    Payment_Repository_3.car_Repair.click();
	}
	@Then("User Should Enter The  Amount")
	public void user_should_enter_the_amount() {
	    Payment_Repository_3.amount_Request.click();
	    Payment_Repository_3.amount_Request.sendKeys("10");
	   
	   
	}
	@Then("User Should Enter The Expiration Date")
	public void user_should_enter_the_expiration_date() {
		//wait.until(ExpectedConditions.textToBePresentInElement(Repository.amount_Request, "10"));
	    Payment_Repository_3.expiration_Date.click();
	    Payment_Repository_3.expiration_Date.sendKeys("11032028");
	   // Repository.description.click();
		//Repository.description.sendKeys("Demo Payment");
	}
	@Then("User Should click Confirm")
	public void user_should_click_confirm() {
	    wait.until(ExpectedConditions.elementToBeClickable(Payment_Repository_3.confirm_Request));
	    System.out.println("hello1");
		Payment_Repository_3.confirm_Request.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		org.junit.Assert.assertEquals(Payment_Repository_3.verify_Request_Payment.getText(),"The payment request was successfully sent");
		//System.out.println("hello2");
		//Repository.confirm_Request.click();
	}


}
