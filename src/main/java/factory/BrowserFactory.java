package factory;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver launchBrowser(BrowserType type) {
		
		switch (type) {
		case chrome:
			driver = new ChromeBrowser().launch();
			break;
		case edge:
			driver = new EdgeBrowser().launch();
			break;
		case firefox:
			driver = new FirefoxBrowser().launch();
			break;
		default:
			throw new IllegalArgumentException("Unsupported Browser..");
		}
		launchApp();
		return driver;
	}
	
	public static void launchApp() {
		HelperUtility.maximizeWindow(driver);
		HelperUtility.implicitWait(driver);
		HelperUtility.fireURL(driver);
	}
}


