package com.CRM.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
  @Test
  public void ValidateLogin() {
	  String ActUrl =  p1.dologin("naina@gmail.com", "naina@123");
	  Assert.assertTrue(ActUrl.contains("customers"), "Test Fail: Login Fail");
	  System.out.println("Test Paas: Login is pass");
  }

}
