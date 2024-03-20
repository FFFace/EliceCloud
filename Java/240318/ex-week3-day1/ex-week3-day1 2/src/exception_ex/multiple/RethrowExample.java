package exception_ex.multiple;

public class RethrowExample {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("메인에서 예외 처리: " + e.getMessage());
		}
	}

	public static void method1() throws Exception {
		try {
			throw new Exception("method1에서 발생한 예외");
		} catch (Exception e) {
			System.out.println("method1에서 예외 처리 후 재던짐");
			throw e; // 예외를 다시 던짐
		}
	}
}
