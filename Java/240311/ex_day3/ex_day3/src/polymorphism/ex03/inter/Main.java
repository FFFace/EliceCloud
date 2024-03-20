package polymorphism.ex03.inter;

public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.speak(); // 출력: 멍멍
		myCat.speak(); // 출력: 야옹
	}
}
