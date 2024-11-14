package factory;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Browsers{
	
	public static final Logger logger = Logger.getLogger(HelperUtility.class.getName());
	
	@Override
	public WebDriver launch() {
		// TODO Auto-generated method stub
		logger.info("Launching Chrome browser..");
		return new ChromeDriver();
	}

	
	
	

}
