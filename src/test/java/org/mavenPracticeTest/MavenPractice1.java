package org.mavenPracticeTest;

import org.testng.annotations.Test;

public class MavenPractice1 {
  @Test
  
  public void step1Test() {
	  String browser = System.getProperty("b");
	  String url = System.getProperty("u");
	  
	  System.out.println(browser);
	  System.out.println(url);
  }
}
