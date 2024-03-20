package innerclass;

import java.util.Objects;

public class Outer {
	private int data = 30;

	private Inner inner;

	public Outer() {
		inner = new Inner();
	}

	class Inner {

		void msg() {
			System.out.println("data is " + data);
		}
	}

}
