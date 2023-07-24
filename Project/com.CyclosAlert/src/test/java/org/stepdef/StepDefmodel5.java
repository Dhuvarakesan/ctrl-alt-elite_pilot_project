package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cyclosAlert.AlertsCyclos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefmodel5 {
	public static WebDriver driver;
	
	@Given("Launch the cyclos application")
	public void launch_the_cyclos_application() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/dashboard");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-valid')])[1]")).sendKeys("demo");
		driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-valid')])[2]")).sendKeys("1234");
		driver.findElement(By.id("//button[contains(@class,'btn d-flex')]")).click();
		PageFactory.initElements(driver,AlertsCyclos.class);
	}

	@When("click on the marketplace")
	//wait.until(ExpectedConditions.visibilityOf(AlertsCyclos.marketplace));
	public void click_on_the_marketplace() {
		AlertsCyclos.marketplace.click();
		
	}

	@When("click on the Advertisements")
	public void click_on_the_advertisements() {
		AlertsCyclos.Advertisements.click();
	}

	@When("click on the show  advertisements")
	public void click_on_the_show_advertisements() {
		AlertsCyclos.Showadvertisements.click();
	}

	@When("click on the donuts")
	public void click_on_the_donuts() {
		AlertsCyclos.donuts.click();
	}

	@When("click on the Ask a Question")
	public void click_on_the_ask_a_question() {
		AlertsCyclos.question.click();
	}

	@When("Post the question the alert box")
	public void post_the_question_the_alert_box() {
		AlertsCyclos.textarea.sendKeys("price");	
		AlertsCyclos.submit.click();
	}

	@Then("Displays the question in the post box")
	public void displays_the_question_in_the_post_box() {
		AlertsCyclos.Alert.getText();
	}
}
