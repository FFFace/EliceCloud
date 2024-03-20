package innerclass.anonymous.after;

import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("타이머 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);

		// 현재 시간을 표시할 레이블
		JLabel timeLabel = new JLabel("시간이 여기 표시됩니다.", SwingConstants.CENTER);

		// "시작" 버튼
		JButton startButton = new JButton("시작");

		// 버튼 클릭 이벤트 처리를 위한 익명 클래스 리스너
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1초마다 현재 시간을 레이블에 업데이트하는 타이머 생성
				Timer timer = new Timer(1000, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
						timeLabel.setText(formatter.format(new Date()));
					}
				});
				timer.start(); // 타이머 시작
			}
		});

		frame.getContentPane().add(startButton, "North");
		frame.getContentPane().add(timeLabel, "Center");

		frame.setVisible(true);
	}
}

