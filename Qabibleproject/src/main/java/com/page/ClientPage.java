package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver ;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[1]//td[6]//a[1]")
	private WebElement viewlink;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[1]//td[6]//a[2]")
	private WebElement updatelink;
	
	@FindBy(name="Client[client_name]")
    private WebElement Clientname;
	
	@FindBy(name="ClientSearch[client_name]")
    private WebElement Searchname;
	
	@FindBy(name="ClientSearch[id]")
    private WebElement Searchid;
    
	@FindBy(xpath="//button[text()='Search']")
    private WebElement Searchbtn;
	
	@FindBy(xpath="//button[text()='Reset']")
    private WebElement Resetbtn;
    

	public ClientPage(WebDriver driver) {
		this.driver=driver ;
		PageFactory.initElements(driver, this);		
	}
	public void click()
	{
		WebElement link = driver.findElement(By.partialLinkText("Clients")); 
		link.click();	
	}
	public void view()
	{
		 
		viewlink.click();
		
		 
	}
	public void edit()
	{
		//driver.navigate().back();
		updatelink.click();
		Clientname.clear();
		Clientname.sendKeys("Test");
		WebElement link=driver.findElement(By.xpath("//button[text()='Save']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView()",link);
		 link.click();
		//driver.navigate().back();
	//	WebElement clink = driver.findElement(By.partialLinkText("Clients")); 
	  //  clink.click();
	}
	public void search() throws InterruptedException
	{
		//WebElement link = driver.findElement(By.partialLinkText("Clients")); 
		//link.click();
		//driver.navigate().back();
		Searchname.sendKeys("Test");
		Searchid.sendKeys("1");
		Searchbtn.click();
		//Resetbtn.click();
		Thread.sleep(2000);
		Searchname.clear();
		Searchid.clear();
		Searchbtn.click();
		
	}

}