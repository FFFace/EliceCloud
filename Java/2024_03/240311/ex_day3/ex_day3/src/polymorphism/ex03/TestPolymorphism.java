package polymorphism.ex03;

/*
* 상속 - 한 클래스가 다른 클래스를 상속하면, 다형성은 서브 클래스가 슈퍼 클래스를 대신할 수 있도록 허용함.
* '유연함': 하나의 코드 라인이 여러 타입의 객체에 대해 다르게 동작할 수 있음
* */

public class TestPolymorphism {
	public static void main(String[] args) {
		Ex03Animal myAnimal = new Ex03Animal();
		Ex03Animal myDog = new Dog();
		Ex03Animal myCat = new Cat();

		myAnimal.sound(); // 출력: 동물이 소리를 냄
		myDog.sound(); // 출력: 개가 멍멍 짖음
		myCat.sound(); // 출력: 고양이가 야옹 함
	}
}
