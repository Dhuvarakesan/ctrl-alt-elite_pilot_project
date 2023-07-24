package com.StepDefinition;




import java.awt.Window;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.error.Mark;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;




public class MarketPlaceStepDefinition_6_6 {
	public WebDriver driver;

	@Before
	public void config() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://demo.cyclos.org/ui/login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=\"User\"]")));
		driver.findElement(By.cssSelector("input[placeholder=\"User\"]")).sendKeys("demo");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Marketplace']")));
		driver.findElement(By.xpath("//*[text()='Marketplace']")).click();
		PageFactory.initElements(driver, Repository.class);
	}

	@And("Click on show advertisements")
	public void click_on_show_advertisements() throws InterruptedException  {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.advertisement));
		Repository.advertisement.click();
	}



	@Given("I want to navigate to the advertisements")
	public void i_want_to_navigate_to_the_advertisements() {
		System.out.println("inside advertisement");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.showAdvertisement));
		Repository.showAdvertisement.click();
	}


	@Then("OrderBy dropdown enabled click on last published")
	public void order_by_dropdown_enabled_click_on_last_published() {
		Repository.orderBy.click();
		Repository.lastPublished.click();
	}



	@Given("I want to click on the keywords search field")
	public void i_want_to_click_on_the_keywords_search_field() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.keyWords));
		Repository.keyWords.sendKeys("Fruit");
	}

	@Given("Click the enter")
	public void click_the_enter() {
		 Repository.keyWords.sendKeys(Keys.ENTER);
	}
	
	@Given("I want to click on the community field")
	public void i_want_to_click_on_the_community_field() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.community));
	     Repository.community.click();
	}
	
	@Then("Community related Advertisements will appear")
	public void community_related_advertisements_will_appear() {
	    	 System.out.println("Community related advertisement shown");
	}

	@Given("I want to select category in community field")
	public void i_want_to_select_category_in_community_field() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.community));
	    Repository.category.click();
	}

	@Then("Select which activity user want")
	public void select_which_activity_user_want() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.item));
	     Repository.item.click();
	}



}