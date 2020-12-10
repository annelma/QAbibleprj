package com.Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.CreateClientPage;
import com.page.LoginPage;
import com.utility.ExcelData;

public class CreateClientTest extends Base {
	@Test(dataProvider = "dp")
	  public void f(String fname,String faddress,String fpostcode,String fcountry,String fref,String fcontact,String fphone,String ffax,String fmail,String fcomreg,String fdays) throws InterruptedException {
		  LoginPage l=new LoginPage(driver);
		  l.set("carol", "1q2w3e4r"); 
		  CreateClientPage c=new CreateClientPage(driver);
		
		  c.click();
		  Thread.sleep(2000);
		  c.create(fname,faddress,fpostcode,fcountry,fref,fcontact,fphone,ffax,fmail,fcomreg,fdays);
		  Thread.sleep(2000);
		  
		  	
		  
	  }
	 @DataProvider
	  public Object[][] dp() throws InvalidFormatException, IOException {
	  Object[][] data= ExcelData.getDataFromSheet("F:\\Java Selenium docs\\QAbibleCreateClient.xlsx");
	  return data;
	 
	  }
	}
