package innerclass.static_inner;

public class StaticInner {
	static int data = 30;

	static class StaticInnerClass {
		void display() {
			System.out.println("data: " + data);
		}
	}

	public static void main(String[] args) {
		StaticInner.StaticInnerClass inner = new StaticInner.StaticInnerClass();
		inner.display();
	}
}
