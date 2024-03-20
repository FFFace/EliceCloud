package encapsulation.ex01;

public class Main {
	public static void main(String[] args) {
		Ex01Person person = new Ex01Person();
		// person.name = "홍길동";
		// System.out.println(person.name);
		// person.name = "이순신";
		// System.out.println(person.name);
		person.changeName("홍길동");
		System.out.println(person.getName());
	}
}
