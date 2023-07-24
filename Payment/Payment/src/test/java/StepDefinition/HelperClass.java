package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import StepDefinition.StepDefinition_3_1;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void precondition() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver,Repository.class);
		
		}
	public static void login() {
		//PageFactory.initElements(driver,Payment_Repository.class);
		driver.get("https://demo.cyclos.org/ui/login");
		Repository.username.sendKeys("demo");
		Repository.username.sendKeys(Keys.ENTER);
		Repository.password.sendKeys("1234");
		Repository.submit_Bt.click();
	} 
	public static void selectFromList(List<WebElement> list,String text) {
		//System.out.println("Size:"+list.size());
		for(WebElement i:list) {
	    	if(i.getText().equals(text)) {
	    		i.click();
	    		break;
	    	}
	    }
	}
		
	
	public static WebDriver getDriver() {
		return driver;
	}
}
