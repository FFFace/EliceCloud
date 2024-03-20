package ocp.ex06;

//OCP 원칙을 따르는 예시
public class GraphicEditor {
	// drawShape 메서드는 Ex06Shape 클래스를 확장하는 어떤 클래스의 인스턴스도 그릴 수 있음.
	public void drawShape(Ex06Shape shape) {
		shape.draw();
	}
}
