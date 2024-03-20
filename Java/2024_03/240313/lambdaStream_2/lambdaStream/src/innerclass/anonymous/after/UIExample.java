package innerclass.anonymous.after;

import java.awt.event.*;
import javax.swing.*;

public class UIExample {

	public static void main(String[] args) {
		// 프레임 생성
		JFrame frame = new JFrame("익명 클래스 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		// 버튼 생성
		JButton button = new JButton("클릭하세요");

		// 버튼에 익명 클래스를 사용하여 ActionListener 추가
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다!");
			}
		});

		frame.getContentPane().add(button); // 버튼을 프레임에 추가
		frame.setVisible(true); // 프레임을 화면에 표시
	}
}
