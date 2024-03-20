package innerclass.instance_inner;

public class InstanceInner {
	private int data = 30;

	class InnerClass {
		void display() {
			System.out.println("data: " + data);
		}
	}

	public void showInner() {
		InnerClass inner = new InnerClass();
		inner.display();
	}

	public static void main(String[] args) {
		InstanceInner outer = new InstanceInner();
		outer.showInner();
	}
}
