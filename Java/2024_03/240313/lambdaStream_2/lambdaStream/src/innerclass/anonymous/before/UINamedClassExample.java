package innerclass.anonymous.before;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

// ActionListener 인터페이스를 구현하는 명명된 클래스
class ButtonClickListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭되었습니다!");
	}
}

public class UINamedClassExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("명명된 클래스 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JButton button = new JButton("클릭하세요");

		// ActionListener의 구현체인 ButtonClickListener 인스턴스를 생성하여 버튼에 추가
		button.addActionListener(new ButtonClickListener());

		frame.getContentPane().add(button); // 버튼을 프레임에 추가
		frame.setVisible(true); // 프레임을 화면에 표시
	}
}
