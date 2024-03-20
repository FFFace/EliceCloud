package inheritance.ex02;

// 메인 클래스
public class Main {
	public static void main(String[] args) {
		Ex02Vehicle myCar = new Ex02Car();
		myCar.move(); // "차량이 움직임" 그리고 "자동차가 달림" 출력
	}
}
