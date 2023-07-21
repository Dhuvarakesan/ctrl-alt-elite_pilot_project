package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MarketPlaceStepDefinition {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.get("https://demo.cyclos.org/ui/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder=\"User\"]")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Marketplace']")).click();
	}
	 
	public static WebDriver driver;
	 
	 
	@Given("Click on the advertisements")
	public void click_on_the_advertisements() throws InterruptedException {
		
          MarketPlaceRepository.advertisement.click();
	}
	
	@Given("lauch the repository")
	public void lauch_the_repository() throws InterruptedException {
		PageFactory.initElements(driver, MarketPlaceRepository.class);
		Thread.sleep(6000);
	}

	@Given("open the dashboard")
	public void open_the_dashboard() {

	}

	@Given("Click on show advertisements")
	public void click_on_show_advertisements() {
             MarketPlaceRepository.showAdvertisement.click();
	}

	@When("Select the order by dropdown")
	public void select_the_order_by_dropdown() {
            MarketPlaceRepository.orderBy.click();
	}

	@When("Select the user choice")
	public void select_the_user_choice() {
           MarketPlaceRepository.lastPublished.click();
	}

	@When("Click on the keywords search text fields")
	public void click_on_the_keywords_search_text_fields() {
               MarketPlaceRepository.keyWords.sendKeys("fruit");
	}

	@When("Click enter")
	public void click_enter() {
         MarketPlaceRepository.keyWords.sendKeys(Keys.ENTER);
	}

	@When("Click on the community")
	public void click_on_the_community() {
        MarketPlaceRepository.community.click();
	}

	@When("after click on the community field then click on the activity field")
	public void after_click_on_the_community_field_then_click_on_the_activity_field() {
         
	}

	@When("Click on which activity you want")
	public void click_on_which_activity_you_want() {
      
	}

}
