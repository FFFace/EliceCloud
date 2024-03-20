package dip.ex09;

public class Application {
	public static void main(String[] args) {
		DataRepository fileRepo = new FileDataRepository();
		ReportGenerator fileReportGenerator = new ReportGenerator(fileRepo);
		fileReportGenerator.generateReport("File report content");

		DataRepository dbRepo = new DatabaseDataRepository();
		ReportGenerator dbReportGenerator = new ReportGenerator(dbRepo);
		dbReportGenerator.generateReport("Database report content");
	}
}
