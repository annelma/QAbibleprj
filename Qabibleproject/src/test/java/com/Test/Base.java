package com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Base {
	public 	WebDriver driver ;
	 
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","F:\\Broswer Launch\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		     
			 driver.get("http://www.qabible.in/payrollapp/site/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	  }

	  @AfterClass
	  public void afterClass() {
		  //driver.close();
	  }

	}
