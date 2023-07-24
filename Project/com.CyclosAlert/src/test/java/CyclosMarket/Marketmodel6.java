package CyclosMarket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Marketmodel6 {
	@FindBy (xpath="//*[@placeholder='User']")//enter username
    public static WebElement username;

    @FindBy (xpath="//*[@type='password']")//enter password
    public static WebElement password;

    @FindBy (xpath="//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")//enter submit
    public static WebElement submit;
    
   	@FindBy(xpath="//div[text()='Marketplace']")
   	public static WebElement Marketplace;
   	
	@FindBy(xpath="//div[text()='My advertisements']")
	public static WebElement Myadvertisements;
	
	@FindBy(xpath="//div[text()='Add new']")
	public static WebElement addnew;
	
	@FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	public static WebElement name;
	
	@FindBy(xpath="(//button[contains(@class,'form-control text-left')])[1]")
	public static WebElement category;
	
	@FindBy(linkText="Activities")
	public static WebElement Activites;
	
	@FindBy(xpath="//*[@id='id_95_editor']")
	public static WebElement text ;
	
	
	@FindBy(xpath="(//button[contains(@class,'btn d-flex')])[3]")
	public static WebElement save ;
	
	@FindBy(id="id_6")
	public static WebElement Publicationdate ;
	
	@FindBy(id="id_7")
	public static WebElement Publicationdate1 ;
	
	
	@FindBy(xpath="//div[text()='No options selected']")
	public static WebElement showmap;
	
	@FindBy(xpath="//div[text()='Advertisements']")
	public static WebElement Advertisements;
	
	@FindBy(xpath="//div[@class='heading-actions-plain-buttons']//button[1]")
	public static WebElement showlessfilter;
	
	@FindBy(linkText="Food")
	public static WebElement food;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	public static WebElement favorite;
	
	@FindBy(id="id_92")
	public static WebElement minprice;
	
	@FindBy(id="id_93")
	public static WebElement maxprice;
	
	@FindBy(xpath="(//div[contains(@class,'page-content-body card-body')])[3]")
	public static WebElement showadv ;
	
	@FindBy(linkText="Last published")
	public static WebElement orderby;
	
	@FindBy(xpath="//div[text()=' Volunteer at iFarm Norfolk, UK ']")
	public static WebElement select;
	
	@FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	public static WebElement keywords;
	
	@FindBy(xpath="//a[contains(text(),'Community')]")
	public static WebElement community;

	@FindBy(xpath="//div[text()=' Volunteer at iFarm Norfolk, UK ']")
	public static WebElement advcommunity;
	
	@FindBy(linkText="Activities")
	public static WebElement  activityfield;
	
	@FindBy(xpath="(//div[@class='avatar-container full-size'])[2]")
	public static WebElement advactivity;
}
