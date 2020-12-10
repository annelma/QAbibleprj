package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commons {
public WebDriver driver;
	
	public Commons(WebDriver driver) {
		this.driver = driver;
		
	}
public void selectItemByText(WebElement ele, String searchText) {
		Select oselect=new Select(ele);
		oselect.selectByVisibleText(searchText);
		
	}

public void selectItemByValue(WebElement ele, String searchText) {
	Select oselect=new Select(ele);
	oselect.selectByValue(searchText);
	
}
	public void sendkeys(WebElement ele,String value)
	{
		ele.clear();
		ele.sendKeys(value);
	}
	
	
	public void scroll_To_element(WebElement webelement) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webelement);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
