package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class AlertBox {

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	}

	@Test
	public void alertBoxTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement text = driver.findElement(By.id("confirm-demo"));
		String innerText = text.getText();
		Assert.assertEquals(innerText, "You pressed OK!");
		Thread.sleep(10000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
