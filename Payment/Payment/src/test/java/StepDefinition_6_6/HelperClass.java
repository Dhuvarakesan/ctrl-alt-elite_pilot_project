package com.StepDefinition_6_6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HelperClass {
	public static String userName;
	public static String passWord;
	public static String category;
	
	
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

}
