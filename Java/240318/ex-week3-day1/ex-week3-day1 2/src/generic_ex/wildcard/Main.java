package generic_ex.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Circle> circleList = Arrays.asList(new Circle(2), new Circle(3));
		List<Rectangle> rectangleList = Arrays.asList(new Rectangle(2, 3), new Rectangle(3, 4));

		System.out.println("원의 면적 합: " + sumArea(circleList));
		System.out.println("사각형의 면적 합: " + sumArea(rectangleList));
	}

	// 제네릭 와일드카드를 사용하여 다양한 타입의 Shape 객체 리스트 처리
	// -> Circle과 Rectangle 객체 리스트 모두를 처리할 수 있게 되어 코드의 재사용성과 유연성이 높
	public static double sumArea(List<? extends Shape> shapeList) {
		double sum = 0;
		for (Shape shape : shapeList) {
			sum += shape.area();
		}
		return sum;
	}
}
