package framework.functionlibrary;

import org.openqa.selenium.WebDriver;

import framework.pageobjects.HomePagePO;

public class HomePageLibAssign {

	WebDriver driver;
	HomePagePO hompagepo;

	public HomePageLibAssign(WebDriver driver) {
		this.driver = driver;
	}

	public void searchForProduct(String searchParam) {
		hompagepo = new HomePagePO(driver);
		hompagepo.enterValueInSearchBar(searchParam);
		hompagepo.clickSearchBtn();
	}

}