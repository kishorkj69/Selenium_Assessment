package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class ExplicitWait {

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://www.google.co.in");
	}

	@Test
	public void explicitWaitTest() {
		// WebDriverWait wait = new WebDriverWait(driver,120);
		// WebElement oElem =driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
		By bySearch = By.cssSelector("input.gLFyf.gsfi");
		wait.until(ExpectedConditions.elementToBeClickable(bySearch));

		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).clear();
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("testing");
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).clear();
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("kishor");

		// wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}