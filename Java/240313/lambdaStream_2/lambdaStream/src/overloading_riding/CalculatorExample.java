package overloading_riding;

public class CalculatorExample {
	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.add(10, 20));

		ScientificCalculator sc = new ScientificCalculator();
		System.out.println(sc.add(10, 20));
	}
}
