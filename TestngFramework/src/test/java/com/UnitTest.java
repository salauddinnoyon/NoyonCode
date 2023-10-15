package com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UnitTest extends BaseTest{
	
	@Test (groups = "ui", priority = 1)
	public void login() {
		System.out.println("test2");
	}
	
	@Test (groups = "smoke" , priority = 2, dependsOnGroups = "login")
	public void logout() {
		System.out.println("test3");
	}
	
	@Test
	public void softTest() {
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(3>5);
		System.out.println("continue");
		softassert.assertAll();
		
	}

}
