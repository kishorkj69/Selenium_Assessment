package framework.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPagePOAssign {
	WebDriver driver;

	public ProductPagePOAssign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCart;

	@FindBy(id = "attach-accessory-cart-total-string")
	private WebElement cartCount;

	public void addToCart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
		Thread.sleep(3000);
		addToCart.click();

	}

	public void verifyCart() {
		String text = cartCount.getText();

		Assert.assertTrue(text.contains("1"), "FAIL | count of product in cart is 0");

	}

}