package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test(priority=1)
	public void hardAssertTest() {
		Assert.assertEquals("Garima", "Garima");
		Assert.assertEquals("Sharma", "Sharma");
	
	}
	
	@Test(priority=2)
	public void hardAssertTest2() {
		Assert.assertEquals("sharmagarima2998@gmail.com", "sharmagarima2998@gmail.com");
	}

}