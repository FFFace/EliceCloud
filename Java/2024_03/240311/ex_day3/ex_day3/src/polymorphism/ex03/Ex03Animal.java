package polymorphism.ex03;/*
* 위 예시에서 Animal 클래스는 sound 메서드를 가지고 있으며, Dog와 ex03.Cat 클래스는 이 메서드를 각각 오버라이딩함. main 메서드에서는 Animal 타입의 참조 변수를 사용하여 Dog와 ex03.Cat 객체를 참조함. 실행 시 참조된 객체의 실제 타입에 맞는 sound 메서드가 호출됨. 이처럼 다형성을 활용하면 하나의 코드 라인이 여러 타입의 객체에 대해 다르게 동작할 수 있음.
* */


public class Ex03Animal {
	public void sound() {
		System.out.println("동물이 소리를 냄");
	}
}

class Dog extends Ex03Animal {
	@Override
	public void sound() {
		System.out.println("개가 멍멍 짖음");
	}
}

class Cat extends Ex03Animal {
	@Override
	public void sound() {
		System.out.println("고양이가 야옹 함");
	}
}

