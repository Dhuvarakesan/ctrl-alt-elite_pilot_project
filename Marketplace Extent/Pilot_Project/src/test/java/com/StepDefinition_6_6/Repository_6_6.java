package com.StepDefinition_6_6;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class Repository_6_6   {
	public static WebDriver driver;
	//6.6 List new Advertisements
	//    public Repository(WebDriver driver)
	//    {
	//         this.driver = driver;
	//    PageFactory.initElements(driver, this);
	//    }

	@FindBy(css = "a#menu_marketplace")
	public static WebElement marketPlace;
	
	@FindBy(xpath = "//div[text()='Advertisements']")
	public static WebElement advertisement;

	@FindBy(xpath = "//*[text()='Show advertisements']")
	public static WebElement showAdvertisement;

	@FindBy(xpath = "//*[text()='Order by']")
	public static WebElement orderBy;

	@FindBy(xpath = "//a[text()=' Last published ']")
	public static WebElement lastPublished;





	//6.7 Category Browsing

	//click the advertisement WebElement

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement keyWords; //enter the values 



	//6.8  Multiple Advertisement Categories

	//click the advertisement WebElement

	//This will locate the first community  
	@FindBy(xpath = "//*[@class=\"category-title-text\"]")
	public static WebElement community;



	//6.9 Custom advertisement fields

	//click the advertisement WebElement
	//
	@FindBy(xpath = "//*[@class='sub-category-text']")
	public static WebElement category;

	@FindBy(xpath = "//*[@class='avatar-container full-size']")
	public static WebElement item;






}