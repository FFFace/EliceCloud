package interface_ex;

// 두 인터페이스를 모두 구현하는 클래스
class Duck implements Flyable, Swimable {
	@Override
	public void fly() {
		System.out.println("오리가 하늘을 날음");
	}

	@Override
	public void swim() {
		System.out.println("오리가 물을 헤엄침");
	}
}
