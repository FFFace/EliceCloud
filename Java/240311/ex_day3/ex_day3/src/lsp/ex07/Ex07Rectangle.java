package lsp.ex07;/*
* 위 예시에서 ex07.Square 클래스는 Rectangle 클래스를 상속받음.
하지만 Square의 setWidth와 setHeight 메서드는 부모 클래스의
행동을 변경하고 있으므로, LSP에 위배될 수 있음.
Rectangle 클래스의 사용자가 ex07.Square 객체를
Rectangle 타입으로 사용할 때, 직사각형과 다른 동작을 경험하게 되면
LSP가 깨진 것임. 이런 경우, 상속보다는 컴포지션을 사용하는 것이 더 적절할수 있음.
* */

public class Ex07Rectangle {
	protected double width;
	protected double height;

	public void setWidth(double w) {
		width = w;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double area() {
		return width * height;
	}
}

