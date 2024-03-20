package ocp.ex06;/*
* 위 예시에서 GraphicEditor는 Shape 클래스를 확장하는 어떤 클래스의 인스턴스도 그릴 수 있음.
새로운 형태의 Shape를 추가하고자 할 때, ex06.GraphicEditor 클래스를 변경할 필요 없이
Shape를 상속받아 새로운 클래스를 만들고 draw 메서드를 구현하기만 하면 됨.
이로써 ex06.GraphicEditor 클래스는 변경에는 닫혀 있으며(코드 변경이 필요 없음),
확장에는 열려 있음(새로운 Shape 타입을 쉽게 추가할 수 있음).
*
* */


import java.awt.*;

public abstract class Ex06Shape {
	public abstract void draw();
}

