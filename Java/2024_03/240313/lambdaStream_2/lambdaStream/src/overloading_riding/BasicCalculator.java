package overloading_riding;

public class BasicCalculator {
	public int add(int a, int b) {
		System.out.println("BasicCalculator 의 add(int a, int b)실행");
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

}
