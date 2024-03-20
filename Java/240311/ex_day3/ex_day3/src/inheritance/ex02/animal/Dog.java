package inheritance.ex02.animal;

public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹음");
	}

	public void bark() {
		System.out.println("강아지가 짖음");
	}
}
