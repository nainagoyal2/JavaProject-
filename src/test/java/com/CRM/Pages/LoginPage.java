package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CRM.Utility.Utility;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) { //base class for local driver
		this.driver = driver;
	}
	private By email = By.id("email-id");
	private By pwd = By.id("password");
	private By btn=  By.id("submit-id");
	public String dologin(String un , String ps)
	{  
		driver.findElement(email).sendKeys(un);
		driver.findElement(pwd).sendKeys(ps);
		Utility.capture(driver);	
	    driver.findElement(btn).click();
	    Utility.capture(driver);	
	   return driver.getCurrentUrl();
	}

}
