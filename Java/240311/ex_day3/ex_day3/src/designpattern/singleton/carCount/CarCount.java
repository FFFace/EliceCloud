package designpattern.singleton.carCount;

// 클래스 변수에 대한 이해
public class CarCount {
	public static int numberOfCars = 0; // 클래스 변수 선언

	public CarCount() {
		CarCount.numberOfCars++; // Car 인스턴스가 생성될 때마다 numberOfCars를 1씩 증가
	}
}

