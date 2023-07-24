package cyclosAlert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsCyclos {
		@FindBy(id="menu_marketplace")
		public static WebElement marketplace;
		
		@FindBy(xpath="//div[@class='nav-item-text' and text()='Advertisements']") 
		public static WebElement Advertisements;
		
		@FindBy(partialLinkText="Show advertisements")
		public static WebElement Showadvertisements;
		
		@FindBy(xpath="(//div[@class='avatar-container full-size'])[2]")
		public static WebElement donuts;
		
		@FindBy(xpath="//div[text()='Ask a question']")
		public static WebElement question;
		
		@FindBy(id="id_14")
		public static WebElement textarea;
		
		@FindBy(xpath="(//button[contains(@class,'btn d-flex')])[1]")
		public static WebElement submit ;
		
		@FindBy(xpath="(//span[@class='font-weight-bold'])[1]")
		public static WebElement Alert ;
}

