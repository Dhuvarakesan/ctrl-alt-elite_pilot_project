package com.StepDefinition_6_6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	public static String userName;
	public static String passWord;
	public static String category;
	public static WebDriver driver;
	
	public static  void excelCall() throws IOException
	{
		FileInputStream excel = new FileInputStream("C:\\Users\\mkanakkanadar\\eclipse-workspace\\Pilot_Project\\ExcelFile\\LoginCredentials.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(excel);
		XSSFSheet sheet =  book.getSheetAt(0);
		int row = sheet.getLastRowNum();
		 System.out.println(row);
		 userName = sheet.getRow(1).getCell(0)+"";
		 passWord = sheet.getRow(1).getCell(1)+"";
		 category = sheet.getRow(1).getCell(2)+"";
		 int index = passWord.indexOf(".");
		 passWord = passWord.substring(0,index);
		 
	}
	
	public static void driverLaunch() throws IOException {
	    excelCall();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,30);
	driver.get("https://demo.cyclos.org/ui/login");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=\"User\"]")));
	driver.findElement(By.cssSelector("input[placeholder=\"User\"]")).sendKeys(HelperClass.userName);
	driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(HelperClass.passWord);
	System.out.println(HelperClass.category);
	driver.findElement(By.cssSelector("button[class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")).click();
	PageFactory.initElements(driver, Repository_6_6.class);
	}
}
