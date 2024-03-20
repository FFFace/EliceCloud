package overloading_riding;

public class Main {
	public static void main(String[] args) {
		BasicCalculator calc = new BasicCalculator();

		BasicCalculator calc2 = new BasicCalculator();

		System.out.println(calc == calc2);
		System.out.println(calc);
		System.out.println(calc2);



	}
}
