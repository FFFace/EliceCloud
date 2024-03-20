/*
* 예를 들어, 게임 개발에서 다양한 종류의 게임을 만든다고 할 때, 각 게임마다 초기화, 게임 시작, 게임 종료 등의 단계가 있을 수 있습니다. 이 때, 공통적인 프로세스를 Game이라는 추상 클래스에서 정의하고, 각 게임에서 이를 상속받아 구체적인 행동을 정의할 수 있습니다.
* 템플릿 메소드 패턴에 대한 클래스 다이어그램을 성공적으로 생성했습니다. 이 다이어그램은 Game이라는 추상 클래스와 이를 상속받는 Cricket 및 Football 클래스의 구조와 관계를 보여줍니다. Game 클래스는 게임의 기본적인 흐름을 정의하는 템플릿 메소드 play()와 이 메소드에서 호출하는 추상 메소드들(initialize(), startPlay(), endPlay())을 포함합니다. Cricket와 Football 클래스는 이러한 추상 메소드들을 각각 구현하여 게임의 특정 행동을 정의합니다.
 * */


package designpattern.template_method.after;

abstract class Game {
	// 템플릿 메소드
	final void play() {
		initialize();
		sayHello();
		startPlay();
		printScore();
		endPlay();
	}

	void sayHello() {
		System.out.println("Hello");
	}
	// 각 단계에 대한 메소드
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	// Hook 메소드
	public void printScore() {
	}

}

