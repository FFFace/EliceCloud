package exception_ex.multiple;

public class MultipleCatchExample {
	public static void main(String[] args) {
		try {
			int result = 10 / 0; // ArithmeticException 발생
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("기타 예외 발생: " + e.getMessage());
		}
	}
}
