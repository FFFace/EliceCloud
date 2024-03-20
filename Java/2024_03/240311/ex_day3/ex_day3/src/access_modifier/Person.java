package access_modifier;

public class Person {
	private String name; // 같은 클래스 내에서만 접근 가능
	protected int age; // 같은 패키지 또는 서브 클래스에서 접근 가능
	public String city; // 어디서든 접근 가능

	private void printName() {
		System.out.println(this.name);
	}

	protected void printAge() {
		System.out.println(this.age);
	}

	public void printCity() {
		System.out.println(this.city);
	}
}

/*이 예제에서 name 변수는 private으로 선언되어 같은 Person 클래스 내에서만 접근이 가능함. age 변수는 protected로 선언되어 같은 패키지의 다른 클래스와 서브 클래스에서 접근할 수 있음. city 변수는 public으로 선언되어 프로그램의 어느 곳에서나 접근할 수 있음. 이처럼 접근 제한자를 사용하여 클래스 멤버에 대한 적절한 접근 수준을 설정할 수 있음.*/