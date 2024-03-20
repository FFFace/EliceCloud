package generic_ex;

// 제네릭 클래스 예시
public class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}


	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
		integerBox.set(10);
		Integer someInteger = integerBox.get();
		System.out.println(someInteger);
	}

}



