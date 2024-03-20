package abstract_ex;

public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.eat(); // 출력: 강아지가 사료를 먹음
		myDog.breathe(); // 출력: 숨을 쉼
	}
}
