package com.StepDefinition_7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GiftVoucherStepDefinition_7_1 {
	 
	@Given("User should click on the marketplace")
	public void user_should_click_on_the_marketplace() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.marketPlace));
		Thread.sleep(3000);
		Repository_7.marketPlace.click();
	}
	@And("User should click on the my voucher field")
	public void user_should_click_on_the_my_voucher_field() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.voucher));
		Repository_7.voucher.click();
	}
	@Given("Select a voucher from the list")
	public void select_a_voucher_from_the_list() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.tableCol1));
		Repository_7.tableCol1.click();
	}

	@Then("Click on the print icon")
	public void click_on_the_print_icon() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.print));
		Repository_7.print.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Gift voucher printed");
	}

	@Given("Click the Buy and email icon")
	public void click_the_buy_and_email_icon() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.buyEmail));
		Repository_7.buyEmail.click();
	}

	@When("Vouchers are displayed select one")
	public void vouchers_are_displayed_select_one() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.email));
		Repository_7.email.click();
	}

	@When("Select the email and send the email id")
	public void select_the_email_and_send_the_email_id() throws IOException {
		HelperClass.excelData();
		WebDriverWait wait = new WebDriverWait(HelperClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.emailText));
		Repository_7.emailText.sendKeys(HelperClass.email);
	}

	@When("Select the amount and send the valid amount value")
	public void select_the_amount_and_send_the_valid_amount_value() throws IOException {
		HelperClass.excelData();
		WebDriverWait wait = new WebDriverWait(HelperClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.amount));
		Repository_7.amount.sendKeys(HelperClass.amount);
	}

	@Then("Click the next button")
	public void click_the_next_button() {
		Repository_7.next.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Voucher bought and printed");
	}
}
