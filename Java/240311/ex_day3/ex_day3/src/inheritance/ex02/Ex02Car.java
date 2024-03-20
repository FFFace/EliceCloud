package inheritance.ex02;/*
* 위 예시에서 Car 클래스는 Vehicle 클래스로부터 move 메서드를 상속받음.
* Car 클래스는 move 메서드를 오버라이딩하여 자동차의 특성에 맞는 기능을 추가함.
* main 메서드에서 Car 객체의 move 메서드를 호출하면, 기반 클래스의 move 메서드가 먼저 호출되고,
* 그 다음에 Car 클래스에 추가된 코드가 실행됨.
* 이처럼 상속은 클래스 간의 관계를 구성함으로써 객체지향적 설계를
* 더욱 풍부하고 유연하게 만들어 줌.
*
* */


public class Ex02Car extends Ex02Vehicle {
	@Override
	public void move() {
		super.move(); // 기반 클래스의 메서드 호출
		System.out.println("자동차가 달림");
	}
}

