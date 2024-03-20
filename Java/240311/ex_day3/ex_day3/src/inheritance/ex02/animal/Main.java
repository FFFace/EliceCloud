package inheritance.ex02.animal;

public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.eat(); // 출력: 강아지가 사료를 먹음
		// myDog.bark(); // 컴파일 에러. Animal 타입으로는 Dog 클래스의 bark 메서드에 접근할 수 없음
	}
}
