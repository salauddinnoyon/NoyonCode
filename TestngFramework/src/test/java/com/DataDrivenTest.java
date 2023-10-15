package com;

import org.testng.annotations.Test;
import dv.DataSource;

public class DataDrivenTest {
	
	
	
	@Test(dataProviderClass = DataSource.class, dataProvider = "something")
	  public void f(String n, String s) {
		
		System.out.println(n);
		System.out.println(s);
	  }
	
	@Test(dataProviderClass = DataSource.class, dataProvider = "EXCELSHEET DATA")
	  public void b(Object n, Object s) {
		
		System.out.println(n);
		System.out.println(s);
	  }
}
 