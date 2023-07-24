package StepDefinition;

import java.util.List;
	


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository {
	@FindBy (xpath  = "//input[@type='text']")
	public static WebElement username;
	@FindBy (xpath = "//input[@type='password']")
	public static WebElement password;
	@FindBy (xpath = "//span[text()=\"Submit\"]")
	public static WebElement submit_Bt;
	@FindBy (id = "menu_banking")
	public static WebElement banking;
	@FindBy (xpath = "//div[text()='Payment to user']")
	public static WebElement payment_To_User;
	@FindBy (xpath = "//div[text()='Payment to system']")
	public static WebElement payment_To_System;
	@FindBy (xpath = "//div[text()='Payment requests']")
	public static WebElement payment_Requests;
	@FindBy (xpath = "//button/icon/*[@class='bi bi-book']")
	public static WebElement contact_List;
	@FindBy (xpath = "//a[text()=' Car repair ']")
	public static WebElement car_Repair;
	@FindBy (id = "id_1")
	public static WebElement amount;
	@FindBy (id = "id_3")
	public static WebElement description;
	@FindBy (xpath = "//span[text()='Next']")
	public static WebElement next_Bt;
	@FindBy  (xpath = "//span[text()='Confirm']")
	public static WebElement confirm_Payment;
	@FindBy (xpath = "//div[contains(text(),'successfully')]")
	public static WebElement success_Alert;
	@FindBy (xpath = "//div[contains(text(),'exceeded')]")
	public static WebElement failure_Alert;
	@FindBy (xpath  = "//*[contains(@class,'form-control text-left custom-select w-100')]")
	public static WebElement click_Scheduling;
	@FindBy (xpath = "//*[contains(@class,'select-option undefined')]")
	public static List<WebElement> listOfElements_InScheduling ;
	@FindBy (css = "input[type='date']")
	public static WebElement date;
	@FindBy (xpath = "//*[@id=\"id_4\"]")
	public static WebElement number_Of_Installments;
	@FindBy (css  = "input[id='id_5_true']")
	public static WebElement first_Installment_Now;
	@FindBy (xpath = "input[id='id_5_false']")
	public static WebElement first_Installment_Future_Date;
	@FindBy (css = "input[type='date']")
	public static WebElement first_Installment_Date;
	@FindBy (xpath = "//label[text()=' Now ']")
	public static WebElement first_Occurrence_Now;
	@FindBy (xpath = "//label[text()=' Future date ']")
	public static WebElement first_Occurrence_Future_Date;
	@FindBy (xpath = "//div[text()='Send a new request']")
	public static WebElement send_A_New_Request;
	@FindBy (id = "id_5")
	public static WebElement amount_Request;
	@FindBy (id = "id_6")
	public static WebElement expiration_Date;
	
	
	

}
