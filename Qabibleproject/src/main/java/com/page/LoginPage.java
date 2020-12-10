package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver ;
	 @FindBy(name="LoginForm[username]")
		private WebElement username;
	 
	 
		@FindBy(name="LoginForm[password]")
		private WebElement password;
		
	
		 @FindBy(how = How.NAME, using = "login-button") 
			private WebElement Submitbutton;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
		PageFactory.initElements(driver, this);		
	}

	public void set(String name,String pass)
	{
		 //WebElement username = driver.findElement(By.name("LoginForm[username]"));
		// WebElement password = driver.findElement(By.name("LoginForm[password]"));
		// WebElement Submitbutton = driver.findElement(By.name("login-button"));
		 username.sendKeys(name);
		 password.sendKeys(pass);
		 Submitbutton.click();
		 
	}

}