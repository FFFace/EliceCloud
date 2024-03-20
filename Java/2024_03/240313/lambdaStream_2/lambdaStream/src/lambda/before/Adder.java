package lambda.before;

public interface Adder {
	int add(int x, int y);
}
class Main {
	public static void main(String[] args) {
		Adder adder = new Adder() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println(adder.add(3, 4));
	}
}
