package com.com.verizon;

import org.testng.annotations.Test;

public class SumTest {
  @Test (priority=5)
  public void getSumTest1() {
	  System.out.println(Thread.currentThread().getId());
  }
  @Test (priority=4)
  public void getSumTest2() {
	  System.out.println("Test case using NG");
  }
  @Test (priority=3)
  public void getSumTest3() {
	  System.out.println("Test case using NG");
  }
  @Test (priority=2)
  public void getSumTest4() {
	  System.out.println("Test case using NG");
  }
  @Test (priority=1)
  public void getSumTest5() {
	  System.out.println("Test case using NG");
  }
}
