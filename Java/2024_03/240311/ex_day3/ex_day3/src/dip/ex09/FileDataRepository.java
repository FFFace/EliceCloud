package dip.ex09;

public class FileDataRepository implements DataRepository {
	@Override
	public void saveReport(String reportData) {
		System.out.println("Report saved to a file");
		// 파일 시스템에 보고서 저장 로직 구현
	}
}

