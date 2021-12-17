package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterization {

	@Parameters({ "browser" })
	@Test
	public void firstTest(@Optional("safari") String browser) {
		System.out.println(browser);

	}

	@Parameters({ "username", "password" })
	@Test
	public void secondTest(@Optional("garima") String username, @Optional("garima1234") String password) {
		System.out.println("Username is " + username);
		System.out.println("Password is " + password);

	}

}