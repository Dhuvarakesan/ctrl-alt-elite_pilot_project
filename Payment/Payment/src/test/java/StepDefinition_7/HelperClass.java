package com.StepDefinition_7;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class HelperClass {
	public WebDriver driver;
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

}
