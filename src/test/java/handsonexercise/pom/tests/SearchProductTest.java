package handsonexercise.pom.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import handsonexercise.pom.pageobjects.HomePagePO;
import handsonexercise.pom.pageobjects.SearchResultsPO;
import utilities.selenium.WebDriverManager;

public class SearchProductTest {
	
	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	HomePagePO hompo;
	SoftAssert sf;
	SearchResultsPO searespo;
	

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
	
		driver.get("https://www.amazon.in");
		hompo = new HomePagePO(driver);
		searespo = new SearchResultsPO(driver);
	}
	
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
		
	}
	
  @Test
  public void searchProductTest() {
	  String searchParam = "iPhone";
	  hompo.searchForProduct(searchParam);
	  List<String> listProdNames = searespo.getListOfProdNames();
	  for(String prodName : listProdNames) {
		  sf.assertTrue(prodName.toLowerCase().contains(searchParam.toLowerCase()),
				  "FAIL | Product name"+ prodName+" didn't contain search parameter"+ searchParam);
	  }
	  sf.assertAll();
  }
  
  @AfterClass
	public void tearDown() {
		driver.quit();
	}
}