package com.StepDefinition_7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository_7 {

	//Marketplace
	@FindBy(xpath = "//div[text()='Marketplace']")
	public static WebElement marketPlace;
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

	@FindBy(css = "input[class^='form-control w-100 n']")
	public static WebElement emailText;

	@FindBy(css = "input[class^='form-control t']")
	public static WebElement amount;

	@FindBy(css = "button[class^='btn d-flex']")
	public static WebElement next;
}
