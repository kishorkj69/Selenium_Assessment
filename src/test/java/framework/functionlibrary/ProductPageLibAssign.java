package framework.functionlibrary;

import org.openqa.selenium.WebDriver;

import framework.pageobjects.ProductPagePOAssign;

public class ProductPageLibAssign {

	WebDriver driver;
	ProductPagePOAssign propagpo;

	public ProductPageLibAssign(WebDriver driver) {
		this.driver = driver;
	}

	public void addVerify() throws InterruptedException {
		propagpo = new ProductPagePOAssign(driver);
		propagpo.addToCart();
		Thread.sleep(5000);
		propagpo.verifyCart();
	}

}