package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Example1 {
  @Test(priority=1)
  public void funcOne() {
	  System.out.println("Example1_funcOne");
  }
  @Test(priority=2)
  public void funcTwo() {
	  System.out.println("Example1_funcTwo");
  }
  @Test(priority=3)
  public void funcThree() {
	  System.out.println("Example1_funcThree");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Example1_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Example1_afterClass");
  }

}
