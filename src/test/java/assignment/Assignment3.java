package assignment;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class Assignment3 {
	

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	private WebDriverWait wait;
	private SoftAssert sf;
	WebDriverUtilities wdu;
	
	
	@BeforeClass
	public void setUp(){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		wdu =new WebDriverUtilities(driver);
		driver.get("http://demo.seleniumeasy.com/");
		driver.findElement(By.id("at-cv-lightbox-close")).click();
	}
	
	
	
	@BeforeMethod
	public void testPreReq() {
	sf = new SoftAssert();
	}
	
	
	
	
	@Test
	public void isLinkVisible() {
	
		
		List<WebElement> list1=new LinkedList();
		List<WebElement> list2=new LinkedList();
		List<WebElement> list3=new LinkedList();
		list1=driver.findElements(By.xpath("//i[@class=\"tree-indicator glyphicon glyphicon-chevron-right\"]"));
		list1.get(2).click();
		
		list2=driver.findElements(By.xpath("//a[contains(text(),\"Table Pagination\")]"));
		list2.get(1).click();
		
		
		wdu.switchWindow();
		
		
		list3=driver.findElements(By.xpath("//a[@class=\"page_link active\"] | //a[@class=\"page_link\"]"));
		
		Assert.assertEquals(list3.size(), 3);
		
		
	
	}
	
	
	@Test
	public void isLinkWorking(){
		
		List<WebElement> list1=new LinkedList();
		List<WebElement> list2=new LinkedList();
		List<WebElement> list3=new LinkedList();
		list1=driver.findElements(By.xpath("//i[@class=\"tree-indicator glyphicon glyphicon-chevron-right\"]"));
		list1.get(2).click();
		
		list2=driver.findElements(By.xpath("//a[contains(text(),\"Table Pagination\")]"));
		list2.get(1).click();
		
		
		wdu.switchWindow();
list3=driver.findElements(By.xpath("//a[@class=\"page_link\"]"));
		
		try
		{
			list3.get(0).click();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		try
		{
			list3.get(1).click();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
	
		
		
	}
	
	
	
	@Test
	public void submitFormTest() {
	
		
		List<WebElement> list1=new LinkedList();
		List<WebElement> list2=new LinkedList();
		List<WebElement> list3=new LinkedList();
		list1=driver.findElements(By.xpath("//i[@class=\"tree-indicator glyphicon glyphicon-chevron-right\"]"));
		list1.get(0).click();
		
		list2=driver.findElements(By.xpath("//a[contains(text(),\"Input Form Submit\")]"));
		list2.get(1).click();
		
		
		wdu.switchWindow();
		
		
		list3=driver.findElements(By.xpath("//input[@class=\"form-control\"]"));
		
		
		list3.get(1).sendKeys("kumar");
		list3.get(2).sendKeys("sac@gmail.com");
		list3.get(3).sendKeys("1234567890");
		list3.get(4).sendKeys("gsdhagdajgdja");
		list3.get(5).sendKeys("dhfjkshdfskj");
		list3.get(6).sendKeys("1000");
		list3.get(7).sendKeys("dhfsjhsjfj");
		
		WebElement ele=driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
		ele.click();
		
		WebElement ele1=driver.findElement(By.xpath("//small[contains(text(),\"Please supply your first name\")]"));
		
		
		String msg=ele1.getText();
		
		Assert.assertEquals(msg,"Please supply your first name");
		
		
		
		
		
		
	
	}
	
	
	
	

	@Test
	public void alertTest() {
	
		
		List<WebElement> list1=new LinkedList();
		List<WebElement> list2=new LinkedList();
		List<WebElement> list3=new LinkedList();
		list1=driver.findElements(By.xpath("//i[@class=\"tree-indicator glyphicon glyphicon-chevron-right\"]"));
		list1.get(4).click();
		
		list2=driver.findElements(By.xpath("//a[contains(text(),\"Bootstrap Alerts\")]"));
		list2.get(1).click();
		
		
		wdu.switchWindow();
		
		
		
		
		WebElement ele=driver.findElement(By.xpath("//button[@id=\"normal-btn-success\"]"));
		ele.click();
		
		WebElement ele1=driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-normal-success\"]"));
		
		
		String msg=ele1.getText().trim();
		
		Assert.assertTrue(msg.contains("I'm a normal success message. To close use the appropriate button."));
		
		
		
		
		
		
	
	}
	
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}




}
