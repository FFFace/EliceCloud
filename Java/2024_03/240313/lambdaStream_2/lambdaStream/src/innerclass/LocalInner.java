package innerclass;

public class LocalInner {

	public void display() {
		class LocalInnerClass {
			void message() {
				System.out.println("This is a local inner class");
			}
		}

		LocalInnerClass local = new LocalInnerClass();
		local.message();
	}

	public static void main(String[] args) {
		LocalInner outer = new LocalInner();
		outer.display();
	}
}
