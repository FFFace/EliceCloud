package overloading_riding;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// // 잘못된 오버로딩! - 메소드가 뜻하는 바가 다르다!
	// public long add(long a, long b) {
	// 	return a - b;
	// }


	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.add(10.0, 20.0));
	}

}
