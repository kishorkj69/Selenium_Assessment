package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Example4 {
	@Test
	public void funcOne() {
		System.out.println("Example4_funcOne");
	}

	@Test
	public void funcTwo() {
		System.out.println("Example4_funcTwo");
	}

	@Test
	public void funcThree() {
		System.out.println("Example4_funcThree");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Example4_beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Example4_afterClass");
	}

}
