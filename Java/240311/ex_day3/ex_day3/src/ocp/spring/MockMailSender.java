package ocp.spring;

public class MockMailSender implements MailSender {
	@Override
	public void send(String message) {
		// 테스트 목적의 가짜 메일 보내기 구현
	}
}
