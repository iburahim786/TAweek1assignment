package datafactory;

public class DataFactory {

	public static void selectDatasource(DataSource type) {

		switch (type) {
		case Excel:
			new ExcelDataProvider().provideData();
			break;
		case Faker:
			new FakerDataProvider().provideData();
			break;
		case Databases:
			new DatabaseDataProvider().provideData();
			break;
		case Apis:
			new APIsDataProvider().provideData();
			break;
		case Hardcode:
			new HardcodeDataProvider().provideData();
			break;
		default:
			throw new IllegalArgumentException("Unsupported data source..");
		}
	}

}
