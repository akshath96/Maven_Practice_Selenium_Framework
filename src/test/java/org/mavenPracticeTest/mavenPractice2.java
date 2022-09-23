package org.mavenPracticeTest;

import org.testng.annotations.Test;

public class mavenPractice2 {
	 @Test
	  
	  public void step2Test() {
		  String browser2 = System.getProperty("b");
		  String url2 = System.getProperty("u");
		  
		  System.out.println(browser2);
		  System.out.println(url2);
	  }
}
