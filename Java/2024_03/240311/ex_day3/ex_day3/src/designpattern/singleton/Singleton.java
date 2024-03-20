package designpattern.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		// 생성자를 private으로 선언하여 외부에서 인스턴스 생성을 방지
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 여기에 싱글턴 인스턴스가 수행할 기능 추가
}

/*
* 생성자를 private으로 선언하여, 클래스 외부에서 인스턴스를 직접 생성할 수 없도록 합니다.
클래스 내부에 유일한 인스턴스를 저장할 수 있는 private static 변수를 선언합니다.
public static 메소드를 제공하여, 외부에서 이 유일한 인스턴스에 접근할 수 있도록 합니다. 이 메소드는 클래스 내부의 private static 변수에 인스턴스가 이미 생성되었는지 확인하고, 생성되지 않았다면 새로 생성하여 반환합니다.
이렇게 하면 어떤 클래스에서도 getInstance() 메소드를 호출하여 유일한 인스턴스에 접근할 수 있지만, 외부에서는 인스턴스를 직접 생성할 수 없게 됩니다.
*
* */