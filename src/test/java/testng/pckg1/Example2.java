package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Example2 {
  @Test
  public void funcOne() {
	  System.out.println("Example2_funcOne");
  }
  @Test
  public void funcTwo() {
	  System.out.println("Example2_funcTwo");
  }
  @Test
  public void funcThree() {
	  System.out.println("Example2_funcThree");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Example2_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Example2_afterClass");
  }

}
