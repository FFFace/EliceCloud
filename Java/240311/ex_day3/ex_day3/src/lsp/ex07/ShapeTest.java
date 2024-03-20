package lsp.ex07;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

import org.junit.jupiter.api.Test;

// LSP 위반
public class ShapeTest {
	@Test
	public void testArea() {
		Ex07Rectangle r = new Ex07Rectangle();
		// Ex07Rectangle r = new Ex07Square();
		r.setWidth(5);
		r.setHeight(4);
		assertEquals(20.0, r.area(), "The area should be 20.0");
	}

	// 아버지 a = new 아들();






}
