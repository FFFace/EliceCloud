package lsp.ex07;

public class Ex07Square extends Ex07Rectangle {
	@Override
	public void setWidth(double w) {
		super.setWidth(w);
		super.setHeight(w); // 정사각형은 너비와 높이가 같으므로 둘 다 설정함
	}

	@Override
	public void setHeight(double h) {
		super.setWidth(h); // 정사각형은 너비와 높이가 같으므로 둘 다 설정함
		super.setHeight(h);
	}
}
