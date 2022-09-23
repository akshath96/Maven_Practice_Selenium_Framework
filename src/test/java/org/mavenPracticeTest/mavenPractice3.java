package org.mavenPracticeTest;

import org.testng.annotations.Test;

public class mavenPractice3 {
	 @Test
	  
	  public void step1Test() {
		  String browser3 = System.getProperty("b");
		  String url3 = System.getProperty("u");
		  
		  System.out.println(browser3);
		  System.out.println(url3);
	  }
}
