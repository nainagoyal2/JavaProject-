package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//Encapsulation= indenfication(Locators)  + Action (Always data is private and method is public)
	private WebDriver driver; //instancse driver
	//locators 
    private	By link=By.linkText("Sign In");
    //intialize driver
    public HomePage(WebDriver driver) {
    	
		this.driver = driver; //base class local driver
	
	}
    
    
    //Method
    public String getAppTitle()
    {
    return driver.getTitle();
    }
    public String getAppUrl()
    {
    return driver.getCurrentUrl();	
    }
    public String getSignIN()
    {
    driver.findElement(link).click();
    return driver.getCurrentUrl(); //login
    }
	
  
	
	 
	
	
	

}
