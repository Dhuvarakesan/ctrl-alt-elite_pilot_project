package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GiftVoucherStepDefinition_7_1 {
	public static WebDriver driver;

	@Before
	public void config() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://demo.cyclos.org/ui/login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=\"User\"]")));
		driver.findElement(By.cssSelector("input[placeholder=\"User\"]")).sendKeys("demo");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")).click();
		PageFactory.initElements(driver, Repository.class);
	}

	@Given("User should click on the marketplace")
	public void user_should_click_on_the_marketplace() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.marketPlace));
		Repository.marketPlace.click();
	}
	@And("User should click on the my voucher field")
	public void user_should_click_on_the_my_voucher_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository.voucher));
		Repository.voucher.click();
	}
	@Given("Select a voucher from the list")
	public void select_a_voucher_from_the_list() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.tableCol1));
		Repository.tableCol1.click();
	}

	@Then("Click on the print icon")
	public void click_on_the_print_icon() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository.print));
		Repository.print.click();
	}

	@Given("Click the Buy and email icon")
	public void click_the_buy_and_email_icon() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository.buyEmail));
		Repository.buyEmail.click();
	}

	@When("Vouchers are displayed select one")
	public void vouchers_are_displayed_select_one() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository.email));
		Repository.email.click();
	}

	@When("Select the email and send the email id")
	public void select_the_email_and_send_the_email_id() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository.emailText));
		Repository.emailText.sendKeys("murugan@expleo.com");
	}

	@When("Select the amount and send the valid amount value")
	public void select_the_amount_and_send_the_valid_amount_value() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository.amount));
		Repository.amount.sendKeys("10.00");
	}

	@Then("Click the next button")
	public void click_the_next_button() {
		Repository.next.click();
	}
}
