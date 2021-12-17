package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Annotations2 {
	
	
  @Test(priority=1)
  public void testOne() {
	  System.out.println("Annotations2_testOne");
  }
  
  
  @Test(priority=2, dependsOnMethods="testOne")
  public void testTwo() {
	  System.out.println("Annotations2_testTwo");
	  Assert.fail();
  }
  
  
  @Test(priority=3, dependsOnMethods="testOne")
  public void testThree() {
	  System.out.println("Annotations2_testThree");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations2_beforeMethod");
  }

  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations2_afterMethod");
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations2_beforeClass");
  }

  
  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations2_afterClass");
  }

}