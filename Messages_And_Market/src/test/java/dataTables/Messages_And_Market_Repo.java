package dataTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Messages_And_Market_Repo {
	@FindBy(xpath ="//a[@id='messages-link']")
	public static WebElement Clickingmessagebar;
	
	@FindBy(xpath ="//label[@for='id_5_inbox']")
	public static WebElement inboxbutton;
	
	@FindBy(xpath ="//label[@for='id_5_sent']")
	public static WebElement sentbutton;
	
	@FindBy(xpath ="//label[@for='id_5_trash']")
	public static WebElement trashbutton;
	
	@FindBy(xpath ="//button[@aria-controls='dropdown-menu-id_3']")
	public static WebElement frombutton;
	
	@FindBy(xpath ="//button[@id='id_3']")
	public static WebElement Senttobutton;
	
	@FindBy(xpath ="//button[@title='All']")
	public static WebElement From_senttobutton;
	
	@FindBy(xpath ="//input[@id='id_6']")
	public static WebElement Keywordbuttton;
	
	@FindBy(xpath ="//button[@class='btn btn-icon ml-2']")
	public static WebElement Pickfromyourcontactlist ;
	
	@FindBy(xpath ="//input[@class='form-control ng-pristine ng-valid ng-touched']")
	public static WebElement Usersearching;
	
	@FindBy(xpath ="//div[text()='New message']")
	public static WebElement NewmessageButton;
	
	@FindBy(xpath ="//button[@id='id_6_bold']/icon[1]")
	public static WebElement bold;
	
	@FindBy(xpath ="//button[@id='id_15']")
	public static WebElement sentto;
	
	@FindBy(xpath ="//input[@id='id_16']")
	public static WebElement subject;
	
	@FindBy(xpath ="//div[@class='editor']")
	public static WebElement wherewillwetypemessage;
	
	@FindBy(xpath ="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	public static WebElement send;
	
	
	
	
	
	
	
	
	
	
}
