package dip.ex09;

public class ReportGenerator {
	private DataRepository dataRepository;

	public ReportGenerator(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	public void generateReport(String reportData) {
		dataRepository.saveReport(reportData);
		System.out.println("Report generated");
	}
}
