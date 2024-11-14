package datafactory;

import java.util.logging.Logger;

import factory.HelperUtility;

public class DatabaseDataProvider implements DataProvider {
	
	public static final Logger logger = Logger.getLogger(HelperUtility.class.getName());

	@Override
	public void provideData() {
		// TODO Auto-generated method stub
		logger.info("Data are being selected from Database..");
	}

}