package stepdefinition_2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountInfoStepDef {
	public static WebDriver driver;

	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/login");

	}
	
	@Given("user should give valid username and password")
    public void user_should_give_valid_username_and_password() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.username)).sendKeys("demo");
        wait.until(ExpectedConditions.visibilityOf(Repository_2.password)).sendKeys("1234");
    }

 

    @Given("user should click submit")
    public void user_should_click_submit() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.submit)).click();

 

    }

 

    @Then("user click the banking menu")
    public void user_click_the_banking_menu() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.banking)).click();

 

    }

 

    @Then("click the Member Account")
    public void click_the_member_account() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.memberAccount)).click();
    }

 

    @Then("check member account balance")
    public void check_member_account_balance() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String balance = wait.until(ExpectedConditions.visibilityOf(Repository_2.availabeBalance)).getText();
        System.out.println(balance);
    }

 

    @Then("click on notifications")
    public void click_on_notifications() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.notification)).click();
    }

 

    @Then("click anyone acount summary")
    public void click_anyone_acount_summary() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.recentTransaction)).click();
    }

 

    @Then("user should click print button")
    public void user_should_click_print_button() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.PrintButton)).click();
    }

 

    @Then("click on the Showfilter button")
    public void click_on_the_showfilter_button() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.showFilter)).click();
    }

 

    @Then("Select the pickfromyourcontactlist on book icon")
    public void select_the_pickfromyourcontactlist_on_book_icon() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.userTOSearch)).click();
    }

 

    @Then("user click anyone from the select a contact")
    public void user_click_anyone_from_the_select_a_contact() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.selectContact)).click();
    }

 

    @Then("click on the period menu")
    public void click_on_the_period_menu() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.periodDropDrown)).click();

 

    }

 

    @Then("Select any oneoption")
    public void select_any_oneoption() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.listOfPeriod)).click();
    }

 

    @Then("select the description enter the content")
    public void select_the_description_enter_the_content() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.description)).sendKeys("test");
    }

 

    @Then("click on the From amount Enter the amount")
    public void click_on_the_from_amount_enter_the_amount() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.enterToAmount)).sendKeys("100");
    }

 

    @Then("click the filter option")
    public void click_the_filter_option() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.filter)).click();

 

    }

 

    @Then("Select anyone Option")
    public void select_anyone_option() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.memberPayment)).click();
    }

 

    @Then("click the Direction option")
    public void click_the_direction_option() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.direction)).click();
    }

 

    @Then("Select anyone Option in direction")
    public void select_anyone_option_in_direction() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.outGoing)).click();
    }

 

    @Then("click the orderBy option")
    public void click_the_order_by_option() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.orderBy)).click();
    }

 

    @Then("Select anyone from orderby")
    public void select_anyone_from_orderby() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.listOfOrderBy)).click();
    }

 

    @When("click anyone from the Account Summary")
    public void click_anyone_from_the_account_summary() {
    	PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.paytouser)).click();
        wait.until(ExpectedConditions.visibilityOf(Repository_2.touser)).click();
        wait.until(ExpectedConditions.visibilityOf(Repository_2.usercontact)).click();
        wait.until(ExpectedConditions.visibilityOf(Repository_2.Amount)).sendKeys("1");
        wait.until(ExpectedConditions.visibilityOf(Repository_2.next)).click();
        wait.until(ExpectedConditions.visibilityOf(Repository_2.confirm)).click();


       }

 

    @Then("payment Details will be Appear to User")
    public void payment_details_will_be_appear_to_user() {
    	
    }

 

    @When("click anyone from  Account Summary")
    public void click_anyone_from_account_summary() {
    	PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.demothree)).click();
     }

 

    @Then("click on the print button in the transferDetails")
    public void click_on_the_print_button_in_the_transfer_details() {
        PageFactory.initElements(driver, Repository_2.class);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(Repository_2.PrintButton)).click();
    }



}
