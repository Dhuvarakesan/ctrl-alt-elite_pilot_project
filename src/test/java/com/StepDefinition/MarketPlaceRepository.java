package com.StepDefinition;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlaceRepository {
	//6.6 List new Advertisements
	
	@FindBy(xpath = "//div[text()='Advertisements']")
	public static WebElement advertisement;
	
	@FindBy(xpath = "//*[text()='Show advertisements']")
	public static WebElement showAdvertisement;
	
	@FindBy(xpath = "//*[text()='Order by']")
	public static WebElement orderBy;
	
	@FindBy(id = "id_40_date")
	public static WebElement lastPublished;
	
	
	
	//6.7 Category Browsing
	
	   //click the advertisement WebElement
	
	@FindBy(css = "*[id='id_43']")
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
	
	
	
	//7.1 verify gift 
	@FindBy(xpath = "//*[@class='nav-item-text' and text()='My vouchers']")
	public static WebElement voucher;
	
	@FindBy(xpath = "//*[@class='table table-hover cursor-pointer']//tr[1]")
	public static WebElement tableCol1;
	
	@FindBy(xpath="//*[text()='Print']")
	public static WebElement print;
	
	
	//7.2 Buy and print voucher
	  //click the voucher
	
	@FindBy(xpath = "//*[text()='Buy and email']")
	public static WebElement buyEmail;
	
	@FindBy(xpath = "//*[@class='table table-no-header table-hover cursor-pointer']//tr[1]")
	public static WebElement email;
	
	@FindBy(id = "id_99")
	public static WebElement emailText;
	
	@FindBy(id = "id_98")
	public static WebElement amount;
	
	@FindBy(css = "button[class^='btn d-flex']")
	public static WebElement next;

}
