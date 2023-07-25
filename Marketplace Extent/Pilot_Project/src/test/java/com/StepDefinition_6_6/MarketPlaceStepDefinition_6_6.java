package com.StepDefinition_6_6;




import java.awt.Window;
import java.io.IOException;

 
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.error.Mark;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;




public class MarketPlaceStepDefinition_6_6 {
	
	 

	@And("Click on show advertisements")
	public void click_on_show_advertisements() throws InterruptedException  {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
        wait.until(ExpectedConditions.visibilityOf(Repository_6_6.marketPlace));
        Thread.sleep(4000);
        Repository_6_6.marketPlace.click();
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.advertisement)).click();
		 
	}



	@Given("I want to navigate to the advertisements")
	public void i_want_to_navigate_to_the_advertisements() {
		System.out.println("inside advertisement");
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.showAdvertisement)).click();
	 
	}


	@Then("OrderBy dropdown enabled click on last published")
	public void order_by_dropdown_enabled_click_on_last_published() {
		Repository_6_6.orderBy.click();
		Repository_6_6.lastPublished.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "last published");
	}



	@Given("I want to click on the keywords search field")
	public void i_want_to_click_on_the_keywords_search_field() throws IOException {
		HelperClass.excelCall();
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.keyWords)).click();
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.showAdvertisement));
		Repository_6_6.keyWords.sendKeys(HelperClass.category);
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Category browsing is passed");
		 
	}

	@Given("Click the enter")
	public void click_the_enter() {
		 Repository_6_6.keyWords.sendKeys(Keys.ENTER);
	}
	
	@Given("I want to click on the community field")
	public void i_want_to_click_on_the_community_field() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.community)).click();
	     
	}
	
	@Then("Community related Advertisements will appear")
	public void community_related_advertisements_will_appear() {
	    	 System.out.println("Community related advertisement shown");
	    	 ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Community related advertisements shown");
	}

	@Given("I want to select category in community field")
	public void i_want_to_select_category_in_community_field() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.community));
	    Repository_6_6.category.click();
	}

	@Then("Select which activity user want")
	public void select_which_activity_user_want() {
		WebDriverWait wait = new WebDriverWait(HelperClass.driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository_6_6.item)).click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "activity selected");
	     
	}



}