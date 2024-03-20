package lambda.after;

public interface Adder {
	int add(int x, int y);
}
class Main {
	public static void main(String[] args) {
		// Adder adder = (int x, int y) ->{return x + y;};
		Adder adder = (x,y) -> x + y;;
		System.out.println(adder.add(3, 4));
	}
}
