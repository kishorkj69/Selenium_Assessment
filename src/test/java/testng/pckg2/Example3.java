package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Example3 {
	@Test(priority = 1)
	public void funcOne() {
		System.out.println("Example3_funcOne");
	}

	@Test(priority = 2)
	public void funcTwo() {
		System.out.println("Example3_funcTwo");
	}

	@Test(priority = 3)
	public void funcThree() {
		System.out.println("Example3_funcThree");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Example3_beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Example3_afterClass");
	}

}
