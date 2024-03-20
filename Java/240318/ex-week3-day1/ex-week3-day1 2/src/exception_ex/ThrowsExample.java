package exception_ex;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			myMethod();
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다: " + e.getMessage());
		}
	}

	public static void myMethod() throws Exception {
		throw new Exception("내부에서 예외 발생");
	}
}

