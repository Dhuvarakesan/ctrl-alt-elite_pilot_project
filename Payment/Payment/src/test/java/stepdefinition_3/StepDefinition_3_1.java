package stepdefinition_3;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import repository.Payment_Repository_3;
import stepdefinition_3.HelperClass;

public class StepDefinition_3_1 extends HelperClass {

	@Given("user should click the User to User Payment")
	public void user_should_click_the_User_to_User_Payment() throws InterruptedException {
		HelperClass.precondition();
		HelperClass.login();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(Repository.banking));;
		Payment_Repository_3.banking.click();
		//wait.until(ExpectedConditions.visibilityOf(Repository.payment_To_User));
		Payment_Repository_3.payment_To_User.click();
	}

	@Given("user should fill the to user field")
	public void user_should_fill_the_to_user_field() {
		Payment_Repository_3.contact_List.click();
		Payment_Repository_3.car_Repair.click();
	}

	@Given("User Should Enter The Amount")
	public void user_should_enter_the_amount() {
		Payment_Repository_3.amount.sendKeys("10");
		Payment_Repository_3.description.click();
		Payment_Repository_3.description.sendKeys("Demo Payment");
	}

	@Given("User Should Select Scheduling")
	public void user_should_select_scheduling() {
		Payment_Repository_3.click_Scheduling.click();
		List<WebElement> list = Payment_Repository_3.listOfElements_InScheduling;
		HelperClass.selectFromList(list, "Pay now");	  
	}

	@Given("User Should Select\\(Scheduled) Scheduling {string}")
	public void user_should_select_scheduled_scheduling(String string) {
		Payment_Repository_3.click_Scheduling.click();
		List<WebElement> list = Payment_Repository_3.listOfElements_InScheduling;
		HelperClass.selectFromList(list, string);
		Payment_Repository_3.date.click();
		Payment_Repository_3.date.sendKeys("12");
		Payment_Repository_3.date.sendKeys("12");
		Payment_Repository_3.date.sendKeys("2023");
	}

	@Given("User Should Select\\(Monthly installments) Scheduling {string},{string}")
	public void user_should_select_monthly_installments_scheduling(String string, String string2) {
		Payment_Repository_3.click_Scheduling.click();
		List<WebElement> list = Payment_Repository_3.listOfElements_InScheduling;
		HelperClass.selectFromList(list, string);
		Payment_Repository_3.number_Of_Installments.click();
		Payment_Repository_3.number_Of_Installments.sendKeys(string2);
		
		
		//wait.until(ExpectedConditions.textToBePresentInElement(Payment_Repository.number_Of_Installments, string2));
		
	}
	@Given("User Should Select\\(Recurring payments) Scheduling {string},{string},{string}")
	public void user_should_select_recurring_payments_scheduling(String string, String string2, String string3) {
		Payment_Repository_3.click_Scheduling.click();
		List<WebElement> list = Payment_Repository_3.listOfElements_InScheduling;
		HelperClass.selectFromList(list, string);
	}
	@Then("User Should Click Next And Confirm The Payment For Monthly installments")
	public void user_should_click_next_and_confirm_the_payment_for_monthly_installments() {
		Payment_Repository_3.next_Bt.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Payment_Repository_3.confirm_Payment.click();
	}
	@Then("User Should Click Next And Confirm The Payment")
	public void user_should_click_next_and_confirm_the_payment(){
		Payment_Repository_3.next_Bt.click();
		Payment_Repository_3.confirm_Payment.click();
	}
	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
	}

}
