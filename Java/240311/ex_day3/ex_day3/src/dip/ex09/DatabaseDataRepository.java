package dip.ex09;

public class DatabaseDataRepository implements DataRepository {
	@Override
	public void saveReport(String reportData) {
		System.out.println("Report saved to the database");
		// 데이터베이스에 보고서 저장 로직 구현
	}
}
