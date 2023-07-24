package org.stepdefinition;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;

import CyclosMarket.Marketmodel6;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Marketplace {
	public static WebDriver driver;
	@Before
	public void config() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/login");
		Thread.sleep(3000);
		PageFactory.initElements(driver,Marketmodel6.class);
		Thread.sleep(3000);
		Marketmodel6.username.sendKeys("Praju");
		Marketmodel6.password.sendKeys("Praju@143$");
		Marketmodel6.submit.click();
	}
	@Given("click My Advertisement")
	public void click_my_advertisement() throws InterruptedException {
		
		Thread.sleep(3000);
		Marketmodel6.Marketplace.click();
		Thread.sleep(3000);
	    Marketmodel6.Myadvertisements.click();
	    Thread.sleep(3000);
	  
	}

	@When("click on add new button and create a new advertisement on top right corner")
	public void click_on_add_new_button_and_create_a_new_advertisement_on_top_right_corner() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExceptedConditons.visibilityOf(Marketmodel6.addnew));
		Thread.sleep(3000);
		Marketmodel6.addnew.click();
	}

	@When("I want to add the name")
	public void i_want_to_add_the_name() throws InterruptedException {
		Thread.sleep(3000);
		Marketmodel6.name.sendKeys("ravi");
	}

	@When("click on the  category")
	public void click_on_the_category() throws InterruptedException {
		Thread.sleep(3000);
		Marketmodel6.category.click();
		Thread.sleep(3000);
		Marketmodel6.Activites.click();
	}

	@When("scroll down to the description text area and enter a text")
	public void scroll_down_to_the_description_text_area_and_enter_a_text() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Marketmodel6.text.click();
		Thread.sleep(3000);
		Marketmodel6.text.sendKeys("donuts");
	}

	@Then("click save")
	public void click_save() throws InterruptedException {
		Thread.sleep(3000);
		Marketmodel6.save.click();
	}

	@Given("click the publication period1")
	public void click_the_publication_period1() {
		Marketmodel6.Publicationdate.click(); 
	}

	@Given("click on the  publication period2")
	public void click_on_the_publication_period2() {
		Marketmodel6.Publicationdate1.click();
	}

	@Given("choose the time this way we can schedule the release of the advertisement")
	public void choose_the_time_this_way_we_can_schedule_the_release_of_the_advertisement() {
		Marketmodel6.Publicationdate1.click();
	}

	@Given("I want to click on the showmap")
	public void i_want_to_click_on_the_showmap() {
		Marketmodel6.showmap.click();
	}

	@Given("click on the showmap")
	public void click_on_the_showmap() {
		Marketmodel6.Advertisements.click();
	}

	@Given("Click on the filters")
	public void click_on_the_filters() {
		Marketmodel6.showlessfilter.click();
	}

	@When("Enter the text Food in given keyword textbox")
	public void enter_the_text_food_in_given_keyword_textbox() {
		Marketmodel6.food.click();
	}

	@When("click radio button favorites")
	public void click_radio_button_favorites() {
		Marketmodel6.favorite.click();
	}

	@When("give minimum price")
	public void give_minimum_price() {
		Marketmodel6.minprice.sendKeys("120");;
	}

	@When("give maximum price")
	public void give_maximum_price() {
		Marketmodel6.maxprice.sendKeys("150");;
	}

	@Given("Click on Order By drowpdown")
	public void click_on_order_by_drowpdown() {
		Marketmodel6.orderby.click();
	}

	@Given("Select the user choice")
	public void select_the_user_choice() {
		Marketmodel6.select.click();
	}

	@Given("click on the keywords")
	public void click_on_the_keywords() {
		Marketmodel6.keywords.click();
	}

	@Given("click on the show advertisements")
	public void click_on_the_show_advertisements() {
		Marketmodel6.showadv.click();
	}

	@Given("click community")
	public void click_community() {
		Marketmodel6.community.click();
	}

	@Given("click Community related Advertisements will appear")
	public void click_community_related_advertisements_will_appear() {
		Marketmodel6.advcommunity.click();
	}

	@Given("click on the activites")
	public void click_on_the_activites() {
		Marketmodel6.activityfield.click();
	}

	@Then("Click on which activity you want.")
	public void click_on_which_activity_you_want() {
		Marketmodel6.advactivity.click();
	}
}
