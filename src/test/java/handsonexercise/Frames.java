package handsonexercise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import utilities.selenium.WebDriverManager;

public class Frames {
	
	org.testng.asserts.SoftAssert sf;
	

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	@BeforeClass
	public void setUp(){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver,120);
		driver.get("https://demoqa.com/frames");
		
	}
	
	@BeforeMethod
	public void testPreReq()
	{
		
	}
	
	@Test
	public void Test() {
		
		driver.switchTo().frame("frame1");
		String header=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(header);	
	
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}