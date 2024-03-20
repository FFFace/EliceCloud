package exception_ex;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			int result = 5 / 0; // ArithmeticException 발생
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
		} finally {
			System.out.println("finally 블록이 실행되었습니다.");
		}
	}
}

