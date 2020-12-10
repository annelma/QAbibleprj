package com.Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.LoginPage;
import com.utility.ExcelData;

public class LoginTest extends Base  {
	@Test(dataProvider = "dp")
	  public void f(String n, String s) {
		  LoginPage l=new LoginPage(driver);
		  l.set(n ,s);
		/* WebElement link = driver.findElement(By.partialLinkText("Clients")); 
		 link.click();*/
		  
	  }
	  @DataProvider
	  public Object[][] dp() throws InvalidFormatException, IOException {
	  Object[][] data= ExcelData.getDataFromSheet("F:\\Java Selenium docs\\QAbibleLogin.xlsx");
	  return data;
	 
	  }
	}
