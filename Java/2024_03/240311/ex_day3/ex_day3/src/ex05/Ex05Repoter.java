package ex05;

/*
	아래 예시에서 Report 클래스는 보고서를 생성하고, 프린터에 출력하는 두 가지 책임을 갖고 있음. 이는 SRP에 위배됨.
*/
public class Ex05Repoter {
	public void generateReport() {
		// 보고서 생성 로직
	}

	public void printReport() {
		// 보고서 출력 로직
	}
}

//	SRP를 적용하여 각 책임을 분리하면 다음과 같음:
/*
public class Report {
	public void generateReport() {
		// 보고서 생성 로직
	}
}

public class ReportPrinter {
	public void printReport(Report report) {
		// 보고서 출력 로직
	}
}
//	분리된 ReportPrinter 클래스는 보고서를 출력하는 단일 책임만을 가짐으로써, 보고서 생성과 출력 로직이 서로에게 영향을 주지 않고 독립적으로 변경될 수 있게 됨.
*/