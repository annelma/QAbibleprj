package com.Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.ClientPage;
import com.page.LoginPage;
import com.utility.ExcelData;

public class ClientTest extends Base{
	@Test(priority=1)
	  public void Login() {
		LoginPage l= new LoginPage(driver);
		l.set("carol","1q2w3e4r"); 
	}
	/*@Test
	  public void f() throws InterruptedException {
		  
		ClientPage c=new ClientPage(driver);
		//WebElement link = driver.findElement(By.partialLinkText("Clients")); 
		// link.click();
		/* c.click();
		 c.view();
		 c.edit();
		 Thread.sleep(2000);
		 c.click();
		 c.search(); */
	// }
	@Test(priority=2)
	public void verifyview()
	{
		ClientPage c=new ClientPage(driver);
		c.click();
		c.view();
		
	}
	@Test(priority=3)
	public void verifyedit() throws InterruptedException
	{
		ClientPage c=new ClientPage(driver);
		c.click();
		c.edit();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void verifysearch() throws InterruptedException 
	{
		ClientPage c=new ClientPage(driver);
		c.click();
		c.search();
	}
	 
}

