package StepDefinition;

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
import StepDefinition.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition_3_1 extends HelperClass {

	@Given("user should click the User to User Payment")
	public void user_should_click_the_User_to_User_Payment() {
		HelperClass.precondition();
		HelperClass.login();
		Repository.banking.click();
		Repository.payment_To_User.click();
	}

	@Given("user should fill the to user field")
	public void user_should_fill_the_to_user_field() {
		Repository.contact_List.click();
		Repository.car_Repair.click();
	}

	@Given("User Should Enter The Amount")
	public void user_should_enter_the_amount() {
		Repository.amount.sendKeys("10");
		Repository.description.click();
		Repository.description.sendKeys("Demo Payment");
	}

	@Given("User Should Select Scheduling")
	public void user_should_select_scheduling() {
		Repository.click_Scheduling.click();
		List<WebElement> list = Repository.listOfElements_InScheduling;
		HelperClass.selectFromList(list, "Pay now");	  
	}

	@Given("User Should Select\\(Scheduled) Scheduling {string}")
	public void user_should_select_scheduled_scheduling(String string) {
		Repository.click_Scheduling.click();
		List<WebElement> list = Repository.listOfElements_InScheduling;
		HelperClass.selectFromList(list, string);
		Repository.date.click();
		Repository.date.sendKeys("12");
		Repository.date.sendKeys("12");
		Repository.date.sendKeys("2023");
	}

	@Given("User Should Select\\(Monthly installments) Scheduling {string},{string}")
	public void user_should_select_monthly_installments_scheduling(String string, String string2) {
		Repository.click_Scheduling.click();
		List<WebElement> list = Repository.listOfElements_InScheduling;
		HelperClass.selectFromList(list, string);
		Repository.number_Of_Installments.click();
		Repository.number_Of_Installments.sendKeys(string2);
		
		
		//wait.until(ExpectedConditions.textToBePresentInElement(Payment_Repository.number_Of_Installments, string2));
		
	}
	@Given("User Should Select\\(Recurring payments) Scheduling {string},{string},{string}")
	public void user_should_select_recurring_payments_scheduling(String string, String string2, String string3) {
		Repository.click_Scheduling.click();
		List<WebElement> list = Repository.listOfElements_InScheduling;
		HelperClass.selectFromList(list, string);
	}
	@Then("User Should Click Next And Confirm The Payment For Monthly installments")
	public void user_should_click_next_and_confirm_the_payment_for_monthly_installments() {
		Repository.next_Bt.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Repository.confirm_Payment.click();
	}
	@Then("User Should Click Next And Confirm The Payment")
	public void user_should_click_next_and_confirm_the_payment(){
		Repository.next_Bt.click();
		Repository.confirm_Payment.click();
	}
	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
	}

}
