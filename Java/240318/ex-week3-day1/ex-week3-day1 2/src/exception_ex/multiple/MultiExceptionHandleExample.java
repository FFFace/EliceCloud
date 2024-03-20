package exception_ex.multiple;

public class MultiExceptionHandleExample {
	public static void main(String[] args) {
		try {
			int result = 10 / 0; // ArithmeticException 발생
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
}
