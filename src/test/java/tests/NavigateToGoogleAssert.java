package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class NavigateToGoogleAssert {
	
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	@BeforeClass
	public void setUp(){
		webDrvMgr= new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogle() {
		String title= driver.getTitle();
		Assert.assertEquals("Google", title);
		String url= driver.getCurrentUrl();
		Assert.assertEquals("https://www.google.co.in/", url);
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innerText = oelem.getText();
		Assert.assertEquals("India", innerText);
		String attribClass = oelem.getAttribute("Class");
		Assert.assertEquals("uU7dJb", attribClass);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}