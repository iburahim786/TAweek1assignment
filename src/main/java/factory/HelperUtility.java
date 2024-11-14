package factory;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

public class HelperUtility {
	public static final Logger logger = Logger.getLogger(HelperUtility.class.getName());
	
	public static void maximizeWindow(WebDriver driver) {
		logger.info("Maximizing browser..");
		driver.manage().window().maximize();
	}
	
	public static void implicitWait(WebDriver driver) {
		logger.info("Wait for 10 sec..");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void fireURL(WebDriver driver) {
		logger.info("Firing URL..");
		driver.get("https://www.google.com");
	}

}
