package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class Assignment3 {

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("http://demo.seleniumeasy.com/");
	}

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void assignment3Test() throws InterruptedException {
		WebElement checkBox = driver.findElement(By.xpath("//a[text()='Table']"));
		checkBox.click();
		WebElement oTypeBox = driver
				.findElement(By.xpath("//li[@style='display: list-item;']//a[@href='./table-pagination-demo.html']"));
		oTypeBox.click();
		try {
			driver.findElement(By.cssSelector("a.page_link"));
			System.out.println("Page links are available");
		} catch (Exception ex) {
			System.out.println("Page links are not available");
		}

	}

	public void assignment3Test2() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("//li[@style='display: list-item;']//a[@href='./table-pagination-demo.html']"))
				.click();

		driver.findElement(By.xpath("//input[@data-bv-field='last_name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@data-bv-field='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@data-bv-field='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@data-bv-field='address']")).sendKeys("xyz street");
		driver.findElement(By.xpath("//input[@data-bv-field='city']")).sendKeys("abcd");
		WebElement oDropdown = driver.findElement(By.xpath("//select[@data-bv-field='state']"));
		Select select = new Select(oDropdown);
		select.selectByIndex(3);

		driver.findElement(By.xpath("//input[@data-bv-field='zip']")).sendKeys("78102");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//input[@value='yes']")).click();
		driver.findElement(By.xpath("//textarea[@data-bv-field='comment']")).sendKeys("This is a simple project");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		WebElement fName = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
		String innnerText = fName.getText();
		sf.assertEquals(innnerText, "Please supply your first name");
		sf.assertAll();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}