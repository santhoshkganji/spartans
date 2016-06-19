package com.demo.main;

import org.testng.annotations.Test;

public class LaunchExplorerTest {

  @Test
  public void appTest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("First TestNG test");
  }
  @Test
  public void appTest2() {
	  throw new RuntimeException("Test not implemented");
	  //System.out.println("First TestNG test");
  }
}
