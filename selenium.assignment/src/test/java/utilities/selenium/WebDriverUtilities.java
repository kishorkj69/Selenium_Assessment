package utilities.selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;


public class WebDriverUtilities {
	private WebDriver driver;
	
	public WebDriverUtilities(WebDriver driver) {
		this.driver=driver;
	}
	


public void switchWindow() {
	String currentWindowHandle = null;
	try{
		currentWindowHandle=driver.getWindowHandle(); //will give the id of current window
	}catch(Exception ex){
		System.out.println("Parent window is closed");
	}
	Set<String> windowHandles=driver.getWindowHandles(); //will give the id of all the window opened
	for(String newWindow:windowHandles) {
		if(!newWindow.equalsIgnoreCase(currentWindowHandle)) {
			driver.switchTo().window(newWindow);
		}
	}
}
}


