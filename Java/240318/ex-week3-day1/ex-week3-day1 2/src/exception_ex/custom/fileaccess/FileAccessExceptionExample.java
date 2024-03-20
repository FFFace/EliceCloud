package exception_ex.custom.fileaccess;

public class FileAccessExceptionExample {
	public static void main(String[] args) {
		try {
			accessFile("importantFile.txt");
		} catch (FileAccessDeniedException e) {
			System.out.println(e.getMessage());
		}
	}

	static void accessFile(String fileName) throws FileAccessDeniedException {
		// 파일 접근 로직 (여기서는 예시를 위한 가상 코드)
		boolean accessDenied = true; // 접근 거부 상황을 가정
		if (accessDenied) {
			throw new FileAccessDeniedException(fileName + "에 접근할 수 없습니다.");
		}
		System.out.println(fileName + "에 접근하였습니다.");
	}
}
