package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Commons;

public class CreateClientPage {
WebDriver driver ;
	
    @FindBy(name="Client[branch_id]")
     private WebElement Branch;

    @FindBy(name="Client[division_id]")
    private WebElement Division;
    
    @FindBy(name="Client[client_name]")
    private WebElement Clientname;
    
    @FindBy(name="Client[client_address]")
    private WebElement Clientaddress;
    
    @FindBy(name="Client[postcode]")
    private WebElement Clientpostcode;
    
    @FindBy(name="Client[country]")
    private WebElement Clientcountry;
    
    @FindBy(name="Client[your_ref]")
    private WebElement Clientref;
    
    @FindBy(name="Client[invoice_contact]")
    private WebElement Clientinvoice_contact;
    
    @FindBy(name="Client[phone]")
    private WebElement Clientphone;
    
    @FindBy(name="Client[fax]")
    private WebElement Clientfax;
    
    @FindBy(name="Client[email]")
    private WebElement Clientemail;
    
    @FindBy(name="Client[company_reg]")
    private WebElement Clientcompany_reg;
    
    @FindBy(name="Client[invoice_order]")
    private WebElement Clientinvoice_order;
    
    @FindBy(name="Client[invoice_delivery_method]")
    private WebElement Clientdelivery_method;
    
    @FindBy(name="Client[master_document]")
    private WebElement Clientmaster_document;
    
    @FindBy(name="Client[settilement_days]")
    private WebElement Clientsettilement_days;
    
    @FindBy(name="Client[vat_rate]")
    private WebElement Clientvat_rate;
    
    
    @FindBy(id="client-require_po")
    private WebElement Clientrequire_po;
    


		public CreateClientPage(WebDriver driver) {
		this.driver=driver ;
		PageFactory.initElements(driver, this);		
	}
	
	public void click()
	{
		WebElement link = driver.findElement(By.partialLinkText("Clients")); 
		 link.click();
		 WebElement Createlink = driver.findElement(By.partialLinkText("Create Client")); 
		 Createlink.click();
		 
		  
	}
	public void create(String name,String address,String postcode,String country,String ref,String contact,String phone,String fax,String mail,String comreg,String days)
	{
		 Commons ob=new Commons(driver);
		 ob.selectItemByValue(Branch, "1");
		 ob.selectItemByValue(Division, "1");
		 ob.sendkeys(Clientname, name);
		 ob.sendkeys(Clientaddress, address);
		 ob.sendkeys(Clientpostcode, postcode);
		 ob.sendkeys(Clientcountry, country);
		 ob.sendkeys(Clientref, ref);
		 ob.sendkeys(Clientinvoice_contact, contact);
		 ob.sendkeys(Clientphone, phone);
		 ob.sendkeys(Clientfax, fax);
		 ob.sendkeys(Clientemail, mail);
		 ob.sendkeys(Clientcompany_reg, comreg);
		 ob.selectItemByValue(Clientinvoice_order, "Single timesheet per client");
		 ob.selectItemByValue(Clientdelivery_method, "Paper");
		 ob.selectItemByValue(Clientmaster_document, "Print");
		 ob.sendkeys(Clientsettilement_days, days);
		 ob.selectItemByValue(Clientvat_rate, "VAT 5.00%");
		
		 ob.scroll_To_element(Clientrequire_po);
		 WebDriverWait w=new WebDriverWait(driver,20);
		 w.until(ExpectedConditions.visibilityOf(Clientrequire_po));
		 Clientrequire_po.click();
		 
		 WebElement link=driver.findElement(By.xpath("//button[text()='Save']"));
		 //JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView()",link);
		 ob.scroll_To_element(link);
		 link.click();
		 
		 
		 
		 
		 
	}

}