package designpattern.singleton.carCount;

// 클래스 변수에 대한 이해
public class Main {
	public static void main(String[] args) {
		CarCount carCount1 = new CarCount();
		CarCount carCount2 = new CarCount();

		System.out.println(CarCount.numberOfCars); // 출력: 2
		// Car 클래스의 모든 인스턴스는 numberOfCars 값을 공유함.
	}
}
