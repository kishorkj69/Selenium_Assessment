package handsonexercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import utilities.Helper;

public class ReadFromPropFile {

	@Test
	public void readFromPropFileTest() throws IOException {
		Properties prop = new Properties();
		String file = "C:\\javaworkspace\\com.sapient.selenium.training\\src\\test\\resources\\credentials.prop";
		FileInputStream fls = new FileInputStream(file);

		prop.load(fls);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));

	}

	@Test
	public void test() {
		String path = "C:\\\\javaworkspace\\\\com.sapient.selenium.training\\\\src\\\\test\\\\resources\\\\credentials.prop";
		Helper helper = new Helper();
	//	System.out.println(helper.readFromPropFile(path,"browser"));
	}
	
}