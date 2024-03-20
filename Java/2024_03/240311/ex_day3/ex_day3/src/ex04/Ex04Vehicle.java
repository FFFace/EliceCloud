package ex04;

abstract class Ex04Vehicle {
	abstract void start();
	abstract void stop();
	// 기타 공통적인 메서드와 속성
}

class Car extends Ex04Vehicle {
	@Override
	void start() {
		// 자동차를 시동하는 코드
	}

	@Override
	void stop() {
		// 자동차를 멈추는 코드
	}
}

class Truck extends Ex04Vehicle {
	@Override
	void start() {
		// 트럭을 시동하는 코드
		System.out.println("트럭이 출발합니다.");
	}

	@Override
	void stop() {
		System.out.println("트럭이 멈춥니다.");
		// 트럭을 멈추는 코드
	}
}
