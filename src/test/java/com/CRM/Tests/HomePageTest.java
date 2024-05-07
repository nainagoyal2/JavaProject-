package com.CRM.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
  @Test(priority = 1)
  public void ValidateUrl() {
	  String actUrl =h1.getAppUrl();
	  // if assertion is fail so assertion error exception //java lang
	  Assert.assertTrue(actUrl.contains("crm"), "Test fail: Url not matched!");
	  System.out.println("Test Pass :URL Matched!");
	  
	  
  }
  @Test(priority = 2)
  public void ValidateTitle() {
	  String actTitle= h1.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer Service"),"Title is not matched");
	  System.out.println("Title is matched");
  }
  
  @Test(priority = 3)
  public void ValidateSignIn() {
	 String actUrl= h1.getSignIN();
	 Assert.assertTrue(actUrl.contains("login"), "Test fail: User is not navigated!");
	  System.out.println("Test Pass :User is navigated on login page!");
	  
  }
  
}
