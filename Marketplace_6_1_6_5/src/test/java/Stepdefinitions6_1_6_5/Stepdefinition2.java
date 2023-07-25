package Stepdefinitions6_1_6_5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Stepdefinition2 {
	WebDriver driver;
    @Before
    public void congif() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.cyclos.org/ui/login");
        PageFactory.initElements(driver,Repo_61_65.class);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Repo_61_65.username.sendKeys("Arunsir");
        Repo_61_65.password.sendKeys("Arun");
        Repo_61_65.submit.click();
        

}
    
    @Given("Press the advertisment")
    public void press_the_advertisment() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.Marketplace.click();
    }

    @Given("Press the files")
    public void press_the_files() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.Myadvertisements.click();
    	Thread.sleep(3000);
    	Repo_61_65.addnew.click();
     
    }

    @When("Press new button and create a new advertisement")
    public void press_new_button_and_create_a_new_advertisement() {
    	Repo_61_65.name.sendKeys("varun");
    	
    }

    @When("add the name")
    public void add_the_name() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.category.click();
    	Thread.sleep(3000);
    	Repo_61_65.Activites.click(); 
    }

    @When("Press category")
    public void press_category() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,450)", "");
    	Thread.sleep(3000);
    	Repo_61_65.text.click();
    	Thread.sleep(3000);
    	Repo_61_65.text.sendKeys("fail");
    }

    @When("go to description type something")
    public void go_to_description_type_something() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.save.click();
    	
    }

    @Then("press save")
    public void press_save() {
    	System.out.println("saveisworking");
    }

    @Given("Press the filters button")
    public void press_the_filters_button() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.Marketplace.click();
    	Thread.sleep(3000);
    	
    	Repo_61_65.Advertisements.click();
    	Thread.sleep(3000);
    	Repo_61_65.showlessfilter.click();
    }

    @When("Press the text Food in keyword")
    public void press_the_text_food_in_keyword() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.keywords.sendKeys("butterscotchmadesh");

    }

    @When("Press the favorites radio button")
    public void press_the_favorites_radio_button() throws InterruptedException {
    	Thread.sleep(3000);
    	Repo_61_65.favorite.click();  
    	}
}
