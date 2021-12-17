package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert {
	
org.testng.asserts.SoftAssert sf;
	
	@BeforeMethod
	public void setUp() {
		sf=new org.testng.asserts.SoftAssert();
	}
	
	@Test(priority=1)
	public void softAssertTest() {
		
		sf.assertEquals("Garima", "Garima");
		sf.assertEquals("Sharma", "Sharma");
		sf.assertEquals("sharmagarima2998@gmail.com", "sharmagarima2998@gmail.com");
		sf.assertEquals("", "7986433323");
		sf.assertEquals("", "Quality Engineer");
		sf.assertAll();
	}
	
	@Test(priority=2)
	public void softAssertTest2() {
		sf.assertTrue(true);
		sf.assertAll();
	}

}