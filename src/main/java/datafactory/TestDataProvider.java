package datafactory;

public class TestDataProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataFactory.selectDatasource(DataSource.Excel);
		DataFactory.selectDatasource(DataSource.Faker);
		DataFactory.selectDatasource(DataSource.Databases);
		DataFactory.selectDatasource(DataSource.Apis);
		DataFactory.selectDatasource(DataSource.Hardcode);
		DataFactory.selectDatasource(DataSource.others);

	}

}
