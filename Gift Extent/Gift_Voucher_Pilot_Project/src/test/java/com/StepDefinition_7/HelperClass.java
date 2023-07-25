package com.StepDefinition_7;

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
	public static WebDriver driver;
	public static String userName;
	public static String passWord;
	public static String email;
	public static String amount;
	
	public static void excelData() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mkanakkanadar\\eclipse-workspace\\Gift_Voucher_Pilot_Project\\ExcelData\\GiftVoucherData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);
		userName = sheet.getRow(1).getCell(0)+"";
		passWord = sheet.getRow(1).getCell(1)+"";
		int index = passWord.indexOf(".");
		passWord = passWord.substring(0,index);
		email = sheet.getRow(1).getCell(2)+"";
		amount = sheet.getRow(1).getCell(3)+"";
		
	}
	
	public static void config() throws InterruptedException, IOException
	{
		 excelData();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://demo.cyclos.org/ui/login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=\"User\"]")));
		driver.findElement(By.cssSelector("input[placeholder=\"User\"]")).sendKeys(HelperClass.userName);
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(HelperClass.passWord);
		driver.findElement(By.cssSelector("button[class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")).click();
		PageFactory.initElements(driver, Repository_7.class);
	}

}
