package factory;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements Browsers {
	
	public static final Logger logger = Logger.getLogger(HelperUtility.class.getName());
	@Override
	public WebDriver launch() {
		// TODO Auto-generated method stub
		logger.info("Launching Firefox browser..");
		return new FirefoxDriver();
	}

}
