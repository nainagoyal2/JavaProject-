package com.CRM.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

import dev.failsafe.internal.util.Durations;

public class BaseClass {
  public WebDriver driver;
  public HomePage h1;
  public LoginPage p1;
  @BeforeClass
	public void setup()
	{
		h1.getSignIN();
	}
	
	@BeforeTest
	public void SetUpBrowser()
	{
		 driver =  new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://automationplayground.com/crm/");
		 
		 h1 = new HomePage(driver);
		 p1 = new LoginPage(driver);
	}	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
}
