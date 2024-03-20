package abstract_ex;

// 추상 클래스 선언
public abstract class Animal {
	// 추상 메서드 선언
	public abstract void eat();

	// 구체 메서드 구현
	public void breathe() {
		System.out.println("숨을 쉼");
	}
}

