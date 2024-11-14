package factory;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser implements Browsers{
	
	public static final Logger logger = Logger.getLogger(HelperUtility.class.getName());
	@Override
	public WebDriver launch() {
		// TODO Auto-generated method stub
		logger.info("Launching Edge browser..");
		return new EdgeDriver();
	}

}
