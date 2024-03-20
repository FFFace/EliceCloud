package innerclass.anonymous;

interface Message {
	void greet();
}

public class Anonymous {

	public void display() {
		// 인터페이스를 구현 중- 근데 이름이 없다!
		Message message = new Message() {
			@Override
			public void greet() {
				System.out.println("Hello, this is an anonymous inner class.");
			}
		};
		message.greet();
	}

	public static void main(String[] args) {
		Anonymous outer = new Anonymous();
		outer.display();
	}
}
