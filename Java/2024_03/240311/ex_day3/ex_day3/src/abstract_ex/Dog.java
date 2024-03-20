package abstract_ex;

// 추상 클래스를 상속받는 서브 클래스
public class Dog extends Animal {
	// 추상 메서드 구현
	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹음");
	}
}
