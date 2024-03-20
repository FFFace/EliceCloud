package inheritance.ex02;

public class Truck extends Ex02Vehicle{
	@Override
	public void move() {
		super.move();
		System.out.println("트럭이 달림");
	}
}
